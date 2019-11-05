package fr.dauphine.ja.vujulien.shapes.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import fr.dauphine.ja.vujulien.shapes.model.Shape;
import fr.dauphine.ja.vujulien.shapes.model.World;

public class MyDisplay extends JPanel {
	static World world;
	ArrayList<Shape> shapes;
	public MyDisplay(World w) {
		this.world=w;
		this.world.addObserver(this);
	}
	public void painComponent(Graphics g) {
		for(Shape s:shapes) {
			//s.draw();
			
		}
	}
	public static void main(String args[]) {
		JFrame frame = new JFrame("Java Avancé - Graphic Display");
		frame.setSize(new Dimension(500,500));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyDisplay d = new MyDisplay(world);
		frame.add(d);
		//Graphics g = null;
		//d.paintComponent(g);
	
	}
		
}

