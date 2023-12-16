import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class eval extends ConsoleProgram{
	public void run(){
		String str = readLine();
		ragac(str);
	}

	private int ragac(String str) {
		StringTokenizer tok = new StringTokenizer(str, " ");
		int k = Integer.parseInt(str);
		
		int a = 0;
		
		while(tok.hasMoreTokens()){
			String s = tok.nextToken();
			int i = Integer.parseInt(s);
			if(tok.nextToken() == "+"){
				a+= i;
			}else{
				a-= i;
			}
		
		}
		return a;
	}
}
