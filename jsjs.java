import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class jsjs extends GraphicsProgram {
	private static final double RADIUS = 30;
	private static final double vy = 7;
	private static final double PAUSE = 50;
	private GOval circle;

	public void run() {// removeAll();
		circle = new GOval(2 * RADIUS, 2 * RADIUS);
		circle.setFilled(true);

		addMouseListeners();
		while (true) {
			circle.move(0, vy);
		}

	}

	public void mouseClicked(MouseEvent e) {

	}

}