package fr.dauphine.ja.vujulien.threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MySafeList extends  ArrayList<Double>{
	private Object monitorAdd = new Object();
	
	
	//méthode ajout de double
	@Override
	public boolean add (Double d) {
		
			return super.add(d);
		
	}
	
	
	//Méthodes get et size à implémenter donc mieux vaut faire de l'héritage
	
	//méthode size
	@Override
	public synchronized int size() {
		
		return super.size();
	}
	
	
	//méthode d'accès à un élément de la liste l
	
	@Override
	public synchronized Double get(int position) {
		
		return super.get(position);
	}
	
	//Exercice 2 question 2
	
		public static  boolean stressTest(int n,final int m) throws InterruptedException {
				
			final MySafeList listthreads=new MySafeList();//create n threads 
			Thread[] threads=new Thread[n];
		
			for(int i=0;i<n;i++) {
				threads[i]=new Thread(new Runnable() {
					public void run() {
						for (int j=0;j<m;j++) {
							listthreads.add(2.0);
						}
					}
				});
				
				
				
			}
			for(int i=0;i<n;i++) {
				threads[i].start();
			
				
			}
			for(int i=0;i<n;i++) {
				threads[i].join();
			
				
			}
			System.out.println("List size is " +listthreads.size() + " and should be " + n * m);
			//si taille de l différent du produit n*m
			

			
				return listthreads.size()==n*m;
				
				
		}
	//Exercice 3 question 1
	public static double scalar(MySafeList v1,MySafeList v2) {
		//si v1 et v2 de tailles différentes
		if(v1.size()!=v2.size()) {
			throw new IllegalArgumentException("v1 et v2 doivent être de même dimension");
		}
		
		double prod=0;
		
		
        
        for (int i = 0; i < v1.size(); i++) {
            prod+= (v1.get(i) * v2.get(i));
        }
        
		return prod;
		
	}
	
	//Exercice 3 question 2
	
	
	public static MySafeList scalarAlea(int n) {
		//avec vecteurs aléatoires
		Random r=new Random();
		MySafeList mysafe=new MySafeList();
		for(int indice=0;indice<n;indice++) {
			mysafe.add(r.nextDouble());
		}
		return mysafe;
		
		
	}
	
	
	//Exercice 3 question 3
	
	
		public static double scalarParallele(MySafeList l1,MySafeList l2,int begin,int end) {
			
			//sans argument
			//si v1 et v2 de tailles différentes
			if(l1.size()!=l2.size()) {
				throw new IllegalArgumentException("v1 et v2 doivent être de même dimension");
			}
			//si begin est un indice négatif et end supérieure à la taille maximale de la liste
			if(begin<0 || end> l1.size()|| end> l2.size()) {
				throw new IllegalArgumentException("begin et end must be redefined");
			}
			
			double prod=0.0;
			for(int i=begin;i<end;i++) {
				prod+=(l1.get(i)*l2.get(i));
			}
			
			return prod;
			
		}
	
	//exercice 3 question 4
		
	//voir classe ScalarThread	
		
	//exercice 3 question 5
		public static double parallelScalar(MySafeList v1, MySafeList v2, int n) {
	        ScalarThread[] threads = new ScalarThread[n];
	        int portionLength = v1.size() / n;
	        double res = 0;

	        // Create n threads
	        for (int decomp = 0; decomp < n - 1; decomp++) {
	            threads[decomp] = new ScalarThread(v1, v2, decomp * portionLength, (decomp + 1) * portionLength);
	            threads[decomp].start();
	        }
	        threads[n - 1] = new ScalarThread(v1, v2, (n - 1) * portionLength, v1.size());
	        threads[n - 1].start();

	        // Sum the results
	        try {
	            for (int i = 0; i < n; i++) {
	                threads[i].join();
	                res += threads[i].getResult();
	            }

	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        return res;
	    }

	public static void main(String []args) throws InterruptedException {
		long debut;
        long fin;
        long time;
        double res;
        int n = 10000;
        MySafeList myList1 = scalarAlea(n);
        MySafeList myList2 = scalarAlea(n);
		
		//test question 3 exercice 2
		
		System.out.println("résultat de stressTest avec n=2 et m=3: "+stressTest(2,3));//true
		System.out.println("résultat de stressTest avec n=2 et m=6: "+stressTest(6,6));//true
		System.out.println("résultat de stressTest avec n=2 et m=1: "+stressTest(2,1));//true
		
		
		//test question 1 exercice 3
		MySafeList v1=new MySafeList();
		MySafeList v2=new MySafeList();
		v1.add(1.0);
		v1.add(1.0);
		v2.add(6.0);
		v2.add(1.0);
		
		System.out.println("le produit scalaire entre 0 et n-1 entre deux vecteurs arbitraires vaut: "+MySafeList.scalar(v1, v2));//7.0
		//System.out.println(MySafeList.scalar(v1, v2));//9.0
		
		//test question 2 exercice 3
		
		
		System.out.println("le produit scalaire entre 0 et n-1 entre deux vecteurs arbitraires vaut: "+MySafeList.scalarAlea(2));//[0.6227393290943323, 0.8874681002469953]
		
		//test question 2 exercice 3
	//	MySafeList l1=;
	//	MySafeList l2=;
		//System.out.println("le produit scalaire entre 0 et n-1 entre deux vecteurs aléatoires vaut: "+MySafeList.scalarAlea(l1,l2));
		
		
		//test question 3 exercice 3
	//	MySafeList l3=;
	//	MySafeList l4=;
		//System.out.println("le produit scalaire entre begin et end vaut: "+  MySafeList.scalarParallele(l3,l4, 1, 3));

        for (int i = 1; i <= 20; i++) {
            debut = System.nanoTime();
            res = parallelScalar(myList1, myList2, i);
            fin = System.nanoTime();
            time = fin - debut;
            System.out.println("i=" + i + " | res : " + res + " , time : " + time * 10E-9);
        }

        System.out.println("=============================================");
        debut = System.nanoTime();
        res = scalarParallele(myList1, myList2, 0, n);
        fin = System.nanoTime();
        time = fin - debut;
        System.out.println("Ground truth | res : " + res + ", time : " + time * 10E-9);

		
		
	}
	
	
	
	
}
