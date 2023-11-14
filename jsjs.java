import acm.graphics.*;
import acm.program.GraphicsProgram;

public class jsjs extends GraphicsProgram{
	private static final int PAUSE= 10;
	GRect r;
	public void run(){
		r = new GRect (20,20,20,20);
		add(r);
		while(r.getX() - 10 < getWidth() / 2){
		r.move(5, 0);
		pause(PAUSE);
		}
		
		GObject x = getElementAt(30,30);
		if (x != null){
			GOval k = new GOval(100, 100, 100, 100);
			add(k);
		}
	}

}
