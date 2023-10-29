import java.math.BigDecimal;

import acm.program.ConsoleProgram;
/*
მომხმარებელს შეყავს მთელი რიცხვი, დაბეჭდეთ რიცხვი რომელიც მიიღება ციფრების
შებრუნებით, 1256 -> 6521
 */
public class Problem_30 extends ConsoleProgram {
	public void run () {
		int n = readInt("enter the integer: ");
		for(int i = 0; i < 3;i++ ){
			int divide = n / 10;
			double fraction = n / 10;
			int reverseNum = (int) (fraction * 10 - divide * 10);
			print(reverseNum);
			if(divide == 0){
				break;
			}
		}
	}
}