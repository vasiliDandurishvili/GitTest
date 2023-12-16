import acm.program.ConsoleProgram;

/**31. დაწერეთ პროგრამა რომელიც დაადგენს შეყვანილი რიცხვი მარტივია თუ არა */

public class Problem_31 extends ConsoleProgram{
	public void run(){
		int num = readInt("enter the integer: ");
		int numOfDividers = 0;
		for (int i = 1; i <= num; i++){
			if (num % i == 0){
				numOfDividers += 1;
			}else{
				continue;
			}
		}
		if(numOfDividers == 2){
			println("An integer is prime!");
		}else{
			println("An integer is not prime!");
		}	
	}
}
