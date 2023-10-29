import acm.program.ConsoleProgram;

/** 32. დაწერეთ პროგრამა რომელიც იპოვის და დაბეჭდავს 1000000 მდე ყველა მერტივ რიცხვს */


public class Problem_32 extends ConsoleProgram {
	public void run(){
		findThePrimes();
	}

	private void findThePrimes() {
		for(int i = 1; i <= 1000000; i++){
			int numOfDividers = 0;
			divisionWithoutARiminder(numOfDividers);
			if(numOfDividers == 2){
				println("the prime integer: " + i);
			}
		}
		
	}

	private void divisionWithoutARiminder(int numOfDividers) {
		for(int j = 1; j <= 1000000; j++){
			if(i % j == 0 ){
				numOfDividers += 1;
			}
		}
		
	}

}
