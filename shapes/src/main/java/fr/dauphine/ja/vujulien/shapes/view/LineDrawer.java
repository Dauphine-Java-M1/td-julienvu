package fr.dauphine.ja.vujulien.shapes.view;

import java.awt.Graphics;

import fr.dauphine.ja.vujulien.shapes.model.Point;

public class LineDrawer implements Drawable {
	Point p1;
	Point p2;
	
	public void paintComponent(Graphics g) {
		p1=new Point(1,2);
		p2=new Point(6,4);
		g.drawLine(this.p1.getX(), this.p1.getY(), this.p2.getX(),this.p2.getY());
		
	}
	
}
