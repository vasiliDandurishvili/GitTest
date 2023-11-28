import java.awt.Color;

import acm.graphics.*;
import acm.program.*;
import acm.util.RandomGenerator;

public class jsjs extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int NUM_COLUMNS = 5;
	private static final int NUM_ROW = 5;

	public void run() {
		addMouseListeners();
		drawSquares();
	}

	private void drawSquares() {
		for (int i = 0; i < NUM_COLUMNS; i++) {
			for (int j = 0; j < NUM_ROW; j++) {
				GRect rect = new GRect(getWidth() / NUM_COLUMNS, getHeight() / NUM_ROW);
				rect.setFilled(true);
				Color fillColor = getRandomColor();
				rect.setFillColor(fillColor);
				Color frameColor = getRandomColor();
				rect.setColor(frameColor);
				add(rect, getWidth() / NUM_COLUMNS * i, getHeight() / NUM_ROW * j);
			}
		}

	}

	private Color getRandomColor() {
		int a = rgen.nextInt(1, 3);
		if (a == 1) {
			return Color.YELLOW;
		} else if (a == 2) {
			return Color.BLUE;
		} else if (a == 3) {
			return Color.GREEN;
		} else {
			return Color.BLACK; // TO GET ERROR.
		}
	}

}