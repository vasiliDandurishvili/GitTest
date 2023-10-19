import acm.program.GraphicsProgram;
import acm.graphics.*;
/*
 * ხაზებით ბადის დახატვა 10x10 ზე.
 */
public class Problem_21 extends GraphicsProgram {
	private static final int NUM_LINES = 11;
	public void run() {
		for(int i =0; i < NUM_LINES; i++){
		drawHorizontalLine(i);
		}
	}
	private void drawHorizontalLine(int i) {
		double y = i * (getHeight() / (NUM_LINES -1.0));
		double x_1 = 0;
		double x_2 = getWidth();
		GLine line = new GLine (x_1, y, x_2, y);
		add(line);
		}
}
