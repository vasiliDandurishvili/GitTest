import acm.program.ConsoleProgram;

public class midterm_evilMan  extends ConsoleProgram {

	public void run() {
		String text = readLine("enter text: ");
		String cleared = clearText(text);

		println(cleared);
		
	}

	private String clearText(String text) {
		  String result = text;

	        while (true) {
	            String previousResult = result;

	            for (int i = 0; i < result.length() - 1; i++) {
	                if (result.charAt(i) == result.charAt(i + 1)) {
	                    String sub1 = result.substring(0, i);
	                    String sub2 = result.substring(i + 2);
	                    result = sub1 + sub2;
	                    i--; // Check the same index again after removing the duplicate
	                }
	            }

	            if (previousResult.equals(result)) {
	                break; // No changes were made in the entire iteration
	            }
	        }
		return result;
		}

	
}