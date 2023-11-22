import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class jsjs extends GraphicsProgram {
	private static final double RADIUS = 30;
	private static final double vy = 1;
	private static final double PAUSE = 8;
	private GOval circle;

	public void run() {// removeAll();
		circle = new GOval(2 * RADIUS, 2 * RADIUS);
		circle.setFilled(true);

		addMouseListeners();
		while (true) {
			circle.move(0, vy);
			pause(PAUSE);
		}

	}

	public void mouseClicked(MouseEvent e) {
		add(circle, e.getX() - RADIUS, e.getY() - RADIUS);
	}

}