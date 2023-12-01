
import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.*;
import acm.util.RandomGenerator;

public class Stanford_midterm_randomCollorSquares extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int NUM_COLUMNS = 5;
	private static final int NUM_ROW = 5;
	private GObject obj1;
	private GObject obj2;

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
				add(rect, getWidth() / NUM_COLUMNS * i + i*5, getHeight() / NUM_ROW * j + i*5);
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

	public void mouseClicked(MouseEvent e) {
		if (obj1 == null && obj2 == null) {
			obj1 = getElementAt(e.getX(), e.getY());

		} else if ((obj1 != null) && (obj2 == null) && (getElementAt(e.getX(), e.getY()) != obj1)) {
			// tu isev obj1-s ar daaklika.
			obj2 = getElementAt(e.getX(), e.getY());

			if (((GRect) obj1).getColor().equals(((GRect) obj2).getColor())
					&& ((GRect) obj1).getFillColor().equals(((GRect) obj2).getFillColor())) {
				remove(obj1);
				remove(obj2);

				// Reset obj1 and obj2 for the next comparison
				obj1 = null;
				obj2 = null;
			}
		}else{
			obj1 = null;
			obj2 = null;
		}
	}

}
