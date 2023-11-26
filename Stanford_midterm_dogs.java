import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Stanford_midterm_dogs extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private int sumOfTreats = 0;

	public void run() {
		println("welcome to our dog opening! ");
		println("             ");
		cycleForDogs();
		println("At the Grand Opening, there will be " + sumOfTreats + " dog treats.");
	}
	private void cycleForDogs(){
		while(true){
			int luckyNum = rgen.nextInt(1,4);
			
			String dogName = readLine("what is your dog's name: ");
			if(dogName.equals("")){
				break;
			}
			int dogSize = readInt("how big is your dog? Enter a num: 1 - small, 2 - medium, 3 - big: ");
			if (dogSize == 1){
				println("oh boy! " + dogName + " gets 2 dog treats!");
				sumOfTreats += 2;
			}
			else if (dogSize == 2){
				println("oh boy! " + dogName + " gets 4 dog treats!");
				sumOfTreats += 4;
			}
			else if (dogSize == 3){
				println("oh boy! " + dogName + " gets 6 dog treats!");
				sumOfTreats += 6;
			}
			if (luckyNum == 1){
				println(dogName + " also won asqueaky toy");
			}
		}
	}
}