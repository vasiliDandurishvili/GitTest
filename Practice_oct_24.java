import acm.program.ConsoleProgram;
/*
 23. მომხმარებელს შეყავს მთელი რიცხვი n, პროგრამამ უნდა დაბეჭდოს 1 დან n მდე რიცხვების
ჯამი
24. მომხმარებელს შეყავს მთელი რიცხვი n, პროგრამამ უნდა დაბეჭდოს n ის გამყოფების
რაოდენობა
 */
public class Practice_oct_24 extends ConsoleProgram{
	public void run () {
	
	int n = readInt("enter n: ");
	int sum = calculateSum(n);
	println("sum of numbers 1...n is: " + sum);
	
	
	int numDivisors = numberOfDividers( n);
	println("num of divisors: " + numDivisors);
	}

	private int calculateSum(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++){
			sum += i;
		}
		return sum;
	}
	
	private int numberOfDividers(int n){
		int num = 0;
		for (int i = 1; i <= n; i++){
			if(n % i == 0){
				num += 1;
			}
		}
		return num;
	}
	
}


