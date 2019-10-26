package com.javacodegeeks.snippets.desktop;
 
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
 
public class MouseMotionListener {

  public static void main(String[] args) {
 
// Create frame with specific title
 
Frame frame = new Frame(" Frame de l'exercice 3 du td mvc");
 
// Create a component to add to the frame; in this case a text area with sample text
 
Component textArea = new TextArea("bougez la souris ici pour voir l'information ");
 
// Add a mouse motion listener to capture mouse motion events
 
textArea.addMouseMotionListener(new MouseMotionAdapter() {
 
    public void mouseMoved(MouseEvent evt) {
 
    TextArea source = (TextArea) evt.getSource();
 
  // Process current position of cursor while all mouse buttons are up.
 
    source.setText(source.getText() + "nMouse moved [" + evt.getPoint().x + "," + evt.getPoint().y + "]");
 
    }
 
    
 
});
 
// Add the components to the frame; by default, the frame has a border layout
 
frame.add(textArea, BorderLayout.NORTH);
 
// Show the frame
 
int largeur = 300;
 
int hauteur = 300;
 
frame.setSize(largeur, hauteur);
 
frame.setVisible(true);
 
  }
 
}