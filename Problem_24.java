import acm.program.ConsoleProgram;
/*
 მომხმარებელს შეყავს მთელი რიცხვი n, პროგრამამ უნდა დაბეჭდოს n ის გამყოფების
რაოდენობა
 */
public class Problem_24 extends ConsoleProgram {
	public void run () {
		int num_1 = readInt("enter the integer: ");
		int amountOfDividers = 0;
		for (int i = 1; i <= num_1; i++){
			boolean a = num_1 % i == 0;
			if (a){
				amountOfDividers +=1;
			}
			
		}
		println("amount of the dividers: " + amountOfDividers );
	}
}	

