import java.awt.Color;
import acm.graphics.GPolygon;
import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Class_Practice_1 extends GraphicsProgram {
//	private static final double PI = 3.14;
	private static final double HOUSE_WIDTH = 200;
	private static final double HOUSE_HEIGHT = 300;
	private static final double DOOR_WIDTH = 40;
	private static final double DOOR_HEIGHT = 60;
	private static final double ROOF_HEIGHT = 100;
	
	public void run() {
//		PI = 3;
//		drawMidLine();
		drawHouse();
		
	}
	private void drawHouse() {
		drawWall();
		drawRoof();
//		drawDoor();
//		drawWindowa();
		
	}
	private void drawRoof() {
		double x1 = (int) (getWidth()/ 2 -HOUSE_WIDTH / 2);
		double y1 = getHeight() - HOUSE_HEIGHT;
		double x2 = x1 +HOUSE_WIDTH/2;
		double y2 = y1 - ROOF_HEIGHT ;
		GLine leftRoof = new GLine(x1, y1, x2, y2);
		add(leftRoof);

		
	}
	private void drawWall() {
		GRect wall = new GRect (HOUSE_WIDTH, HOUSE_HEIGHT);
		int x = (int) (getWidth() / 2 - HOUSE_WIDTH) ;
		double y = getHeight()-HOUSE_HEIGHT;
		add(wall, x, y);
		
	}
	private void drawMidLine() {
		double x1 = 0;
		double y1 = getHeight() / 2;
		double x2 = getWidth();
		double y2 = y1;
		GLine line = new GLine(x1, y1, x2, y2);
		add(line);
	}
}
		
//		int a = 5;
//		a=a + 5;
//		
//		if(2 == 2){
//			double b = 3;
//			b = 4;
//			b = a + 3;
//			
//			
////			int a = 7 mistake
//			GLabel label = new GLabel("a:" + a, 20, 20);
//			add(label);
//			a = 3;
//		}
//		
////		b = b + 1
//	}	
//	
//	
//	private void testVoid(){
//		int a = 7;
//		
