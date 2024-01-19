import acm.program.ConsoleProgram;

public class FX_2022_1 extends ConsoleProgram{
	public void run(){
		int[] arr = new int [6];
		for(int i = 0; i < arr.length; i++){
			arr[i] = readInt();
		}
		
		String sum = intToString(arr);
		
		println(sum);
	}

	private String intToString(int[] arr) {
		int sum = 0;
		String result = "";
		for(int i = 0; i < arr.length; i++){
			result = arr[i] + "";
			
		}
		
		return result;
	}
}
