package fr.dauphine.ja.vujulien.iterables;

import java.util.Iterator;


//question 1 exercice 1
public class PanelIterator implements Iterator<Integer> {
	private int deb,fin;
	public PanelIterator(int deb,int fin) {
		this.deb=deb;
		this.fin=fin;
	}
	public boolean hasNext() {
		
		return deb<fin;
	}

	public Integer next() {
		
		return deb++;
	}
	
	//
	
	
	

}

