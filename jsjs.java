import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class jsjs extends ConsoleProgram {
	private int numOfSym = 0;
	public void run(){
	String text = readLine("enter text: ");
	String symbolText = readLine("enter char: ");
	
	char symbol = symbolText.charAt(0);
			
	int finalSum = symbInText(text, symbol);
	print ("sum of the " + symbol + " sybmbol: " + finalSum);
	}
	
	private int symbInText(String text, char symbol) {
		for (int i = 0; i < text.length(); i++){
			if(text.charAt(i) == symbol){
				numOfSym++;
			}
		}
		return numOfSym;
	}

}