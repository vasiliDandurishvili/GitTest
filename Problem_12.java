import java.awt.Color;
import acm.graphics.GPolygon;
import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem_12 extends GraphicsProgram {
	public void run() {
		GRect myWall = new GRect(800,400);
		add(myWall,600,400);
		
		myWall.setFilled(true);
		myWall.setColor(Color.BLUE);
		
		GLine Roof_1 = new GLine (600,400,1000,200);
		

	}

}