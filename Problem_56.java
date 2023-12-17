import java.util.Arrays;

import acm.program.ConsoleProgram;
/**56. კონსოლიდან შეგყვავს n და შემდეგ n ცალი მთელი რიცხვი, დაალაგეთ რიცხვები
ზრდადობით და დაბეჭდეთ.*/
public class Problem_56 extends ConsoleProgram{
	public void run(){
		int n = readInt("enter sum: ");
		int [] arr = new int[n];
		for (int i = 0; i < n;i++){
			arr[i] = readInt("enter num: ");
		}
		println(Arrays.toString(arr));
		sort(arr);
		println(Arrays.toString(arr));
		 
	}

	private void sort(int[] arr) {
		for(int i = 0 ; i < arr.length; i++){
			int j = findMinIndex(arr , i);
			swap(arr, i, j);
		}
		
	}

	private void swap(int[] arr, int i, int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
		
	}

	private int findMinIndex(int[] arr, int i) {
		int minIndex = i;
		for (int j = i; j < arr.length; j++){
			if(arr[j] < arr[minIndex]){
				minIndex = j;
			}
		}
		return minIndex;
	}

}
