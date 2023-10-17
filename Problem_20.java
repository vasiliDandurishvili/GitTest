import acm.program.ConsoleProgram;

public class Problem_20 extends ConsoleProgram {

	public void run(){
		int i = 0;
		int x = readInt ("enter your number: ");
		for (; i <= x; i++ ){
			i += i;
		}
		println("add integers until" + x + ":" + i );
	}
}