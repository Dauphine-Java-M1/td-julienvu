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


public class RingDrawer  implements Drawable{
	Ring r;
	
	public void paintComponent(Graphics g) {
		Random ralea=new Random();
		int rayoninterne=(int)r.getRayonint();
		int height=(int)r.getRayon();
		int x=r.getCenter().getX();
		int y=r.getCenter().getY();
		
		
		g.drawOval(x, y, rayoninterne, height);
		
		
	}

	
}
