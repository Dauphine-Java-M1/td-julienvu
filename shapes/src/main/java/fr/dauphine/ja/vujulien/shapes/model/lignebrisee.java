package fr.dauphine.ja.vujulien.shapes.model;

import java.util.ArrayList;

import java.util.LinkedList;
import java.util.Vector;

public class lignebrisee {
	//private Point[] suitepoints;
	//private ArrayList<Point>suitepoints;
	private LinkedList<Point>suitepoints;
	//private Vector<Point>suitepoints1;
	private int maxPoints;
	//question 1
	public lignebrisee() {
		//suitepoints=new Point[maxPoints];
		//suitepoints=new ArrayList<Point>(maxPoints);
		suitepoints=new LinkedList<Point>();
		
	}
	//question 2 : méthode add
	public void add(Point p){
	//	for(int indice=0;indice<suitepoints.length;indice++) {
		//	suitepoints[indice]=p;
		//}
		//avec une LinkedList
		if(suitepoints==null) {  this.suitepoints=new LinkedList<Point>(); } 
		
			
		
		suitepoints.add(p);
		
		
	}
	
	//question 3
	public void pointCapacity(){
		//return maxPoints;
		//tableau à taille dynamique
		System.out.println(" c'est un tableau à taille dynamique ou il n'y a pas de taille maximale");
	}
	//avec une linkedList
	public int nbPoints() {
		
		return suitepoints.size();
	}
	public boolean contains(Point p) {
		for(Point point: suitepoints) {
			//attention utiliser equals
			if(point.equals(p)) {
				return true;
			}
		}
		return false;
		
	}
	
	
	
	public static void main(String[]args) {
		lignebrisee l=new lignebrisee();
		Point p=new Point(1,2);
		//Point p3=null;
		Point p1=new Point (4,8);
		
		l.add(p);
		System.out.println(l.nbPoints());//1
		//System.out.println(l.pointCapacity());//0
		System.out.println(l.contains(p));//true p contenu dans suitepoints
		//System.out.println(l.contains(p3));//false p1 pas dans suitepoints
		
		
		
	}
}
