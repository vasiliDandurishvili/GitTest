

import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

//34. კანვასზე დახატეთ 1000 შემთხვევითი რადიუსის მქონე შემთხვევითი ფერით გაფერადებული
//წრე, შემთხვევით კოორდინატებზე.
public class Problem_34 extends GraphicsProgram{
private RandomGenerator rgen = RandomGenerator.getInstance();
private static final int RADIUS_MIN = 10;
private static final int RADIUS_MAX = 30;
private GOval oval;
private int radius;
	public void run(){
	addMouseListeners();

	}
	private void draw(){
		radius = rgen.nextInt(RADIUS_MIN,RADIUS_MAX);
		oval = new GOval (2 * radius,2 * radius );
		oval.setFilled(true);
		oval.setColor(rgen.nextColor());
	}
	

	public void mouseClicked(MouseEvent e){
		draw();
		double x = e.getX() - radius;
		double y = e.getY() - radius; 
	
		add(oval,x , y);
	}
}