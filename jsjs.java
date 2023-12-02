import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.*;
import acm.util.RandomGenerator;

public class jsjs extends GraphicsProgram {
	private static final double MIN_RADIUS = 10;
	private static final double MAX_RADIUS = 30;
	private static final int NUM_CIRCLES = 20;
	private static final int V_Y = 3;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private double radius;
	private GOval oval;
	private GObject obj1;
	private GObject obj2;
	private boolean check;
	public void run() {
		addMouseListeners();
		check = false;
		for(int i = 0; i < NUM_CIRCLES; i++){
			drawCircle();
		}
		while(check){
			obj1.move(0, V_Y);
			pause(500);
		}
	}
	private void drawCircle() {
		radius = rgen.nextDouble(MIN_RADIUS, MAX_RADIUS);
		oval = new GOval (2 * radius, 2 * radius);
		double x = rgen.nextDouble(0, getWidth() - 2 * radius);
		double y = rgen.nextDouble(0, getHeight() - 2 * radius);
		oval.setFilled(true);
		
		add(oval, x, y);
	}
	public void mouseClicked(MouseEvent e){
		if(obj1 == null && obj2 == null && getElementAt(e.getX(), e.getY()) != null){
			obj1 = getElementAt(e.getX(), e.getY());
			obj1.setColor(rgen.nextColor());
		}
		if(obj1 != null && obj2 == null && getElementAt(e.getX(), e.getY()) == null){
			check = true;
		}
		if(obj1 != null && obj2 == null && getElementAt(e.getX(), e.getY()) != null){
			obj2 = getElementAt(e.getX(), e.getY());
			obj1.move(0, 0);
			obj2.setColor(rgen.nextColor());
			obj1 = obj2;
			obj2 = null;
		}
	}

}
















