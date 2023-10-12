import java.awt.Color;
import acm.graphics.GPolygon;
import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Class_Practice_1 extends GraphicsProgram {
	public void run() {
		drawMidLine();
		
		
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
