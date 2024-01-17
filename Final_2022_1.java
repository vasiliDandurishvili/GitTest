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
// aaabbbbbccd
	private String manipString(String line) {
		int sames = 1;
		String result = "";
		for(int i = 0; i < line.length(); i++){
			if(i < line.length() -1 && line.charAt(i) != line.charAt(i+1)){
				/**bolos ar tvlis.*/
				String psLine = line.substring(0, i + 1);
				result = line.charAt(0) + sames + "";
				line = line.substring(i + 1);
				sames = 1;
				
			}else{
				sames += 1;
			}
			
			
		}
		
		return result;
	}

}
