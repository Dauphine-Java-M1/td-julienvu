package fr.dauphine.ja.vujulien.shapes.model;

import java.awt.Point;
import java.util.ArrayList;

public abstract class Shape {
	Point center;
    ArrayList<Shape> shapes;
	public void addShape(Shape s) {
		shapes.add(s);
		notifyObserver();
		
		
		
	}
	protected abstract void notifyObserver();
	public void draw() {
		
	}
}
