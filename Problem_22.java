import acm.program.GraphicsProgram;
import acm.graphics.*;
/*
 *ჭადრაკის დაფის დახატვა 8x8 ზე.
 */
public class Problem_22 extends GraphicsProgram {
	private static final int NUM_CELLS = 8;
	public void run() {
		double length = Math.min(getWidth(), getHeight()) / (double) NUM_CELLS ;
		for(int i = 0; i < NUM_CELLS; i++){
			for(int j = 0; j < NUM_CELLS; j++){
				double x = i * length;
				double y = j * length;
				boolean isFilled = (i + j) % 2 == 1;
				drawSquare (x, y, length, isFilled);
			}
		}
		
	}
	private void drawSquare(double x, double y, double length, boolean isFilled) {
		GRect square = new GRect(length, length);
		square.setFilled(isFilled);
		add(square, x, y);
		
	}
}