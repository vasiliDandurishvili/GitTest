import java.util.ArrayList;

import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Final_joker extends ConsoleProgram{
	public void run(){
		println(joker(10000));
	}

	private double joker(int simulations) {
		RandomGenerator rgen = RandomGenerator.getInstance();
		int counter = 0;
		for(int j = 0; j < simulations;j++){
			ArrayList<Integer>[] c = new ArrayList[4];
			for(int k = 0; k < 4; k++){
				c[k] = new ArrayList<>();
			}
			ArrayList<Integer> cards = new ArrayList<Integer>();
			for(int i = 0; i < 36; i++){
				cards.add(i);
			}
			for(int i = 0; i < 36; i++){
				c[i % 4].add(cards.remove(rgen.nextInt(cards.size())));
			}
			if(c[0].contains(0) && c[0].contains(1)){
				counter++;
			}
		}
		
		return (double)counter / simulations;
	}

}
