package assignment2.Assignment2;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class ProgramHierarchy extends GraphicsProgram {	
	
	/** Width of each brick in pixels */
	private static final double BRICK_WIDTH = 120;

/** Width of each brick in pixels */
	private static final double BRICK_HEIGHT = 60;
	
	
	public void run() {
		drawADiagram();
	}
	
	private void drawADiagram() {
		programRect();		
		consoleRect();
		graphicsRect();
		dialogRect();
		connectionLines();
	}
	
	private void connectionLines() {
		/** begining coordinates and final y coordinate are same for all of them */
		double x1 = (double) getWidth() / 2;
		double y1 = (double) getHeight() / 4 + BRICK_HEIGHT ;
		double y2 = (double) getHeight() / 2;
		
		
		programToConsole(x1, y1, y2);
		programToGraphics(x1, y1, y2);
		programToDialog(x1, y1, y2);		
	}

/********** this line connects program and DialogProgram  ***************/	
	private void programToDialog(double x1, double y1, double y2) {
		double x2 = ((double)getWidth() - BRICK_WIDTH) / 2 + BRICK_WIDTH + 30 +BRICK_WIDTH /2  ;
		GLine line3 = new GLine (x1, y1, x2, y2);
		add(line3);
	}

/********** this line connects program and GraphicsProgram  ***************/	
	private void programToGraphics(double x1, double y1, double y2) {
		double x2 = ((double)getWidth() - BRICK_WIDTH) / 2 - 30 - BRICK_WIDTH /2 ;
		GLine line2 = new GLine (x1, y1, x2, y2);
		add(line2);
	}

/********** this line connects program and ConsoleProgram ***************/
	private void programToConsole(double x1, double y1, double y2) {
		double x2 = x1 ;
		GLine line1 = new GLine (x1, y1, x2, y2);
		add(line1);
	}

/************* THE DIALOG RECTANGLE *************/
	private void dialogRect() {
		GRect rect4 = new GRect (BRICK_WIDTH,BRICK_HEIGHT);
		
		/** Draw a fourth to the right of the second  */
		double x1 = ((double)getWidth() - BRICK_WIDTH) / 2 + BRICK_WIDTH + 30 ;
		double y1 = (double) getHeight() / 2;
		
		add(rect4, x1, y1);
		fourthLabel(x1, y1);
		
	}
	
	private void fourthLabel(double x1, double y1) {
		GLabel labelFour =  new GLabel ("DialogProgram");
	
		/** get label's width and height */
		double labelWidth = labelFour.getWidth();
		double labelHeight = labelFour.getAscent();
	
		/** put the text in the middle of the rectangle */
		double x2 = x1 + (BRICK_WIDTH - labelWidth) / 2;
		double y2 = y1 + (BRICK_HEIGHT + labelHeight) / 2;
	
		add(labelFour, x2, y2);

		
	}

/************* THE GRAPHICS RECTANGLE *************/
	private void graphicsRect() {
	GRect rect3 = new GRect (BRICK_WIDTH,BRICK_HEIGHT);
		
		/** Draw a third to the left of the second  */
		double x1 = ((double)getWidth() - BRICK_WIDTH) / 2 - BRICK_WIDTH - 30 ;
		double y1 = (double) getHeight() / 2;
		
		add(rect3, x1, y1);
		thirdLabel(x1, y1);
	}
	
	private void thirdLabel(double x1, double y1) {
		GLabel labelThree =  new GLabel ("GraphicsProgram");
	
		/** get label's width and height */
		double labelWidth = labelThree.getWidth();
		double labelHeight = labelThree.getAscent();
	
		/** put the text in the middle of the rectangle */
		double x2 = x1 + (BRICK_WIDTH - labelWidth) / 2;
		double y2 = y1 + (BRICK_HEIGHT + labelHeight) / 2;
	
		add(labelThree, x2, y2);
	}

/************* THE CONSOLE RECTANGLE *************/
	private void consoleRect() {
		GRect rect2 = new GRect (BRICK_WIDTH,BRICK_HEIGHT);
		
		/** Draw the second below the first*/
		double x1 = ((double)getWidth() - BRICK_WIDTH) / 2;
		double y1 = (double) getHeight() / 2;
		
		add(rect2, x1, y1);
		secondLabel(x1, y1);
		
	}
	
	private void secondLabel(double x1, double y1) {
		GLabel labelTwo =  new GLabel ("ConsoleProgram");
		
		/** get label's width and height */
		double labelWidth = labelTwo.getWidth();
		double labelHeight = labelTwo.getAscent();
		
		/** put the text in the middle of the rectangle */
		 double x2 = x1 + (BRICK_WIDTH - labelWidth) / 2;
		 double y2 = y1 + (BRICK_HEIGHT + labelHeight) / 2;
		
		add(labelTwo, x2, y2);
		
	}
	
/************* THE PROGRAM RECTANGLE *************/
	private void programRect() {
		GRect rect1 = new GRect (BRICK_WIDTH,BRICK_HEIGHT);
		
		/** draw the first rectangle */
		double x1 = ((double)getWidth() - BRICK_WIDTH) / 2;
		double y1 = (double) getHeight() / 4;
		
		add(rect1, x1, y1);
		firstLabel(x1, y1);
	}
	
	private void firstLabel(double x1, double y1) {
		GLabel labelOne =  new GLabel ("program");
		
		/** get label's width and height */
		double labelWidth = labelOne.getWidth();
		double labelHeight = labelOne.getAscent();
		
		/** put the text in the middle of the rectangle */
		 double x2 = x1 + (BRICK_WIDTH - labelWidth) / 2;
		 double y2 = y1 + (BRICK_HEIGHT + labelHeight) / 2;
		
		add(labelOne, x2, y2);
	}
}
