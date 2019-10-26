package fr.dauphine.ja.vujulien.shapes.model;

import java.util.ArrayList;

public class World implements Observable{
	ArrayList<Shape>shapes;
	public World() {
		shapes=new ArrayList();
	}
	public void addObserver(Observer obs){
		if (o == null)
        throw new NullPointerException();
	if (!obs.contains(o)) {
    	obs.addElement(o);
}
	}
	public void register(Observer obs){
		register(obs);
	}
	public void unregister(Observer obs){
		unregister(obs);
	}
	public void notifyObservers(){

	}
	public Object getUpdate(Observer obs){
		
	}
}
