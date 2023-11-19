import acm.graphics.*;
import acm.program.GraphicsProgram;

public class jsjs extends GraphicsProgram{
    GOval oval;
	public void run(){
		oval = new GOval (30,30);
		add(oval,0,getHeight() / 2 - 15);
		
		while(oval.getX() + 30 < getWidth()){
		oval.move(5, 0);
		pause(30);
		}
	}

}
