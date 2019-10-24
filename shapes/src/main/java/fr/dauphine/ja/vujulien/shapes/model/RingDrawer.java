package fr.dauphine.ja.vujulien.shapes.model;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import fr.dauphine.ja.vujulien.shapes.view.DrawShape;

public class RingDrawer  implements Drawable{
	private Paint outlinePaint;//outlinePaint
	private Stroke outlineStroke;//outlineStroke
	private Paint fillPaint;//fillPaint
	public RingDrawer(final Paint outlinePaint,
				                        final Stroke outlineStroke,
			            final Paint fillPaint) {
				        this.outlinePaint = outlinePaint;
				        this.outlineStroke = outlineStroke;
				        this.fillPaint = fillPaint;
	}
	//args: graphics:graphics device ,area to draw
	public void draw(final Graphics2D g2D, final Rectangle2D area) {
		final Ellipse2D ellipse = new Ellipse2D.Double(area.getX(), area.getY(), 0, 0);
					          //si fillpaint non null                                       area.getWidth(), area.getHeight());
					        
							if (this.fillPaint != null) {
					            g2D.setPaint(this.fillPaint);
					            g2D.fill(ellipse);
					        }
					        if (this.outlinePaint != null && this.outlineStroke != null) {
					            g2D.setPaint(this.outlinePaint);
					            g2D.setStroke(this.outlineStroke);
					            g2D.draw(ellipse);
					        }
					
					        g2D.setPaint(Color.black);
					        g2D.setStroke(new BasicStroke(1.0f));
					        final Line2D line1 = new Line2D.Double(area.getCenterX(), area.getMinY(),
					                                         area.getCenterX(), area.getMaxY());
					        final Line2D line2 = new Line2D.Double(area.getMinX(), area.getCenterY(),
					                                         area.getMaxX(), area.getCenterY());
					        g2D.draw(line1);
					        g2D.draw(line2);
	}
}
