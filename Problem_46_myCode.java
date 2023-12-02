import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/**46. დაწერეთ მეთოდი რომელსაც გადაეცემა სტიგნი და რომელიც აბრუნებს ამ სტრინგში
ყველაზე ხშირ სიმბოლოს.*/
public class Problem_46_myCode extends ConsoleProgram {
	private int mostCharNum = 0;
	private char mostCh;

	public void run() {
		String text = readLine("enter text: ");

		for (int i = 0; i < text.length(); i++) {
			int currNum = 0;

			for (int j = 0; j < text.length(); j++) {
				if (text.charAt(i) == text.charAt(j)) {
					currNum++;
				}

			}
			if (currNum > mostCharNum) {
				mostCharNum = currNum;
				mostCh = text.charAt(i);
			}
		}

		println("most offen char: " + mostCh + " the number is: " + mostCharNum);
	}
}