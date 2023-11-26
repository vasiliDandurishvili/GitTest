import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Stanford_midterm_strings extends ConsoleProgram {
	
	public void run() {
	String text1 = readLine("enter first text: ");
	String text2 = readLine("enter second text: ");
	
	String samePart = samePart(text1, text2);
	
	String leftPart1 = text1.substring(samePart.length());
	String leftPart2 = text2.substring(samePart.length());
	
	println(samePart.length() + samePart + "*" +leftPart1.length() + leftPart1 + leftPart2.length() + leftPart2);
	}

	private String samePart(String text1, String text2) {
		String comm ="";
		for(int i = 0; i < text1.length(); i++){
			if(text1.charAt(i) != text2.charAt(i) ){
				break;
			}else{
				comm += text1.charAt(i);
			}
		}
		
		
		return comm;
	}
}