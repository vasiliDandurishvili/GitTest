import java.math.BigDecimal;

import acm.program.ConsoleProgram;

public class Problem_17 extends ConsoleProgram {

	public void run(){
//		calculateInDouble();
		calculateInBigDecimal();
	}
	
	
	private void calculateInBigDecimal() {
		double a = readDouble("Enter real number: ");
		String aAsString = "" + a;
		BigDecimal decimal = new BigDecimal(aAsString);
	
		int integerPart = decimal.intValue();
		BigDecimal franctionPart = decimal.remainder(BigDecimal.ONE);
	
		println("Integer part: " + integerPart);
		println("Franction part (as BigDecimal): " + franctionPart);
	}

	private void calculateInDouble(){
		double a = readDouble("Enter real number: ");
		int integerPart = (int)a;
		double fractionPart = (double) a - integerPart;
		
		println("print integer: " + integerPart);
		println("print double without integer:" + fractionPart);
	}
}