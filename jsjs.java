import acm.program.*;

public class jsjs extends ConsoleProgram {

	public void run() {
		String text = readLine("enter text: ");
		String cleared = clearText(text);

		println(cleared);
	}

	private String clearText(String text) {
		String checker = "";
		while (true) {
			for (int i = 0; i < text.length() - 1; i++) {
				if (text.charAt(i) == text.charAt(i + 1)) {
					String sub1 = text.substring(0, i);
					String sub2 = text.substring(i + 2);
					text = sub1 + sub2;
					if(checker.equals(text) ){
						return text;
					}
					
					checker = text;
				}
			}

		}

	}
}