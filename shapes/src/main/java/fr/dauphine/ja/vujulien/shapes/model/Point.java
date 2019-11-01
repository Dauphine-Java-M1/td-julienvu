package Exercice1;

import java.util.ArrayList;

public class Point {
	//exercice 1 Point
	private int x,y;
	
	private static int nombrepoints=0;
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	//question 8
	//ne pas oublier this
	public Point(Point p) {
		this.x=p.x;
		this.y=p.y;
	}
	//question 9
	public String toString() {
		return " ("+ this.x +"  ,"+this.y+ "  )";
		
	}
	public static int getnombrepoints() {
		return nombrepoints++;
		
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x=x;
	}
	public void setY(int y) {
		this.y=y;
	}
	//question 2 exo2
	
	public boolean isSameAs(Point p) {
		if(this.x==p.x && this.y==p.y) {
			return true;
		}
		return false;
	}
	//question 1 exercice 4 première méthode translate
	public void translate(int dx,int dy) {
		this.setX(this.x+dx);
		this.setY(this.y+dy);
	}
	//question 1 exercice 4 deuxième méthode translate
	public Point translate1(int dx,int dy) {
		return new Point(x+dx,y+dy);
	}
	
	public static void main(String[] args) {
		Point p=new Point(1,2);
		
		
		nombrepoints++;
		Point p4=new Point(new Point(1,9));
		nombrepoints++;
		System.out.println(Point.getnombrepoints());
		System.out.println(p.toString());//(1, 2)
		System.out.println(p4.toString());//(1 ,9)
		//exercice 2
		Point p2=p;
		Point p3=new Point(1,2);
		System.out.println(p==p2);//true
		System.out.println(p==p3);//false
		System.out.println(p2.isSameAs(p));//true
		System.out.println(p3.isSameAs(p));//true
		ArrayList<Point >list=new ArrayList();
		list.add(p);
		System.out.println(list.indexOf(p));//0
		//System.out.println(list.indexOf(p3));//moins 1
		
		
		
		
	
	
	}
	
}
