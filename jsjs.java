import acm.program.ConsoleProgram;

public class jsjs extends ConsoleProgram{

	public void run(){
		String s = "abcdefgh";
		s = s.substring(0,3) + s.substring(4,s.length()) ;
		
		println(s);
	}

}
