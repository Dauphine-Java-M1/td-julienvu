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

import fr.dauphine.ja.vujulien.shapes.model.Ring;


public class RingDrawer  extends Drawable{
	Ring r=new Ring();
	public RingDrawer() {
		this.r=r;
	}
	public void paintComponent(Graphics g) {
		Random ralea=new Random();
		int rayon=(int)(2*r.getRayon());
		int height=(int)(2*r.getRayon());
		int rayoninterne=(int)(2*r.getRayonint());
		int heightint=(int)(2*r.getRayonint());
		int x=(int) (r.getCenter().getX()-r.getRayon());
		int y=(int)(r.getCenter().getY()-r.getRayon());
		
		
		g.drawOval(x, y, rayoninterne, heightint);
		g.drawOval(x,y,rayon,height);
		
		
	}

	
}
