import java.util.StringTokenizer;

import acm.program.*;

//50. შეყვანილ ტექსტში დათვალეთ სიტვყების რაოდენობა, ტოკენაიზერის საშუალებით.
public class Problem_50 extends ConsoleProgram {
	public void run(){
		String text = readLine("Enter text: ");
//		StringTokenizer tokenizer = new StringTokenizer(text);
		StringTokenizer tokenizer = new StringTokenizer(text," ,.!");
		int count = 0;
		
		while(tokenizer.hasMoreTokens()){
			String currToken = tokenizer.nextToken();
			count++;
		}
		println("count: " + count);
	}

}
