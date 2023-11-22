import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class jsjs extends GraphicsProgram {
	private static final double RADIUS = 30;
	private GOval circle;
	private int prevX;
	private int prevY;
	
	public void run(){
		addMouseListeners();
		circle = new GOval (2 * RADIUS, 2 * RADIUS);
		circle.setFilled(true);
		add(circle, getWidth() / 2 - RADIUS, getHeight() / 2 - RADIUS);
	}
	public void mousePressed(MouseEvent e){
		 GObject obj = getElementAt(e.getX(), e.getY());
		
		 if(obj != null){
			 prevX = e.getX();
			 prevY = e.getY();
		 }
	}
	

	public void mouseDrugged(MouseEvent e){
		GObject obj = getElementAt(e.getX(), e.getY());
		
		 if(obj != null){
			 obj.move(prevX - RADIUS, prevY - RADIUS);
			 
			 
		 }
		
	}
}