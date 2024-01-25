import acm.program.ConsoleProgram;

public class bank_account extends ConsoleProgram {
	double money;

	public void run() {
		money = 1000;
		while (true) {
			String line = readLine("balance or transaction?");
			if (line.equals("check balance")) {
				bandAccount(money);
			} else {
				transactions(money);
			}
		}
	}

	private void bandAccount(double money) {
		String line2 = readLine("give money: ");
		if (line2.equals("balance")) {
			println("balance: " + money);
		} else if (line2.equals("deposit")) {
			int dep = readInt("deposit: ");
			money += dep;
			println("new balance: " + money);
		} else if (line2.equals("withdraw")) {
			int with = readInt("withdraw: ");
			money -= with;
			println("new balance: " + money);
		}

	}

	private void transactions(double money) {

	}
}
