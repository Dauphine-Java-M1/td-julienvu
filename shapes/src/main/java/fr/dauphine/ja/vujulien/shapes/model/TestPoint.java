package fr.dauphine.ja.vujulien.shapes;

import java.util.ArrayList;

public class TestPoint {
	private static int x;
	private static int y;
	//question 7 : déclaration d'une nouvelle variable statique nbpointscrees
	private static int nbpointscrees;
	public TestPoint(int x,int y) {
		this.x=x;
		this.y=y;
		
	}
	public  void TestPoint(int x,int y) {
		this.x=x;
		this.y=y;
		
	}
	public static void main(String[] args) {
	Point point=new Point();
	
	System.out.println("coordonées du point: ("+point.getX()+" ,  "+point.getY()+")");
	
	nbpointscrees++;
	System.out.println("nombre de points crées au total : "+ nbpointscrees);
	Point point1=new Point(6,3);
	
	System.out.println("coordonées du point: ("+point1.getX()+" ,  "+point1.getY()+")");
	
	nbpointscrees++;
	System.out.println("nombre de points crées au total : "+nbpointscrees);
	
	
	
	
	
	}
	
}
