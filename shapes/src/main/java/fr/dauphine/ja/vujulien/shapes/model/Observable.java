package fr.dauphine.ja.vujulien.shapes.model;

import fr.dauphine.ja.vujulien.shapes.Observer;

public interface Observable {
	public void register(Observer obs);
	public void unregister(Observer obs);
	public void notifyObservers();
	public Object getUpdate(Observer obs);
}
