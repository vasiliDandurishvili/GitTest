import acm.program.ConsoleProgram;

public class Problem_18 extends ConsoleProgram {

	public void run(){
		int a = readInt("enter the first integer: ");
		int b = readInt("enter the second integer: ");
		if (a > b){
			println(a);
		}else{
			println(b);
		}
	}
}
