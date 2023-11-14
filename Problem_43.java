import acm.graphics.*;
import acm.program.GraphicsProgram;
//43. წრეწირის drag ით გადაადგილება
public class Problem_43 extends GraphicsProgram {
	private static final int RADIUS = 50;
	private GOval circle;
	public void run(){
		circle = new GOval(2 * RADIUS, 2 * RADIUS );
		circle.setFilled(true);
		add(circle, getWidth() / - RADIUS,  getHeight() / - RADIUS );
		addMouseListeners();
		
	}

}
