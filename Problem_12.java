import java.awt.Color;

import acm.graphics.GTrai;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Problem_12 extends GraphicsProgram {
	public void run() {
		GRect myRect = new GRect(800,400);
		add(myRect,600,400);
		
		myRect.setFilled(true);
		myRect.setColor(Color.BLUE);
		
		GTrai myRoof = new GTrai(800,400);
		add(myRoof,600,400);

	}

}