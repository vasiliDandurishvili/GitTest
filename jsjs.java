import acm.graphics.*;
import acm.program.GraphicsProgram;

public class jsjs extends GraphicsProgram{
	private  int vx = 3;
    GOval oval;
	public void run(){
		oval = new GOval (30,30);
		add(oval,0,getHeight() / 2 - 15);
		
		while(true){
		oval.move(vx, 0);
		pause(10);
		
		if(oval.getX() + 30 < getWidth() || oval.getX() < 0){
			vx = -vx;
		}
		}
	}

}
