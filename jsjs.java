import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class jsjs extends GraphicsProgram {
	private static final double RADIUS = 70;
	private static final double vy = 7;
	private GOval circle;

	
	public void run(){
		addMouseListeners();
		
	}
	public void mouseClicked(MouseEvent e){
		removeAll();
		circle = new GOval (2 * RADIUS, 2 * RADIUS);
		circle.setFilled(true);
		double x = e.getX() - RADIUS;
		double y = e.getY() - RADIUS;
		add(circle, x, y);
		while(true){
			circle.move(0, vy);
		}
	}
	
}