import acm.program.GraphicsProgram;
import acm.graphics.*;
/*
 * ხაზებით ბადის დახატვა 10x10 ზე.
 */
public class Problem_21 extends GraphicsProgram {
	private static final int NUM_LINES = 11;
	public void run(){
		for (int i = 0; i < NUM_LINES; i++ ){
			drawHorizonalLIne(i);
//			drawVerticalLIne();
		}
		
		
		
	}
	private void drawHorizonalLIne(int i) {
		double y = i * (getHeight() / (NUM_LINES - 1.0));
		double x_1 = 0;
		double x_2 = getWidth();
		
		GLine line = new GLine(x_1, y, x_2, y);
		add(line);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	private static final int NUM_LINES = 11;
//	
//	public void run() {
//		for(int i =0; i < NUM_LINES; i++){
//		drawHorizontalLine(i);
//		drawVerticalLine(i);
//		}
//	}
//	private void drawVerticalLine(int i) {
//		double x = i * (getWidth() / (NUM_LINES -1.0));
//		double y_1 = 0;
//		double y_2 = getHeight();
//		
//		GLine line = new GLine (x, y_1, x, y_2);
//		add(line);
//		
//	}
//	
//	private void drawHorizontalLine(int i) {
//		double y = i * (getHeight() / (NUM_LINES -1.0));
//		double x_1 = 0;
//		double x_2 = getWidth();
//		
//		GLine line = new GLine (x_1, y, x_2, y);
//		add(line);
//		}
}
