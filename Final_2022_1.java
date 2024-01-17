import acm.program.ConsoleProgram;


//aaabbbbbccd -> a3b4c2d1 

public class Final_2022_1 extends ConsoleProgram{
	public void run(){
		String line = readLine();
		
		String compressed = manipString(line);
		
		if(line.length() > compressed.length()){
			println(compressed);
		}else{
			println(line);
		}
		
	}
	private String manipString(String line) {
		if(line.length() == 1){
			return line.charAt(0) + "" + 1;
		}
		
		
		return result;
	}

}
