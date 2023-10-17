import acm.program.ConsoleProgram;

public class Problem_17 extends ConsoleProgram {

	public void run(){
		double x = readDouble("enter your number: ");
		println("print integer: " + (int) x);
		println("print double without integer:" + (x - (int) x));
	}
}