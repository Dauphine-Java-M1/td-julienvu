package fr.dauphine.ja.vujulien.shapes.model;

import java.util.ArrayList;

//délégation 
public class Ring extends Circle {
	private Circle cir;
	private double rayoninterne;
	public Ring() {
		this.cir=new Circle();
		this.rayoninterne=rayoninterne;
	}
	public Ring(Point c,double rayon,double rayoninterne) {
	if(rayoninterne<=rayon) {
		this.cir=new Circle(c,rayon);
		this.rayoninterne=rayoninterne;
		
		
	}else {
		throw new IllegalArgumentException("le rayon interne doit être inférieur au rayon");


	}
	}
	public double getRayonint() {
		return rayoninterne;
	}
	@Override
	public boolean equals(Object anneau){
		if(anneau==this) {
			return true;
		}
		if(anneau instanceof Ring) {
			return true;
		}
		Ring r=(Ring)anneau;
		return this.rayoninterne==r.rayoninterne && this.cir.equals(r.cir);
	}
	
	@Override
	public String toString(){
		return super.toString()+" et comme rayon interne  "+rayoninterne;
	}
	//question 5 contains
	@Override
	public boolean contains(Point p) {
			boolean contenu=false;
			if (! (this.cir.contains(p)))
				contenu=false;
			Circle c = new Circle(this.cir.getCenter(), this.rayoninterne);
			if(! (c.contains(p)))
				contenu=true;
			
			return contenu;
	}
	
	//question 6 contains
	
	public boolean contains(Point p,Ring... rings) {
		for(Ring r:rings) {
			if(r.contains(p)){
				return true;
			}
			
			
		}
		return false;
	}
	
	public static void main(String[ ]args) {
		Point p=new Point(1,18);
		Ring ring1=new Ring(p,54,11);
		Ring ring2=new Ring(p,38,9);
		ring1.contains(p);
		//System.out.println(ring1);
		//System.out.println(ring2);
		ArrayList<Ring>rings=new ArrayList<Ring>();
		rings.add(ring1);
		//rings.add(ring2);
		System.out.println(rings);
		System.out.println(ring1.contains(new Point(6,6)));
		
		
	}
	
	
}
