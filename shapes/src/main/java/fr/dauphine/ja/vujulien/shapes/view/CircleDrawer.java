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


public class CircleDrawer  implements Drawable{
	Circle c;
	public void paintComponent(Graphics g) {
		Random ralea=new Random();
		
		int height=(int)c.getRayon();
		int x=c.getCenter().getX();
		int y=c.getCenter().getY();
		
		
		int width=ralea.nextInt(height);
		g.drawOval(x, y,width, height);
		
	}
	
}
