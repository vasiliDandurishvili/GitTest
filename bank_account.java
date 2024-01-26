import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class bank_account extends ConsoleProgram {
	double money = 100000;;
	ArrayList <Integer> deposits = new 	ArrayList<>(); 
	ArrayList <Integer> withdraws = new 	ArrayList<>(); 
	public void run() {
		while(true){
			String line = readLine("check balance or transaction?");
			if (line.equals("check balance")) {
				bandAccount();
			} else {
				transactions();
			}
		}
	}

	private void bandAccount() {
		String line2 = readLine("money: ");
		if (line2.equals("balance")) {
			println("balance: " + money);
		} else if (line2.equals("deposit")) {
			int dep = readInt("deposit: ");
			deposits.add(dep);
			money += dep;
			println("new balance: " + money);
		} else if (line2.equals("withdraw")) {
			int with = readInt("withdraw: ");
			withdraws.add(with);
			money -= with;
			println("new balance: " + money);
		}

	}

	private void transactions() {
		String check = readLine("deposits or withdraw");
		if(check.equals("deposits")){
			for(int i = 0; i < deposits.size(); i++){
				println(i + "th deposit is :" + deposits.get(i));
			}
		}
		if(check.equals("withdraws")){
			for(int i = 0; i < withdraws.size(); i++){
				println((i + 1) + "th withdraws is :" + withdraws.get(i));
			}
		}
	}
}
