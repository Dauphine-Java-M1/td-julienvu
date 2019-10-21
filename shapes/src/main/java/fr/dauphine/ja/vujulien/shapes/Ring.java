package fr.dauphine.ja.vujulien.shapes;

//délégation 
public class Ring extends Circle {
	private Circle cir;
	private double rayoninterne;
	private double rayon;
	public Ring(Point c,double rayon,double rayoninterne) {
	if(rayoninterne<=rayon) {
		this.cir=new Circle(c,rayon);
		this.rayoninterne=rayoninterne;
		this.rayon=rayon;
		
	}else {
		throw new IllegalArgumentException("le rayon interne doit être inférieur au rayon");


	}
	}
	public Ring() {
		this.cir=cir;
		this.rayoninterne=rayoninterne;
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
		return this.cir=anneau.cir && this.rayon=anneau.rayon   &&this.rayoninterne=anneau.rayoninterne;
	}
	}
	@Override
	public String toString(){
		return super.toString()+"rayon interne"+rayoninterne;
	}
	//question 5 contains
	@Override
	public boolean contains(Point p) {
		if((p.getX()-centre.getX())**2+(p.getY()-centre.getY())**2<=rayon**2 &&(p.getX()-centre.getX())**2+(p.getY()-centre.getY())**2>=rayoninterne) {
			return true;
		}
		return false;
		
		
	}
	
	//question 6 contains
	@Override
	public boolean contains(Point p,Ring... rings) {
		for(Ring r:rings) {
			if((r.contains(p)){
				return true;
			}
			return false;
			
		}
	}
	
	public static void main(String[ ]args) {
		Point p=new Point(p,4)
		Ring ring1=new Ring(p,4,1);
		Ring ring2=new Ring(p,8,9);
		ring.contains(p);
		System.out.println(ring1);
		System.out.println(ring2);
		ArrayList<Ring>rings=new ArrayList<Ring>();
		rings.add(ring1);
		rings.add(ring2);
		System.out.println(ring1.contains(new Point(6,6),rings));
		
		
	}
	
	
}
