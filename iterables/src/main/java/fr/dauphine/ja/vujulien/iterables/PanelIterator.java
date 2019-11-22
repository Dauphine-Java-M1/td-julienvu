package fr.dauphine.ja.vujulien.iterables;

import java.util.Iterator;

public class PanelIterator implements Iterable<Integer> {
	 int deb,fin;
	public PanelIterator(int deb,int fin) {
		this.deb=deb;
		this.fin=fin;
	}
	
	public static Iterator<Integer> panel1(final int deb,final int fin) {
			return new Iterator<Integer>() {
				int compteur=deb;//copie défensive ( deb final)

				@Override
				public boolean hasNext() {
					
					return compteur<=fin;
				}

				@Override
				public Integer next() {
					//int valeur=deb;
					//compteur++;
					return compteur++;
				}
		
		}; 
	}

	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
