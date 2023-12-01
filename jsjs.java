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
	            char currentChar = text.charAt(i);
	            boolean isDuplicate = (i < text.length() - 1) && (currentChar == text.charAt(i + 1));

	            if (!isDuplicate) {
	                result += currentChar;
	            } else {
	                // Skip the next character in case of a duplicate
	                i++;
	            }
	        }
		return result;
		}

	
}