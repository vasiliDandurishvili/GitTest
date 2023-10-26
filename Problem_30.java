import acm.program.ConsoleProgram;
/*
მომხმარებელს შეყავს მთელი რიცხვი, დაბეჭდეთ რიცხვი რომელიც მიიღება ციფრების
შებრუნებით, 1256 -> 6521
 */
public class Problem_30 extends ConsoleProgram {
	public void run () {
		int n = readInt("enter the integer: ");
		double m = 5.4;
		int x = (int) Math.min(n, m);
		println("x: " + x);

	}
}