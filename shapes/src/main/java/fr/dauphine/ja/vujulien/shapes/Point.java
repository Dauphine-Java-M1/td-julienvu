package fr.dauphine.ja.vujulien.shapes;

import java.util.ArrayList;

public class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public Point() {
		this.x=0;
		this.y=0;
	}
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public static void main(String [ ]args) {
		
		Point p1=new Point(1,2);
		Point p2=p1;
		//Point p3=new Point(1,2);
		Point p3=p1;
		System.out.println(p1==p2);
		
		System.out.println(p1==p3);
		
		ArrayList<Point> list = new ArrayList<Point>();
		list.add(p1);
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));
		
	}
	
}
