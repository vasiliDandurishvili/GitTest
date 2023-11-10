import acm.program.*;
import acm.util.RandomGenerator;

public class Problem_37 extends ConsoleProgram {
	private static final int MIN_VALUE = 0;
	private static final int MAX_VALUE = 36;
	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {
		int betNumber = readBet();
		int rouletteNumber = spinRoulette();

		if (betNumber == rouletteNumber) {
			println("you won!");
		} else {
			println("you lose!");
		}
	}

	private int spinRoulette() {
		int rouletteReslt = rgen.nextInt(MIN_VALUE, MAX_VALUE);
		println("roulette result is: " + rouletteReslt);

		return rouletteReslt;
	}

	private int readBet() {
		while (true) {
		int bet = readInt("enter bet num(0-36): ");
			if (bet < 0 || bet > 36) {
				bet = readInt("enter bet num(0-36): ");
			} else {
				return bet;
			}

	 
	}
}
}