import java.util.Arrays;

import acm.program.ConsoleProgram;

public class Anagrama_saba extends ConsoleProgram{
	int[] one = new int [26];
	int[] two = new int [26];
	public void run(){
		String line1 = readLine();
		String line2 = readLine();
		line1.toLowerCase();
		line2.toLowerCase();
	
		println(anagrams(line1, line2));
	}
	

	private boolean anagrams(String line1, String line2) {
		for(int i = 'a'; i <= 'z';i++ ){
			
		}
		
		
		return false;
	}
	

}
