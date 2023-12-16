import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

//42. Paint-ის მონაკვეთის ხატვის გაკეთება, ჯერ აჭერ მაუსს, ფიქსირდება ერთი წვერო, მერე
//მაუსის მოძრაობისას მონაკვეთიც მოძრაობს რადგან მეორე წვერო არაა დაფიქსირებული და
//კლიკით ფიქსირდება მეორე წვეროც.

public class Problem_42_vol2 extends GraphicsProgram {

	private int xs, ys;
	private GLine line;

	@Override
	public void init() {
		xs = ys = 0;
		addMouseListeners();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		line = new GLine(xs, ys, e.getX(), e.getY());
		add(line);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		line.setEndPoint(e.getX(), e.getY());
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		xs = e.getX();
		ys = e.getY();
	}
}