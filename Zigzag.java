import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.program.GraphicsProgram;

/**
 * ამოცანა 3. ტეხილი (25 ქულა) დაწერეთ პროგრამა რაომელიც მომხმარებელს მისცემს
 * საშუალებას მაუსის დახმარებით დახატოს ტეხილი. მოთხოვნები: ტეხილის სათავე
 * დაფიქსირებულია და მდებარეობს (0,0) წერტილში.მაუსის ყოველ კლიკზე დაფაზე უნდა
 * დაემატოს ახალი GLine რომლის ერთი წვერო არის ტეხილის ბოლო წერტილი, ხოლო მეორე
 * წვერო კი, წერტილი სადაც მოხდა მაუსის კლიკი. მაგალითად თუ მომხმარებელმა
 * პირველად დააკლიკა (10, 100) წერტილზე, მაშინ თქვენმა პროგრამამ დაფაზე უნდა
 * დაამატოს (0, 0) წერტილიდან (10, 100) წერტილამდე მონაკვეთი. ხოლო თუ მეორე
 * დაჭერისას მომხმარებელმა დააკლიკა (5, 5) წერტილზე, დაფაზე უნდა დაემატოს (10,
 * 100) წერტილიდან (5, 5) წერტილამდე მონაკვეთი. ყოველი მაუსის
 * გაჩოჩებისას(mouseDragged) პროგრამა უნდა ხატავდეს მონაკვეთის მოძრაობას, რომლის
 * ერთი ბოლო დაფიქსირებულია ტეხილის ბოლო წერტილში, ხოლო მეორე ბოლო დაყვება
 * მაუსის ისარს. ისევე როგორც ეს ხდება
 */
public class Zigzag extends GraphicsProgram {
	private int xs;
	private int ys;
	private GLine line;

	public void run() {
		addMouseListeners();
		xs = ys = 0;
	}

	public void mousePressed(MouseEvent e) {
		line = new GLine(xs, ys, e.getX(), e.getY());
		add(line);
	}

	public void mouseDragged(MouseEvent e) {
		line.setEndPoint(e.getX(), e.getY());
		add(line);
	}
	public void mouseReleased(MouseEvent e){
		xs = e.getX();
		ys = e.getY();
	}
}