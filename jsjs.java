import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
// Roman to Integer.
public class jsjs extends ConsoleProgram {

	public void run() {
		int ans = 0;
		String text = readLine("enter Roman numbers: ");
		
		for(int i = 0; i < text.length(); i++){
			if(text.charAt(i) == 'M'){
				ans += 1000;
			}
			else if(text.charAt(i) == 'D'){
				ans += 500;
			}
			else if (text.charAt(i) == 'C'){
				if(text.charAt(i + 1) == 'M'){
					ans -= 100;
				}else{
					ans += 100;
				}
			}
			else if(text.charAt(i) == 'L'){
				ans += 50;
			}
			else if (text.charAt(i) == 'X'){
				if (text.charAt(i + 1) == 'C'){
					ans -= 10;
				}else{
					ans += 10;
				}
			}
			else if (text.charAt(i) == 'V'){
				ans += 5;
			}
			else if (text.charAt(i) == 'I'){
				if (text.charAt(i + 1) == 'V'){
					ans -= 1;
				}
				else if (text.charAt(i + 1) == 'X'){
					ans -= 1;
				}else{
					ans += 1;
				}
			}else{
				break;
			}
		}
		println("the integer is: " + ans);
	}
}