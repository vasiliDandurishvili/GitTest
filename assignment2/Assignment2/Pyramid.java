package assignment2.Assignment2;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	public void run() {
		completeThePyramid();
	}

	private void completeThePyramid() {
		for (int j =0; j <= BRICKS_IN_BASE ; j++){
			fillEachLineWithRects(BRICK_WIDTH,BRICK_HEIGHT,BRICKS_IN_BASE,j);
		}
	}
	
	private void fillEachLineWithRects(int brickWidth, int brickHeight, int bricksInBase,int j) {
	for(int i = 0; i <= BRICKS_IN_BASE - j; i++ ){
	GRect brick = new GRect (BRICK_WIDTH,BRICK_HEIGHT);
/**			i want to draw following rect next to others so i added the BRICK_WIDTH again and agaim((i - 1) * BRICK_WIDTH).*/
	double x1 = getWidth() / 2.0 -  (double) (BRICKS_IN_BASE - j) * BRICK_WIDTH / 2.0 + i * BRICK_WIDTH;
	/**			after fill the line we should move up at the top of the last brick (BRICK_HEIGHT).*/
	double y1 = (double) getHeight()- j * BRICK_HEIGHT;
	add(brick,x1,y1);
    	}
	}
}
	
	
	
	
	
	
