package fr.dauphine.ja.vujulien.shapes;

public class Circle {
 //question 2 exercice 4
	private  Point centre;
	private double rayon;
	public Circle() {
		centre=new Point();
		this.rayon=3.0;
	}
	public Circle(Point centre,double rayon) {
		this.centre=centre;
		this.rayon=rayon;
	}
	public void setCenter(){
		this.centre = centre;
	}
	public double getRayon() {
		return rayon;
	}
	public String toString() {
		return " le cercle de centre  :" + this.getCenter() + " a pour rayon " +  rayon + " et de  surface :"+ this.surface();
	}
	//solution résolvant le souci : créer une nouvelle classe de type la classe
	public Circle translate(int deplace) {
		return new Circle(centre,deplace);
		//attention: on garde la même signature que le constructeur Circle qui n'est pas sans argument
	}
	public void translate(int dx,int dy) {
		
		//attention: on garde la même signature que le constructeur Circle qui n'est pas sans argument
		this.centre.setX(this.centre.getX()+dx);
		this.centre.setY(this.centre.getY()+dy);
	}
	//question 7
	public double surface() {
		double sur=Math.PI*this.rayon*this.rayon;
		return sur;
	}
	@Override
	public boolean equals(Object o){
		if (!(o instanceof Circle))
			return false;
		Circle cer = (Circle) o;
		return this.rayon == cer.rayon && this.centre.equals(cer.getCenter()) ;
	}
	
	//question 8
	public boolean contains(Point p) {
		if((p.getX()-centre.getX())*(p.getX()-centre.getX())+(p.getY()-centre.getY())*(p.getY()-centre.getY())<= rayon*rayon)
		{
			return true;
		}
		return false;
	}
	//question 9
	public  boolean contains(Point p, Circle...circles) {
		for(Circle cercle:circles)
		{
			if(cercle.contains(p)) {
		
				return true;
			}
		}
		return false;
		
	}
	public static void main(String[]args) {
		//Point p=new Point(1,2);
		Point p=new Point(1,2);
		Circle c=new Circle(p,5);
		Circle c2=new Circle(p,7);
		System.out.println(c.toString());
		System.out.println(c2.toString());
		c2.translate(1,1);//type not applicable pour translate(int,int)inconnu
		//et on risque de déplacer le centre
		//System.out.println(c+" "+c2);
		//Circle c=new Circle(p,6);
		//System.out.println(c.toString());//exception java.lang.stackOverflowError
		Circle c3=new Circle(new Point(1,2), 1);
		//c3.getCenter().translate(1,1);
		System.out.println(c3.toString());
		//pas de translation de point on n'a pas déplacé le cercle
		
	}

	public Point getCenter() {
		
		return this.centre;
	}
	
}
