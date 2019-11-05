package fr.dauphine.ja.vujulien.shapes.view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;


public class PointDrawer implements Drawable {
	public void paintComponent(Graphics g2D) {
		Random r=new Random();
		int x=r.nextInt(25);
		int y=r.nextInt(55);
		g2D.drawLine(x, y, x, y);
		
		
	}
	
}
