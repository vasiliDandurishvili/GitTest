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
		
		GLine Roof_1 = new GLine (600,400,1000,100);
		add(Roof_1);
		GLine Roof_2 = new GLine (1000,100,1400,400);
		add(Roof_2);
		
		GRect myWindow = new GRect(200,200);
		add(myWindow,700,500);

		myWindow.setFilled(true);
		myWindow.setColor(Color.WHITE);
	}

}