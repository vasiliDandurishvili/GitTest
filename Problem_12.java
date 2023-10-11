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
		
		GRect myWindow_1 = new GRect(150,150);
		add(myWindow_1,750,500);

		myWindow_1.setFilled(true);
		myWindow_1.setColor(Color.WHITE);
		
		GRect myWindow_2 = new GRect(150,150);
		add(myWindow_2,1100,500);

		myWindow_2.setFilled(true);
		myWindow_2.setColor(Color.WHITE);
		
		GLine Wline = new GLine (825,500,825,650);
		add(Wline);
		
		
	}

}