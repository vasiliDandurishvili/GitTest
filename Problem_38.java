import acm.program.*;
import acm.util.RandomGenerator;

/**
 * მოხმარებელს აქვს საწყისი თანხა 1000, თამაშობს მანამ სანამ არ წააგებს
 * ყველაფერს. ყოველ ჯერზე შეყავს ფსონის თანხა და რიცხვი რომელზეც დებს. ხდება
 * რულეტკის დატრიალების სიმულაცია(0-დან 36-მდე შემთხვევითი რიცხვი), მოგების
 * შემთხვევაში მოთამაშეს უორმაგედბა დადებული თანხა წაგების შემთხვევაში კი
 * მოთამაშე კარგავს დადებულ თანხას. მოთამაშე მოგებულია მაშინ თუ რულეტკაზე
 * ამოსული რიცხვი ემთხვევა მის მიერ დადებულ რიცხვს. პროგრამა ყოველ მოქმედებაზე
 * უნდა ბეჭდავდეს შესაბამის შეტყობინებას, ადვილად
 * 
 * რომ გაერკვეს მოთამაშე, რა რიცხვი ამოვიდა, რამდენი წააგო, რამდენი მოიგო,
 * რამდენი აქვს ბალანსი.
 */
public class Problem_38 extends ConsoleProgram {
	private static final int MIN_VALUE = 0;
	private static final int MAX_VALUE = 36;
	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {
		int balance = 1000;
		while (true) {
			if (balance == 0) {
				break;
			}

			int betNumber = readBet();
			int betAmount = enterBet(balance);

			int rouletteNumber = spinRoulette();

			if (betNumber == rouletteNumber) {
				balance += betAmount;
				println("you won! your balance is: " + balance);
			} else {
				balance -= betAmount;
				println("you lose! your balance is: " + balance);
			}
		}
	}

	private int enterBet(int balance) {
		while (true) {
			int amount = readInt("enter bet amount: ");
			if (amount > balance) {
				continue;
			} else {
				return amount;
			}

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
				continue;
			} else {
				return bet;
			}

		}
	}
}