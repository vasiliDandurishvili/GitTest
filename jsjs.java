import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class jsjs extends GraphicsProgram{
    GOval oval;
	public void run(){
		addMouseListeners();
	}

	public void mouseMoved(MouseEvent e){
		oval = new GOval (20,20);
		oval.setFilled(true);
		
		double x = e.getX() + 10;
		double y = e.getY() + 10;
		
		add(oval, x, y);
		
	}
}
