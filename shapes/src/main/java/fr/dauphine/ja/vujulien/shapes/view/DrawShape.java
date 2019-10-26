package fr.dauphine.ja.vujulien.shapes.view;

import java.awt.Graphics;

public class DrawShape  extends MyDisplay{
	Shape s;
	public DrawShape(){
		s=new Shape();
	}
	public void paintComponent(Graphics g) {
	}
	public void notifyObservers(){
		
	}
}
