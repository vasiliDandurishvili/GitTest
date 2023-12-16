
import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;

//43. წრეწირის drag ით გადაადგილება
public class Problem_43 extends GraphicsProgram {
	private static final int RADIUS = 50;
	private GOval circle;
	private int prevX;
	private int prevY;

	public void run() {
		circle = new GOval(2 * RADIUS, 2 * RADIUS);
		circle.setFilled(true);
		add(circle, getWidth() / 2 - RADIUS, getHeight() / 2 - RADIUS);
		addMouseListeners();

	}

	public void mousePressed(MouseEvent e) {
		GObject obj = getElementAt(e.getX(), e.getY());
		
		if (obj != null) {
			prevX = e.getX();
			prevY = e.getY();
		}
	}

	public void mouseDragged(MouseEvent e) {
		GObject obj = getElementAt(e.getX(), e.getY());
		if (obj != null) {

			// move object
			obj.move(e.getX() - prevX, e.getY() - prevY);

			//update values
			prevX = e.getX();
			prevY = e.getY();
		}
	}
}
