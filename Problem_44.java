import acm.graphics.*;
import acm.program.GraphicsProgram;
import java.awt.event.MouseEvent;
//44. მაუსის კლიკზე იმავე ადგილზე ჩნდება ბურთი და იწყებს ვარდნას ძირს, თუ მაუსს სხვა
//ადგილზე ვაკლიკებ ბურთი გადადის ახალ ადგილზე და იქედან იწყებს ვარდნას
public class Problem_44 extends GraphicsProgram {
	private static int RADIUS = 50;
	private static int V_Y = 5;
	private static int PAUSE = 50;
	GOval circle;
	
	public void run(){
		circle = new GOval ( 2 * RADIUS, 2* RADIUS );
		circle.setFilled(true);
		addMouseListeners();
		while(true){
			circle.move(0, V_Y);
			pause(PAUSE);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e){
		add(circle, e.getX() - RADIUS, e.getY() - RADIUS);
	}
	
}
