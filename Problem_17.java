import java.math.BigDecimal;

import acm.program.ConsoleProgram;

public class Problem_17 extends ConsoleProgram {

	public void run(){
		double a = readDouble("enter your number: ");
		calculateInDouble(a);
		calculateInBigDecimal(a);
	}
	
	
	private void calculateInBigDecimal(double a) {
		BigDecimal decimal= new BigDecimal(a);
		
		int integerPart = decimal.intValue();
		BigDecimal fractionPart = decimal.remainder(BigDecimal.ONE);
	}


	private void calculateInDouble(double a){
		int integerPart = (int)a;
		double fractionPart = (double) a - integerPart;
		
		println("print integer: " + integerPart);
		println("print double without integer:" + fractionPart);
	}
}