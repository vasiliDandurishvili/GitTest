import java.util.Arrays;

import acm.program.ConsoleProgram;

/**
 * 58. (2018 წლის გამოცდის ამოცანა) მატრიცას ეწოდება მაგიური თუკი ის
 * კვადრატულია(n x n-ზე) და მასში არის ყველა რიცხვი 1-დან n^2-ის ჩათვლით. თქვენი
 * მიზანია დაწეროთ magicMatrix მეთოდი რომელიც შეამოწმებს არის თუ არა მატრიცა
 * მაგიური და თუკი მაგიურია მაშინ დააბრუნებს true-ს თუ არა მაშინ false-ს.
 */
public class Problem_58 extends ConsoleProgram {
	public void run() {
		int n = readInt("enter n: ");
		int [][] matrix = new int[n][n];
		boolean a = isMagicMatrix(matrix, n);
		
		println(a);

	}

	private boolean isMagicMatrix(int [][] matrix, int n) {
		/**make array what i want to have at last and then check equals.*/
		int [] arr = new int [n*n];
		for(int i = 0; i < n*n; i++){
			arr[i] = i + 1; 
		}
		
		int [] arr2 = new int [n*n];
		for (int r = 0; r < matrix.length; r++){
			for(int c = 0; c < matrix[0].length; c++){
				arr2[matrix.length * r + c] = matrix[r][c];
			}
		}
		Arrays.sort(arr2);
		return Arrays.equals(arr,arr2);
	}
}
