import acm.program.ConsoleProgram;

public class Problem_17 extends ConsoleProgram {

	public void run(){
		double a = readDouble("enter your number: ");
		int integerPart = (int)a;
		double fractionPart = (double) a - integerPart;
		println("print integer: " + integerPart);
		println("print double without integer:" + fractionPart);
	}
}