import java.math.BigDecimal;

import acm.program.ConsoleProgram;
/*
მომხმარებელს შეყავს მთელი რიცხვი, დაბეჭდეთ რიცხვი რომელიც მიიღება ციფრების
შებრუნებით, 1256 -> 6521
 */
public class Problem_30 extends ConsoleProgram {
	public void run () {
		int n = readInt("enter the integer: ");
		double nLast = n / 10.0;
		String nAsString = "" + nLast;
		BigDecimal decimal = new BigDecimal(nAsString);
		
		
		BigDecimal Num1 = decimal.remainder(BigDecimal.ONE);
		println("firtsNum: " +  Num1);

	}
}