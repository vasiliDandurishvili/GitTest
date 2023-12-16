import acm.program.ConsoleProgram;
/*
  მომხმარებელს შეყავს მთელი რიცხვი n, პროგრამამ უნდა დაბეჭდოს 1 დან n მდე რიცხვების
ჯამი 
 */
public class Problem_23 extends ConsoleProgram {
	public void run () {
		int amount = readInt("enter the amount of nums: ");
		int sum = 0;
		for (int i = 0; i <= amount; i++){
			sum += i;
		}
		println("sum: " + sum);
	}
}	