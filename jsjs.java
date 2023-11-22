import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class jsjs extends ConsoleProgram {
	private int mostChar = 0;

	public void run() {
		String text = readLine("enter text: ");

		for (int i = 0; i < text.length(); i++) {
			 int currNum = 0;
			for (int j = 0; j < text.length(); j++) {
				if(text.charAt(i) == text.charAt(j)){
					currNum++;
				}
			}
			if(currNum > mostChar){
				mostChar = currNum;
				print("most offen char: " + text.charAt(i) );
			}
		}
	}
}