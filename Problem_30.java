import java.math.BigDecimal;

import acm.program.ConsoleProgram;
/*
მომხმარებელს შეყავს მთელი რიცხვი, დაბეჭდეთ რიცხვი რომელიც მიიღება ციფრების
შებრუნებით, 1256 -> 6521
 */
public class Problem_30 extends ConsoleProgram {
	public void run () {
		int n = readInt("enter the integer: ");
		String nAsString = "" + n;
		BigDecimal decimal = new BigDecimal(nAsString);
		
		
		BigDecimal firstNum = decimal.remainder(BigDecimal.ONE);
		println("firtsNum: " +  firstNum);

	}
}