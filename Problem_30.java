import java.math.BigDecimal;

import acm.program.ConsoleProgram;
/*
მომხმარებელს შეყავს მთელი რიცხვი, დაბეჭდეთ რიცხვი რომელიც მიიღება ციფრების
შებრუნებით, 1256 -> 6521
 */
public class Problem_30 extends ConsoleProgram {
	public void run () {
		int n = readInt("enter the integer: ");
		int reverseNum = 0;
		
		while(n != 0){
			int lastInt = n % 10;
			reverseNum = reverseNum * 10 + lastInt;
			
			n /= 10;
		}
		println("reversed num: " + reverseNum);
	}
}