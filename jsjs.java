import java.awt.event.MouseEvent;
import java.util.StringTokenizer;

import acm.graphics.GLine;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.*;
import acm.util.RandomGenerator;

public class jsjs extends ConsoleProgram {
	public void run() {
		String text = readLine();
		StringTokenizer tokenizer = new StringTokenizer(text, " ");
		int count = 0;

		while (tokenizer.hasMoreTokens()) {
			String currToken = tokenizer.nextToken();
			count++;
		}
		print("count: " + count);
	}
}
