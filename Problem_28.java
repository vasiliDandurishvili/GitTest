
import acm.program.ConsoleProgram;
/*
მომხმარებელს შეყავს დადებითი რიცხვები, მანამ სანამ არ შეიყვანს -1 ს, დაბეჭდეთ
რაოდენობა რამდენი ლუწი რიცხვი შეყვანა მომხმარებელმა.
 */
public class Problem_28 extends ConsoleProgram {
	private static final int SENTINEL = -1;
	
	public void run () {
		int numOfEvenIntegers = 0;
		while(true){
			int num_1 = readInt("enter the integer: ");
			boolean a = num_1 % 2 == 0;
			if(a){
				numOfEvenIntegers += 1;
			}
			if(num_1 == SENTINEL){
				break;
			}
		}
		println("Number of even integers: " + numOfEvenIntegers);
	}
}