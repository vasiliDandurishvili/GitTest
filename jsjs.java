import acm.program.*;

public class jsjs extends ConsoleProgram {

	public void run() {
		String text = readLine("enter text: ");
		String cleared = clearText(text);

		println(cleared);
		
	}

	private String clearText(String text) {
		String result = "";
		 for (int i = 0; i < text.length(); i++) {
	            if (i == text.length() - 1 || text.charAt(i) != text.charAt(i + 1)) {
	                result += text.charAt(i);
	            }
		 }    

		return result;
		}

	
}