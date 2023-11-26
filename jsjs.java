import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class jsjs extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private int sumOfTreats = 0;

	public void run() {
		println("welcome to our dog opening! ");
		println("             ");
		cycleForDogs();
		println("At the Grand Opening, there will be" + sumOfTreats + " dog treats.");
	}
	private void cycleForDogs(){
		while(true){
			String dogName = readLine("what is your dog's name: ");
			
		}
		
	}
}
