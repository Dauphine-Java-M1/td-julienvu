package fr.dauphine.ja.vujulien.iterables;

import java.util.Iterator;

public class PanelIterator implements Iterator<Integer> {
	private int deb,fin;
	public PanelIterator(int deb,int fin) {
		this.deb=deb;
		this.fin=fin;
	}
	@Override
	public boolean hasNext() {
		
		return this.deb<=this.fin;
	}

	@Override
	public Integer next() {
		int valeur=this.deb;
		this.deb++;
		return valeur;
	}
	public void remove() {
		
	}

}
