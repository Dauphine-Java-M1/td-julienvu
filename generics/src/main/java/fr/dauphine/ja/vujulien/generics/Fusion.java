package fr.dauphine.ja.vujulien.generics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;



public class Fusion  {
	//method fusion attention aux brackets devant le type paramétré T
	public static  <T> List<T> Fusion(List<? extends T> L1,List<? extends T> L2){
		int curseuralternance=0;//variable int qui va ajouter dans la liste finale fusionnée
		//soit l'un des élements de la liste L1 ou soit celui de la liste L2
		//si L1 et L2 sont de tailles différentes, on retourne une exception
		if(L1.size()!=L2.size()) {
			throw new IllegalArgumentException("L1 must be different size to L2");//throw new syntax java
		}
		//si L1 est vide
		if(L1.isEmpty()|| L2.isEmpty() ) {
			return Collections.<T>emptyList();//objet immutable ou on ne peut pas ajouter d'objets dedans
		}
		//déclaration des itérateurs iter1 et iter2
		Iterator<? extends T> iter1=L1.iterator();
		Iterator<? extends T> iter2=L2.iterator();
		List<T> solutionfusion=new ArrayList<T>();//attention mettre arrayList à droite du =
		// par polymmorphisme
		// on peut sauvegarder les objets des classes filles dans le type T
		while(iter1.hasNext()) {
			
			//ajoute les élements L1 et L2 selon la variable curseuralternance
			//si on est sur une position paire
			if(curseuralternance++%2==0) {
				if(iter1.hasNext()) {
					solutionfusion.add(iter1.next());
				}else {
					solutionfusion.add(iter2.next());
				}
			}else {
				if(iter1.hasNext()) {
					solutionfusion.add(iter2.next());
				}else {
					solutionfusion.add(iter1.next());
				}
			}
			
			solutionfusion.add(iter1.next());//iter1.next() de type Object
			solutionfusion.add(iter2.next());//iter2.next() de type Object
			
			
		}
		//on est sorti de la liste L1 on retourne la liste fusionnée solutionfusion
		return solutionfusion;
		
		
		
		
		
	}
	public static void main(String[] args) {
		List<String> l1=  Arrays.asList("C", "rc");
		List<StringBuilder> l2= Arrays.asList(new StringBuilder("a ma"), new StringBuilder("he!"));
		List<? extends CharSequence> r1=Fusion(l1,l2);
		System.out.println(r1);
		List<?> r2=Fusion(l1,l2);
		System.out.println(r2);
		List<Integer> l3 =  Arrays.asList(1,2);
		List<Integer> l4 = Arrays.asList(10,20);
		List<Integer> r3 = Fusion(l3,l4);
		System.out.println(r3);
		List<?> r4 = Fusion(l1,l3);
		System.out.println(r4);
	}
}
