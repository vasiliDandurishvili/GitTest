import java.util.Arrays;

import acm.program.ConsoleProgram;

/**55. კონსოლიდან შეგყვავს n და შემდეგ n ცალი მთელი რიცხვი, გაარკვიეთ შეყვანილი რიცხვები
არის თუ არა ზრდადობით დალაგებული. თუკი არის დაბეჭდეთ “sorted” თუ არა მაშინ
დაბეჭდეთ “not sorted”.*/


public class Problem_55 extends ConsoleProgram{
	public void run(){
		int n = readInt("enter n: ");
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		
		for (int i = 0; i < n; i++){
			int num = readInt("fill array: ");
			arr1[i] = num;
			arr2[i] = num;
		}
		Arrays.sort(arr1);
		
		if(Arrays.equals(arr1, arr2)){
			println("sorted");
		}else{
			println("not sorted");
		}
	}
}
