import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class practice_circle extends GraphicsProgram {
	
	public void run() {
		GOval myOval = new GOval(100, 200);
		add(myOval,100,100);
//		GOval secondOval = new GOval(100, 200);
		
		myOval =new GOval(100, 200);
		add(myOval ,200,200);
		
		
		GOval oldBall = myOval;
		
		myOval = new GOval(100,200,200,300);
		add(myOval);
		
		myOval.setFilled(true);
		myOval.setColor(Color.RED);
		
		oldBall.setFilled(true);
	}
}
//public void run() {
//	int a = 5;
//	a=a + 5;
//	
//	if(2 == 2){
//		double b = 3;
//		b = 4;
//		b = a + 3;
//		
//		
////		int a = 7 mistake
//		GLabel label = new GLabel("a:" a, 20, 20);
//		add(label);
//		a = 3;
//	}
//	
////	b = b + 1
//}	
//
//
//private void testVoid(){
//	int a = 7;
//	
