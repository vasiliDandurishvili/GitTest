import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Final_joker extends ConsoleProgram{
	public void run(){
		println(joker(10000));
	}

	private double joker(int simulations) {
		RandomGenerator rgen = RandomGenerator.getInstance();
		int counter = 0;
		
		return (double)counter / simulations;
	}

}
