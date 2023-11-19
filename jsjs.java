import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class jsjs extends GraphicsProgram {
	private static final double RADIUS = 30;
	GOval oval;
	public void run(){
		addMouseListeners();
	}

	public void mouseDrugged(MouseEvent e){
		removeAll();
		oval = new GOval(2 * RADIUS, 2 * RADIUS);
		double x = e.getX() - RADIUS;
		double y = e.getY() - RADIUS;
		
		add(oval,x, y);
	}
}