import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem_12 extends GraphicsProgram {
	
	public void run() {
		GOval myOval = new GOval(100, 200);
		add(myOval,100,100);
		GOval secondOval = new GOval(100, 200);
		add(secondOval,200,200);
	}
}
