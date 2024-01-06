import java.util.Arrays;

import acm.program.ConsoleProgram;

/**61. კონსოლიდან შეგვყავს რიცხვი m და n, შემდეგ n ცალი რიცხვი. პროგრამამ უნდა იპოვოს
შეყვანილი რიცხვებიდან წყვილი რომელთა ჯამი არის m.*/
public class Problem_61 extends ConsoleProgram{
	public void run(){
		int m = readInt("enter m: ");
		int n = readInt("enter n: ");
		
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++){
			arr [i] = readInt("enter num: ");
		}
		println(getSum(arr, n, m));
	}

	private boolean getSum(int[] arr, int n, int m) {
		for (int i = 0; i < n - 1; i++){
			for(int j = 1; j < n; j++){
				if(arr[i] + arr[j] == m){
					println(arr[i]);
					println(arr[j]);
					return true;
				}
			}
		}
		return false;
	}
}
