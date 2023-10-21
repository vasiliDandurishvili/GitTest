import java.math.BigDecimal;

import acm.program.ConsoleProgram;

public class Practice_1 extends ConsoleProgram {
	public void run () {
		calculateNumInBigDecimal();
		
	}

	private void calculateNumInBigDecimal() {
		double a = readDouble ("enter real number: " );
		String a_AsString = "" + a;
		BigDecimal decimal = new BigDecimal (a_AsString);
		
		int integerPart = decimal.intValue() ;
		BigDecimal fractionPart = decimal.remainder(BigDecimal.ONE);
		
	}
}