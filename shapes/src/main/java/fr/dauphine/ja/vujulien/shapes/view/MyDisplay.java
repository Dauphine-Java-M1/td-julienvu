package fr.dauphine.ja.vujulien.shapes.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyDisplay extends JPanel {
	
	public void painComponent(Graphics g) {
		g.setColor(Color.orange);
	    g.fillRect(0, 0, getWidth(), getHeight());
	    g.setColor(Color.red);
	}
	public static void main(String args[]) {
		JFrame frame = new JFrame("Java Avancé - Graphic Display");
		frame.setSize(new Dimension(500,500));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyDisplay d = new MyDisplay();
		frame.add(d);
		Graphics g = null;
		d.paintComponent(g);
	
	}
		
}

