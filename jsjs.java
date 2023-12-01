import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.*;
import acm.util.RandomGenerator;

public class jsjs extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private GOval ball1;
	private GOval ball2;
	private static final double BALL_RADIUS = 20;
	private static final double PAUSE = 2000;
	private GOval oval1;
	private GOval oval2;

	public void run() {
		addMouseListeners();
		drawBalls();
		while(true){
			ball1 = new GOval (2 * BALL_RADIUS, 2 * BALL_RADIUS);
			ball1.setFilled(true);
			Color ballColor = getRandomColor();
			
			double x1 = rgen.nextDouble(0, getWidth() - 2 * BALL_RADIUS);
			double y1 = rgen.nextDouble(0, getHeight() - 2 * BALL_RADIUS);

			ball1.setColor(ballColor);
			
			ball2 = new GOval (2 * BALL_RADIUS, 2 * BALL_RADIUS);
			ball2.setFilled(true);
			
			double x2 = rgen.nextDouble(0, getWidth() - 2 * BALL_RADIUS);
			double y2 = rgen.nextDouble(0, getHeight() - 2 * BALL_RADIUS);
			ball2.setColor(ballColor);
			
			add(ball1, x1, y1);
			add(ball2,x2,y2);
			
			pause(PAUSE);
		}
		
	}

	public void mouseClicked(MouseEvent e) {
		if(oval1 == null && oval2 == null){
			oval1 = (GOval)getElementAt (e.getX(), e.getY());
			return;
		}
		if((oval1 != null) && (oval2 == null) && (GOval)getElementAt (e.getX(), e.getY()) != null){
			oval2 = (GOval)getElementAt (e.getX(), e.getY());
			
			if(oval1.getColor().equals(oval2.getColor())){
				remove(oval1);
				remove(oval2);
				
				oval1 = null;
				oval2 = null;
			}
		}else{
			oval1 = null;
			oval2 = null;
		}
		
	}
	
	
	
	
	
	private void drawBalls(){
		for(int i = 0; i < 25; i++){
			ball1 = new GOval (2 * BALL_RADIUS, 2 * BALL_RADIUS);
			ball1.setFilled(true);
			double x1 = rgen.nextDouble(0, getWidth() - 2 * BALL_RADIUS);
			double y1 = rgen.nextDouble(0, getHeight() - 2 * BALL_RADIUS);
			Color ball1Color = getRandomColor();
			ball1.setColor(ball1Color);
			
			ball2 = new GOval (2 * BALL_RADIUS, 2 * BALL_RADIUS);
			ball2.setFilled(true);
			
			double x2 = rgen.nextDouble(0, getWidth() - 2 * BALL_RADIUS);
			double y2 = rgen.nextDouble(0, getHeight() - 2 * BALL_RADIUS);
			Color ball2Color = getRandomColor();
			ball2.setColor(ball2Color);
			
			add(ball1, x1, y1);
			add(ball2,x2,y2);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private Color getRandomColor() {
		int a = rgen.nextInt(1, 5);
		if (a == 1) {
			return Color.YELLOW;
		} else if (a == 2) {
			return Color.BLUE;
		} else if (a == 3) {
			return Color.GREEN;
		}else if (a == 4) {
			return Color.PINK;
		}else if (a == 5) {
			return Color.CYAN;	
		}else{
			return Color.BLACK;
		}
	}

}