/**54. კონსოლიდან შეგყვავს n და შემდეგ n ცალი მთელი რიცხვი, იპოვეთ და დაბეჭდეთ ამ
რიცხვებს შორის ორი მაქსიმალური რიცხვი.*/
import java.util.Arrays;

import acm.program.ConsoleProgram;


public class Problem_54 extends ConsoleProgram{
	public void run(){
		int n = readInt("enter n: ");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++){
			arr[i] = readInt("fill array: ");
		}
		Arrays.sort(arr);
		
		println("biggest: " + arr[n - 1]);
		println("second biggest: " + arr[n - 2]);
	}

}
