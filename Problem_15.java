import acm.program.*;

public class Problem_15 extends ConsoleProgram {

	public void run(){
		println("this program gives us two numbers's middle.");
		int n1 = readInt ("enter n1: ");
		int n2 = readInt ("enter n2: ");
		double middle = (double) (n1 + n2) / 2;
		println("this is two integers middle: " + middle + ".");
	}
}




//public void run(){
//	println("this program adds two numbers.");
//	int n1 = readInt ("enter n1: ");
//	int n2 = readInt ("enter n2: ");
//	int total = n1 + n2;
//	println("the totalis" + total + ".");
//}