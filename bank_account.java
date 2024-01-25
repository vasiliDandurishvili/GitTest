import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class bank_account extends ConsoleProgram {
	double money;
	ArrayList <Integer> deposits = new 	ArrayList<>(); 
	ArrayList <Integer> withdraws = new 	ArrayList<>(); 
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
			deposit.add(dep);
			money += dep;
			println("new balance: " + money);
		} else if (line2.equals("withdraw")) {
			int with = readInt("withdraw: ");
			withdraw.add(with);
			money -= with;
			println("new balance: " + money);
		}

	}

	private void transactions(double money) {
		String check = readLine("deposits or withdraw");
		if(check.equals("deposits")){
			for(int i = 0; i < deposits.size(); i++){
				println(i + "th deposit is :" + deposits.get(i));
			}
		}
		if(check.equals("withdraws")){
			for(int i = 0; i < withdraws.size(); i++){
				println(i + "th withdraws is :" + withdraws.get(i));
			}
		}
	}
}
