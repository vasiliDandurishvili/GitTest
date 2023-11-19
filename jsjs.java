import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class jsjs extends GraphicsProgram {
	GLine line;
	public void run(){
		addMouseListeners();
	}
	public void mousePressed(MouseEvent e){
		line = new GLine(e.getX(),e.getY(),e.getX(),e.getY() );
		add(line);
	}
	public void mouseDrugged(MouseEvent e){
		line.setEndPoint(e.getX(), e.getX()Y);
	}
	
}