import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class jsjs extends ConsoleProgram {

	public void run() {
		String text = readLine("enter text: ");
		boolean isPalindrom = isPalindrome(text);
		if(isPalindrom){
			print(text + " is palindrom.");
		}else{
			print(text + " is not palindrom.");
		}
	}

	private boolean isPalindrome(String text) {
		for (int i = 0; i < text.length() / 2; i++){
			if(text.charAt(i) != text.charAt(text.length() - i - 1 )){
				return false;
			}
		}
		return true;
	}
}