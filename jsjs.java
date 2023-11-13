import acm.graphics.*;
import acm.program.GraphicsProgram;

public class jsjs extends GraphicsProgram{
	GRect r;
	public void run(){
		r = new GRect (20,20,20,20);
		add(r);
		
		
		GObject x = getElementAt(30,30);
		if (x != null){
			GOval k = new GOval(100, 100, 100, 100);
			add(k);
		}
	}

}
