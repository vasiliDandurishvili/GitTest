import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem_12 extends GraphicsProgram {
	
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
		myOval.setColor(Color.BLACK);
		
		
	}
}
