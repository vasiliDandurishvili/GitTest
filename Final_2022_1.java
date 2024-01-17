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
		int sames = 1;
		String result = "";
		for(int i = 0; i < line.length(); i++){
			if(i < line.length() -1 && line.charAt(i) != line.charAt(i+1)){
				
			}
			
			
		}
		
		return result;
	}

}
