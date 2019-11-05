package fr.dauphine.ja.vujulien.iterables;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Panel {

	private static Iterator<Integer> panel1(final int i,final int j) {
		//Sans classe anonyme
		//int debut=i;
		
		//public boolean hasNext() {
			
		//	return debut<=j;
		//}

		//public Integer next() {
			//if(!hasNext()) {
				//il n'y a plus d'élements 
				//throw new NoSuchElementException();
			//}
			//return debut++;
			
		//}
		//avec classe anonyme question 2
		//commencer par return question1 exercice1
		return new Iterator<Integer>() {
			int debut=i;

			public boolean hasNext() {
				
				return debut<=j;
			}

			public Integer next() {
				if(!hasNext()) {
					//il n'y a plus d'élements 
					throw new NoSuchElementException();
				}
				return debut++;
				
			}
			
		};
		
		
	
		
	}
	//question 3 exercice 1 itérateurs
	public static Iterable<Integer>panel2(final int i,final int j){
		return new Iterable<Integer>() {
			//Override iterator
			public Iterator<Integer> iterator() {
				//retourner le panel1 question 1
				return panel1(i,j);
				// TODO Auto-generated method stub
				
			}
			
		};
	}
	//question 4/5
	public static List<Integer> panel(final int i,final int j){
		return new AbstractList<Integer>() {

			@Override
			public Integer get(int arg0) {
				//on ajoute i par rapport au premier élement
				return i+arg0;
			}

			@Override
			public int size() {
				//on compte le dernier élement
				return j-i+1;
			}
			
		};
	}
	
	public static void main(String[] args) {
		//Iterator<Integer>it= panel1(1,5);
		//for(;it.hasNext();) 
		//	System.out.println(it.next());
		for (int i:panel2(1,5))
			System.out.println(i);
		
		List<Integer> l=panel(3,6);
		for (int i:l) {
			System.out.println(i);
		}
		System.out.println(l.get(0));//3
		System.out.println(l.get(1));//4
		System.out.println(l.get(2));//5

	}

}


