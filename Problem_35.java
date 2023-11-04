//35. თქვენი ამოცანაა გააკეთოთ მონეტის აგდების სიმულაციები და დათვალოთ საშუალოდ
//რამდენჯერ უნდა ავაგდოთ მონეტა რათა ამოვიდეს ბორჯღალო

import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Problem_35 extends ConsoleProgram{
	
	private static final int MAX_EXPERIMENTS  = 1;
	private RandomGenerator rgen  = RandomGenerator.getInstance();
	
	public void run() {
		double sumFlips = 0;
		for( int i = 0; i < MAX_EXPERIMENTS; i++ ){
			int currFlips = holdExperiment();
			sumFlips += currFlips;
		}
		double avgFlips = sumFlips / MAX_EXPERIMENTS;
		println(avgFlips);
	}
	
	

	private int holdExperiment() {
		int numFlips = 0;
		while (true){
			numFlips++;
			boolean isHeads = rgen.nextBoolean();
			if (isHeads){
				break;
			}
		}
		return numFlips;
	}
}

