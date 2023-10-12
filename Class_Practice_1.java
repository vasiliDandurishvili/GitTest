import java.awt.Color;
import acm.graphics.GPolygon;
import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Class_Practice_1 extends GraphicsProgram {
	public void run() {
		int a = 5;
		a=a + 5;
		
		if(2 == 2){
			double b = 3;
			b = 4;
			b = a + 3;
			
			
//			int a = 7 mistake
			GLabel label = new GLabel("a:" + a, 20, 20);
			add(label);
			a = 3;
		}
		
//		b = b + 1
	}	
	
	
	private void testVoid(){
		int a = 7;
		
	}
}