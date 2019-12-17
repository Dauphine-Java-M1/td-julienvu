package fr.dauphine.ja.vujulien.iterables;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Panel {
	
	//question 1 exo 1
	public static Iterator<Integer> panel1(final int deb,final int fin){
		return new PanelIterator(deb,fin);
	}
	
	//question 2 exercice 1
	private static Iterator<Integer> panel1bis(final int i,final int j) {
		
		//avec classe anonyme question 2
		//commencer par return question1 exercice1
		return new Iterator<Integer>() {
			int debut=i;//copie défensive

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
	
	
	//question 3 exercice 1 itérateurs (iterable car for(each)
	public static Iterable<Integer> panel2(final int i,final int j){
		return new Iterable<Integer>() {
			@Override
			public Iterator<Integer> iterator() {
				
				return panel1(i,j);//retourner un itérateur de la question 2
				
				
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
		Iterator<Integer>it= panel1(1,5);
		for(;it.hasNext();) 
			System.out.println(it.next());
		Iterator<Integer>it1= panel1bis(1,5);
		for(;it1.hasNext();) 
			System.out.println(it1.next());
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



