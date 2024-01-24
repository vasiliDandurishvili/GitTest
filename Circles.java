import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Circles extends GraphicsProgram {

	private static final double RADIUS = 30;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private GOval oval;
	
	public void run() {
		for (int i = 0; i < 8; i++) {
			double x = rgen.nextDouble(0, getWidth() - 2 * RADIUS);
			double y = rgen.nextDouble(0, getHeight() - 2 * RADIUS);
			GOval oval = new GOval(2 * RADIUS, 2 * RADIUS);
			oval.setFilled(true);
			oval.setColor(rgen.nextColor());
			add(oval, x, y);
		}
		addMouseListeners();
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		GOval o = (GOval)getElementAt(e.getX(), e.getY());
		if (oval == null) {
			oval = o;
		} else {
			if (oval == o) {
				remove(oval);
			} else {
				Color color = oval.getColor();
				oval.setColor(o.getColor());
				o.setColor(color);
			}
			oval = null;
			o = null;
		}
	}
}