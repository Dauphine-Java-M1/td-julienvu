package fr.dauphine.ja.vujulien.shapes.model;

import java.util.ArrayList;

import fr.dauphine.ja.vujulien.shapes.view.MyDisplay;

public class World {
	public ArrayList<Shape>W;
	public World() {
		W=new ArrayList();
	}
	public ArrayList<Shape>getW(){
		return W;
	}
	public void add(Shape s) {
		if(s!=null) {
			W.add(s);
		}else {
			throw new IllegalArgumentException("s can't be null.");
		}
	}
	public String toString() {
		String ch=new String();
		for(Shape s:W) {
			ch+=ch.toString()+"  ";
		}
		return ch;
		
		
	}
	public static void main(String [ ]args) {
		World W=new World();
		Point p1=new Point(1,1);
		Point p2=new Point(4,9);
		lignebrisee l=new lignebrisee();
		l.add(p1);
		l.add(p2);
		Circle c2=new Circle(p2,8);
		Ring r2=new Ring(p2,5.0,3.0);
		//W.add(c2);
		//W.add(r2);
		
		
		
		
	}
}
