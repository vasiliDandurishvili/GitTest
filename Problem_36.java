import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

//36. თქვენი ამოცანაა გააკეთოთ მონეტის აგდების სიმულაციები და დათვალოთ საშუალოდ
//რამდენჯერ უნდა ავაგდოთ მონეტა რათა 3-ჯერ ზედიზედ ამოვიდეს ბორჯღალო.


public class Problem_36 extends ConsoleProgram{
	
	private static final int MAX_EXPERIMENTS  = 100000;
	private RandomGenerator rgen  = RandomGenerator.getInstance();
	
	public void run() {
		for(int i = 0; i < 30; i++){
			int a = rgen.nextInt(1, 5);
			println(a);
		}
	}
	

}

