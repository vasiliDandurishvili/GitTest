import acm.program.ConsoleProgram;

/** 32. დაწერეთ პროგრამა რომელიც იპოვის და დაბეჭდავს 1000000 მდე ყველა მერტივ რიცხვს */


public class Problem_33 extends ConsoleProgram {
	public void run(){
		findThePrimes();
	}

	private void findThePrimes() {
		int k = 0;
		for(int i = 1; i <= 100000; i++){
			int numOfDividers = divisionWithoutARiminder(i);;
			
			if(numOfDividers == 2){
				k = i;
			//	println("the prime integer: " + i);
			}
		}
		println(k);
	}

	private int divisionWithoutARiminder(int i) {
		int numOfDividers = 0;
		
		for(int j = 1; j <= 100000; j++){
			if(i % j == 0 ){
				numOfDividers += 1;
			}
		}
		return numOfDividers;
	}
}