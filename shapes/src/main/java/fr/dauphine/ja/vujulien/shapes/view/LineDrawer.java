package fr.dauphine.ja.vujulien.shapes.view;

import java.awt.Graphics;

import fr.dauphine.ja.vujulien.shapes.model.Point;
import fr.dauphine.ja.vujulien.shapes.model.lignebrisee;

public class LineDrawer extends Drawable {
	lignebrisee l=new lignebrisee();
	public LineDrawer(lignebrisee l) {
		this.l=l;
	}
	public void paintComponent(Graphics g) {
		int taille=l.nbPoints();
		int debut=0;
		Point p1,p2;
		while(debut<taille-1) {
			p1=l.get(debut++);
			p2=l.get(debut);
			g.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
		}
	}
	
}
