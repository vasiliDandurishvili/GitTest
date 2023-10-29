package assignment2.Assignment2;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {
	/** Radiuses from cm to pixels (2.54 cm == 72 pix =>>> 1 mc is equal to 28.34 pix */
	
	private static final double RADIUS_1_InCm = 2.54;
	private static final double RADIUS_1_InPix = 72;
	
	private static final double RADIUS_2_InCm = 1.65;
	private static final double RADIUS_2_InPix = 46.76;
	
	private static final double RADIUS_3_InCm = 0.76;
	private static final double RADIUS_3_InPix = 21.53;
	
	public void run() {
		drawTarget();
	}

	private void drawTarget() {
		double x1 = getWidth() / 2 - RADIUS_1_InPix;
		double y1 = getHeight() / 2 - RADIUS_1_InPix;
		firstOval(x1,y1);
		secondOval(x1,y1);
		thirdOval(x1,y1);
	}

	private void thirdOval(double x1, double y1) {
		GOval targ3 = new GOval (2 * RADIUS_3_InPix, 2 * RADIUS_3_InPix);
		
		/* move third oval at the center of the first oval*/
		double x2 = x1 + (RADIUS_1_InPix - RADIUS_3_InPix);
		double y2 = y1 + (RADIUS_1_InPix - RADIUS_3_InPix);
		
		add(targ3,x2,y2);
		targ3.setFilled(true);
		targ3.setColor(Color.red);
		
	}

	private void secondOval(double x1, double y1) {
		GOval targ2 = new GOval (2 * RADIUS_2_InPix, 2 * RADIUS_2_InPix);
		
		/* move second oval at the center of the first oval*/
		double x2 = x1 + (RADIUS_1_InPix - RADIUS_2_InPix);
		double y2 = y1 + (RADIUS_1_InPix - RADIUS_2_InPix);
		
		add(targ2,x2,y2);
		targ2.setFilled(true);
		targ2.setColor(Color.white);
		
	}

	private void firstOval(double x1,double y1) {		
		GOval targ1 = new GOval (2 * RADIUS_1_InPix,  2 * RADIUS_1_InPix);
		add(targ1,x1,y1);
		targ1.setFilled(true);
		targ1.setColor(Color.red);
		
	}
}
