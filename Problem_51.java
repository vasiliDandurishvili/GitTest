
import java.util.StringTokenizer;

import acm.program.*;

//51. დაწერეთ მეთოდი რომელიც გადაცემული ტექსტიდან შლის დუბლირებულ სიმბოლოებს,
//ანუ თუ ტექსტიში რომელიმე სიმბოლო მეორდება, უნდა დარჩეს მხოლოდ ყველაზე მარცხენა.
public class Problem_51 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text: ");
		String replaced = removeDuplicates(text);
		
		println(replaced);
	}
	private String removeDuplicates(String text){
		text.replace("i","");
		
		println(text.replace("i",""));
		
		return text;
	}
	
}