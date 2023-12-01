import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.program.*;

public class jsjs extends GraphicsProgram {
 private int xs;
 private int ys;
 private GLine line;
 
	public void run() {
		xs = ys = 0;
		addMouseListeners();
	}	
	public void mousePressed (MouseEvent e){
		line = new GLine(xs, ys, e.getX(), e.getY());
		add(line);
	}
	public void mouseReleased(MouseEvent e){
		xs = e.getX();
		ys = e.getY();
	}
	public void mouseDragged(MouseEvent e){
		line.setEndPoint(e.getX(),e.getY());
	}
}