import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class prolem_02CLASS extends ConsoleProgram {
	private static final int MIN_VALUE = 0;
	private static final int MAX_VALUE = 0;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
		int betNum = readBet();
		int ruletteNum = spinRoulette();
		
		if(betNum == ruletteNum){
			println("you win!!!");
		}else{
			println("you lose");
		}

	}

	private int readBet() {
		while(true){
			int bet = readInt("place your bet on number(0-36): ");
			if(bet < 0 || bet > 36){
				continue;
			}else{
				return bet;
			}
		}
	}

	private int spinRoulette() {
		int ruletteResult = rgen.nextInt(MIN_VALUE, MAX_VALUE);
		println("rulette result is: " + ruletteResult);
		
		return ruletteResult;
	}

}