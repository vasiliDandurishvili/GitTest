import acm.program.ConsoleProgram;
/*
 * კონსოლიდან წაიკითხეთ n, შემდეგ წაიკითხეთ n ცალი მთელი რიცხვი და დაბეჭდეთ ჯამი
 */
public class Problem_20 extends ConsoleProgram {

	public void run(){
		int n_1 = readInt ("enter your number: ");
		int sum = 0;
		for (int i = 0; i < n_1; i++){
			int new_num = readInt("enter " + (i+1) + "th integer: ");
			sum += new_num;
			println((i+1) + " numbers sum: " + sum);
		}
	}
}