import acm.program.ConsoleProgram;
/*
მომხმარებელს შეყავს n და m დაბეჭდეთ n^m.
 */
public class Problem_27 extends ConsoleProgram {
	public void run () {
		int n = readInt("enter the integer: ");
		int m = readInt("enter the integer: ");
		
		int n_MultipleXm = 1;
		
		for (int i = 0; i < m; i++){
			n_MultipleXm *= n;

		}
		println("n^m: " + n);
	}
}