import acm.program.ConsoleProgram;

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
		// TODO Auto-generated method stub
		return null;
	}

}
