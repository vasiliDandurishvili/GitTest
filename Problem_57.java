import java.util.Arrays;

import acm.program.*;

/**57. დაწერეთ მეთოდი, რომელსაც გადაეცემა ორი სტრინგი და აბრუნებს true-ს თუკი ეს ორის
სტრინგი ერთმანეთის ანაგრამაა, ხოლო წინააღმდე შემთხვევაში აბრუნებს false-ს. ჩათვალეთ,
რომ ორივე სტრინგი მხოლოდ ლათინური ალფავიტის პატარა ასოებისგან შედგება.
იმპლემენტაცია გააკეთეთ მასივების გამოყენებით შემდეგი ალგორითმით: თითოეული
სიტყვისთვის დათვალეთ თითოეული სიმბოლოს რაოდენობა(‘a’-‘z’) და შეინახეთ მასივში.
შემდეგ შეადარეთ ერთმანეთს მასივები.*/
public class Problem_57 extends ConsoleProgram{
	public void run(){
		String first = readLine("first: ");
		String second = readLine("second: ");
		
		int[] arr1 = new int[26];
		int[] arr2 = new int[26];
		
		for (int i = 0; i < first.length(); i++){
			char ch = first.charAt(i);
			
			arr1[ch - 'a'] += 1;
		}
		
		for (int i = 0; i < second.length(); i++){
			char ch = second.charAt(i);
			
			arr2[ch - 'a'] += 1;
		}
		println(Arrays.equals(arr1, arr2));
	}
}
