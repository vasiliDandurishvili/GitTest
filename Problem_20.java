import acm.program.ConsoleProgram;
/*
 * კონსოლიდან წაიკითხეთ n, შემდეგ წაიკითხეთ n ცალი მთელი რიცხვი და დაბეჭდეთ ჯამი
 */
public class Problem_20 extends ConsoleProgram {

	public void run(){
		int x = readInt ("enter your number: ");
		int y = 0;
		for (int i = 0; i < x; i++){
			int a = readInt("enter " + (i+1) + "th integer: ");
			y = y + a;
			println(i + "_th numbers sum: " + y);
		}
	}
}