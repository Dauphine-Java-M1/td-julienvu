package fr.dauphine.ja.vujulien.iterables;

import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class Mult {
	//question 1 exercice 2
	public static List<Integer>mulT(final int coeff,List<Integer>liste){
		//création une nouvelle liste newlist
		List<Integer>newlist = new ArrayList<Integer>();
		for(int i=0;i<liste.size();i++) {
			int value=liste.get(i)*coeff;
			newlist.add(value);
		}
		return newlist;
		
	}
	//question 2 exercice 2
	public static List<Integer>mult1(final int coeff,final List<Integer>liste){
		return new AbstractList<Integer>() {

			@Override
			public Integer get(int indice) {
				// TODO Auto-generated method stub
				return liste.get(indice)*coeff;
			}

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return liste.size();
			}
			
		};
	}
	public static List<Integer>mult(final int coeff,final List<Integer>liste){
		if(liste instanceof RandomAccess) 
		return new AbstractList<Integer>() {

			@Override
			public Integer get(int arg0) {
				// TODO Auto-generated method stub
				return liste.get(arg0)*coeff;
			}

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return liste.size();
			}
			
		};
		
		return new AbstractSequentialList<Integer>() {

			public ListIterator<Integer> listIterator(final int index) {
				// TODO Auto-generated method stub
				return new ListIterator<Integer>() {
					ListIterator<Integer> it=liste.listIterator(index);
					public void add(Integer entier) {
						
						it.add(entier);
					}

					public boolean hasNext() {
						
						return it.hasNext();
					}

					public boolean hasPrevious() {
						
						return it.hasPrevious();
					}

					public Integer next() {
						
						return it.next()*coeff;
					}

					public int nextIndex() {
						
						return it.nextIndex();
					}

					public Integer previous() {
						
						return it.previous();
					}

					public int previousIndex() {
						
						return it.previousIndex();
					}

					public void remove() {
						
						it.remove();
					}

					public void set(Integer entier) {
						
						it.set(entier);
					}
					
			
				
			
		};
	}
		
		public int size() {
			return liste.size();
		}
	
		};
		}
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		//question 1 exercice 2
		l1.add(new Integer(2));
		l1.add(new Integer(3));
		l1.add(new Integer(6));
		
		List<Integer>l=mult(3,l1);
		for(int i:l) {
			System.out.println(i);//9 18 21
		}
		List<Integer>l3=mulT(3,l1);
		for(int i:l3) {
			System.out.println(i);//9 18 21
		}
		//System.out.println(l3.get(2));
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < 1000000; i++) {
		al.add(i);
		}
		long t0 = System.nanoTime();
		List<Integer> ret = Mult.mult(2, al);
		long sum=0;
		for(int val : ret) {
		sum+=val/2;
		}
		System.out.println((System.nanoTime() - t0));
		LinkedList<Integer> ll = new LinkedList<Integer>();
		for (int i = 0; i < 1000000; i++) {
		ll.add(i);
		}
		t0 = System.nanoTime();
		sum=0;
		ret = Mult.mult(2, ll);
		for(int val : ret) {
		sum+=val/2;
		}
		System.out.println((System.nanoTime() - t0));
		
	}
}

