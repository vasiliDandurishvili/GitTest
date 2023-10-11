import java.awt.Color;
import acm.graphics.GPolygon;
import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem_12 extends GraphicsProgram {
	public void run() {
		GRect myWall = new GRect(800,400);
		add(myWall,600,400);
		
		myWall.setFilled(true);
		myWall.setColor(Color.YELLOW);
		
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
		
		GLine Wline1_1 = new GLine (825,500,825,650);
		add(Wline1_1);
		
		GLine Wline1_2 = new GLine (750,575,900,575);
		add(Wline1_2);
		
		GLine Wline2_1 = new GLine (1175,500,1175,650);
		add(Wline2_1);
		
		GLine Wline2_2 = new GLine (1100,575,1250,575);
		add(Wline2_2);
		
		GRect myDoor = new GRect(100,150);
		add(myDoor,950,650);
		
		myDoor.setFilled(true);
		myDoor.setColor(Color.BLACK);
		
		GOval myHandle = new GOval(10,10);
		add(myHandle,1020,730);
		
		myHandle.setFilled(true);
		myHandle.setColor(Color.YELLOW);
	}

}