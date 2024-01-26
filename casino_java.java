import acm.program.ConsoleProgram;

public class casino_java extends ConsoleProgram{
	public void run(){
		int[] arr = new int[4];
		for(int i = 0;  i < arr.length; i++){
			arr[i] = readInt();
		}
		String line = readLine("line: ");
		
		println(addSpaces(line, arr));
	}

	private String addSpaces(String string, int[] arr) {
		String result = "";
		int ind = 0;
		for (int i = 0; i < string.length(); i++) {
			if (ind < arr.length && arr[ind] == i) {
				result += ' ';
				ind++;
			}
			result += string.charAt(i);
		}
		return result;
	}

}
