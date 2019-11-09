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
	World world;
	ArrayList<Shape> shapes;
	public MyDisplay(World w) {
		this.world=w;
		//this.world.addObserver(this);
	}
	public MyDisplay(){
		this.world=new World();
	}
	public void painComponent(Graphics g) {
		for(Shape s:this.world.getW()) {
			s.draw(g);
			
		}
	}
	public static void main(String args[]) {
		JFrame frame = new JFrame("Java Avancé - Graphic Display");
		frame.setSize(new Dimension(500,500));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		World world = new World();
		Point p1 = new Point(200,600);
		Point p2 = new Point(540,510);
		LigneBrisee l = new LigneBrisee();
		l.add(p1);
		Circle c=new Circle(p1,150);
		Circle c2=new Circle(p2,100);
		world.add(l);
		world.add(c2);
		System.out.println(world);
		MyDisplay d=new MyDisplay(world);
		frame.add(d);
	
	}
		
}

