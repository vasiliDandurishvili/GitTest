import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class jsjs extends ConsoleProgram{
	public void run(){
		int x = 2;
		int y = 3;
		GOval o = new GOval(4,3);	//width, height
		println(racxa(x,2,o));
		println(racxa(y,x/2+x,o));
	}
	
	public int racxa(int x, int y, GOval o){
		String s = "hello world";
		x = varesiRacxa(x/y, x+(int)o.getHeight(), s);
		o.scale(2);
		y = varesiRacxa(x, y+(int)o.getHeight(), s);
		return x+y;
	}
	
	public int varesiRacxa(double x, int y, String s){
		int z = (int)x + s.charAt(0)-s.charAt(1);
		s = s.substring(1);
		return z + y;
	}	
}
