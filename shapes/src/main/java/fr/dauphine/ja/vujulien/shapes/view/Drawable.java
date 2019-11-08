package fr.dauphine.ja.vujulien.shapes.view;

import java.awt.Graphics;

import fr.dauphine.ja.vujulien.shapes.model.Shape;

public abstract class Drawable {
	Shape s;
	//public void draw();
	public abstract void paintComponent(Graphics g);
}
