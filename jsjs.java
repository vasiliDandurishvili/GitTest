import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.program.*;

public class jsjs extends ConsoleProgram {
private char X;
	public void run() {
		String s = readLine("enter: ");
		while (!s.equals("")) {
			int amount = 0;
			for (int i = 0; i < s.length(); i++) {
				X = s.charAt(i);
				for (int j = 0; j < s.length(); j++) {
					if (s.charAt(j) == X) {
						amount++;
						String delete = "" + X;
						String newS = s.replace(delete, "");
						s = newS;
					}
				}
			}
			println("num of: " + X + " : " + amount);
		}
	}

}