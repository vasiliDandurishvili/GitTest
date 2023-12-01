import acm.program.*;

public class jsjs extends ConsoleProgram {

	public void run() {
		String text = readLine("enter text: ");
		String cleared = clearText(text);

		println(cleared);
	}

	private String clearText(String text) {
		String result = "";
		for(int i = 0; i < text.length(); i++){
			for(int j = 0; j < text.length() - 1; j++){
				if(text.charAt(j) == text.charAt(j + 1)){
					String sub1 = text.substring(0,j);
					String sub2 = text.substring(j + 2);
					result = sub1 + sub2;
					text = result;
				}
			}
		}
		return result;
		}

	
}