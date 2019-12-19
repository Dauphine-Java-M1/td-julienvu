package fr.dauphine.ja.vujulien.threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MySafeList extends  ArrayList<Double>{
	
	private static int n;
	private ArrayList<Double> l;
	
	
	public MySafeList(int n) {
		
		this.n=n;
		l=new ArrayList<Double>(n);
		
		
	}
	
	//méthode ajout de double
	@Override
	public boolean add (Double d) {
		
			return super.add(d);
		
	}
	
	
	//Méthodes get et size à implémenter donc mieux vaut faire de l'héritage
	
	//méthode size
	@Override
	public synchronized int size() {
		
		return l.size();
	}
	
	
	//méthode d'accès à un élément de la liste l
	
	@Override
	public synchronized Double get(int position) {
		
		return super.get(position);
	}
	
	
	//Exercice 3 question 1
	public static double scalar(MySafeList v1,MySafeList v2) {
		//si v1 et v2 de tailles différentes
		if(v1.size()!=v2.size()) {
			throw new IllegalArgumentException("v1 et v2 doivent être de même dimension");
		}
		
		double prod=0;
		
		for(int i=0;i<n;i++) {
			
			
				prod += v1.get(i)* v2.get(i);
			
			
		}
		return prod;
		
	}
	
	//Exercice 3 question 2
	
	
	public static double scalarAlea(MySafeList l1,MySafeList l2) {
		//avec vecteurs aléatoires
		//si v1 et v2 de tailles différentes
		if(l1.size()!=l2.size()) {
			throw new IllegalArgumentException("v1 et v2 doivent être de même dimension");
		}
		
		double prod=0;
		Random r=new Random();
		Double suiv=r.nextDouble();//entier aléatoire
		for(int ajout=0;ajout<n;ajout++) {
			  	l1.add(suiv);
			  	l2.add(suiv);
		}
		
		//produit scalaire
		for(int indvec=0;indvec<n;indvec++) {
			
			prod += l1.get(indvec)*l2.get(indvec);
		}
		return prod;
		
	}
	
	
	//Exercice 3 question 3
	
	
		public static double scalarParallele(MySafeList l1,MySafeList l2,int begin,int end) {
			
			//sans argument
			//si v1 et v2 de tailles différentes
			if(l1.size()!=l2.size()) {
				throw new IllegalArgumentException("v1 et v2 doivent être de même dimension");
			}
			//si begin est un indice négatif et end supérieure à la taille maximale de la liste
			if(begin<0 || end> n) {
				throw new IllegalArgumentException("begin et end must be redefined");
			}
			
			double prod=0;
			Random r=new Random();
			Double suiv=r.nextDouble();//entier aléatoire
			for(int ajout=0;ajout<n;ajout++) {
				  	l1.add(suiv);
				  	l2.add(suiv);
			}
			//produit scalaire entre l1 et l2
			for(int indvec=begin;indvec<=end;indvec++) {
				
				prod += l1.get(indvec)*l2.get(indvec);
			}
			return prod;
			
		}
	
	//Exercice 2 question 2
		
	public synchronized  boolean stressTest(int n,int m) {
			
		List<Thread>t=new ArrayList<Thread>();
		try {
				synchronized(t) {
					for(int i=0;i<n;i++) {
						Thread t1=new Thread();
						t.add(t1);
						t1.start();
						t1.join();
					}
					
					//ajout des m entiers 
					for(int j=0;j<m;j++) {
						l.add((double) j);
					}
					//si taille de l différent du produit n*m
					if(l.size()!=n*m) {
						return false;
					}
				}
		}catch(InterruptedException e) {
				e.printStackTrace();
			}
			return true;
			
			
	}
	public static void main(String []args) {
		
		
		//test question 3 exercice 2
		MySafeList l=new MySafeList(3);
		l.add(2.1);
		l.add(234.23);
		l.add(15.1);
		System.out.println("résultat de stressTest avec n=2 et m=3: "+l.stressTest(2,3));//true
		System.out.println("résultat de stressTest avec n=2 et m=6: "+l.stressTest(2,6));//true
		System.out.println("résultat de stressTest avec n=2 et m=1: "+l.stressTest(2,1));//false
		
		
		//test question 1 exercice 3
		MySafeList v1=new MySafeList(3);
		MySafeList v2=new MySafeList(3);
		
		
		
		v1.add(3.0);
		v1.add(3.0);
		v1.add(3.0);
		v2.add(1.0);
		v2.add(1.0);
		v2.add(1.0);
		System.out.println(MySafeList.scalar(v1, v2));//9.0
		
		//test question 1 exercice 3
		MySafeList v4=new MySafeList(4);
		MySafeList v5=new MySafeList(4);
		v4.add(3.0);
		v4.add(2.0);
		v4.add(1.0);
		v4.add(4.0);
		v5.add(1.0);
		v5.add(2.0);
		v5.add(3.0);
		v5.add(5.0);
		System.out.println("le produit scalaire entre 0 et n-1 entre deux vecteurs arbitraires vaut: "+MySafeList.scalar(v4, v5));//30.0
		
		//test question 2 exercice 3
		MySafeList l1=new MySafeList(n);
		MySafeList l2=new MySafeList(n);
		System.out.println("le produit scalaire entre 0 et n-1 entre deux vecteurs aléatoires vaut: "+MySafeList.scalarAlea(l1,l2));
		
		
		//test question 3 exercice 3
		MySafeList l3=new MySafeList(n);
		MySafeList l4=new MySafeList(n);
		System.out.println("le produit scalaire entre begin et end vaut: "+  MySafeList.scalarParallele(l3,l4, 1, 3));


		
		
	}
	
	
	
	
}
