import java.awt.event.MouseEvent;
import java.util.StringTokenizer;

import acm.graphics.GLine;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.*;
import acm.util.RandomGenerator;

public class jsjs extends ConsoleProgram {
	

	public void run() {
		int[] a = new  int [5];
		println(a[3]);
		println(a.length);
		a[3] = 5;
		println(a[3]);
		for ( int i = 0; i < a.length - 1; i++){
		a[i] = i;	
		}
		for(int i = 0; i < a.length; i++){
			println(a[i]);
		}
	}
}
