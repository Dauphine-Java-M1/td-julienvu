package fr.dauphine.ja.vujulien.shapes.view;

import java.awt.BasicStroke;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.Random;

import fr.dauphine.ja.vujulien.shapes.model.Circle;


public class CircleDrawer  extends Drawable{
	Circle c;
	public CircleDrawer() {
		this.c=new Circle();
	}
	public CircleDrawer(Circle c) {
		this.c=c;
	}
	public void paintComponent(Graphics g) {
		int x=(int) (c.getCenter().getX()-c.getRayon());
		int y=(int)(c.getCenter().getY()-c.getRayon());
		int rayon=(int)(2*c.getRayon());
		int height=(int)(2*c.getRayon());
		g.drawOval(x,y,rayon,height);
		
	}
	
}
