import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class jsjs extends GraphicsProgram{
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run(){
		GOval oval = new GOval (30,30);
//		oval.setColor(Color.rgen.NextColor());
		
		add(oval,0,0);
	}
}
