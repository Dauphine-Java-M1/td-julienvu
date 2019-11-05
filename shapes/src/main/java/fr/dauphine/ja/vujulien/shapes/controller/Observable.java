package fr.dauphine.ja.vujulien.shapes.controller;

public interface Observable { 
	public void addObserver(Observer obs);
	public void register(Observer obs);
	public void unregister(Observer obs);
	public void notifyObservers();
	public Object getUpdate(Observer obs);
}
