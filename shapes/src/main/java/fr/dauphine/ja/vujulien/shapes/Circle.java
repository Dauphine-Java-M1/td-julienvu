package fr.dauphine.ja.vujulien.shapes;

public class Circle {
 //question 2 exercice 4
	private final Point centre;
	private double rayon;
	public Circle(Point p,double rayon) {
		this.centre=p;
		this.rayon=rayon;
	}
	//question 3 exercice 4
	@Override
	public  String toString() {
		// TODO Auto-generated method stub
		//si on ne met pas getX ni getY , on se trouve avec un affichage de références
		return " le cercle de centre : (" +centre.getX() +"," +centre.getY() +")"  + " a pour rayon " + rayon;
		//attention: mettre override ( garder le même type de retour et garder le même corps
	}
//	public String toString() {
	//	System.out.println(" le cercle  :" +cercle + " a pour rayon " + rayon);
	//}
	//solution résolvant le souci : créer une nouvelle classe de type la classe
	public Circle translate(int deplace) {
		return new Circle(centre,deplace);
		//attention: on garde la même signature que le constructeur Circle qui n'est pas sans argument
	}
	public void translate(int dx,int dy) {
		
		//attention: on garde la même signature que le constructeur Circle qui n'est pas sans argument
		this.centre.setX(this.centre.getX()+dx);
		this.centre.setY(this.centre.getY()+dx);
	}
	//question 7
	public double surface() {
		double sur=Math.PI*rayon*rayon;
		return sur;
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
		Circle c=new Circle(p,1);
		Circle c2=new Circle(p,2);
		//question 7
		c.surface();
		c2.surface();
		//question 8
		c2.contains(p);
		//question 9
		
		
		c2.translate(1,1);//type not applicable pour translate(int,int)inconnu
		//et on risque de déplacer le centre
		System.out.println(c+" "+c2);
		//Circle c=new Circle(p,6);
		System.out.println(c.toString());//exception java.lang.stackOverflowError
		Circle c3=new Circle(new Point(1,2), 1);
		//c3.getCenter().translate(1,1);
		System.out.println(c);
		//pas de translation de point on n'a pas déplacé le cercle
		
	}

	private Point getCenter() {
		
		return centre;
	}
}
