

import acm.program.*;

public class Practice_1 extends ConsoleProgram {
	
	/** this is the constant which's appear stops program.  */
	private static final int SENTINEL = 0;

	public void run() {
		println("program finds the largest and smallest numbers.");
		
		/** user enter the first integer  */
		int num1 = readInt("enter the integer: ");
		
		/** 
		 * if the first integer is program stoper (SENTINEL) constant  
		 * it outputs that there is  no legal numbers and the smallest and largest
		 * will be zero(0).
		 * */
		if (num1 == SENTINEL) {
			println("there is no positive integers");
		}
		
		/** the very first number will be both smallest an largest.  */
		int largest = num1;
		int smallest = num1;
		
		/** this is a cycle for users to enter the numbers
		 * untill they input SENTINEL.
		 * */
		while (num1 != SENTINEL) {			
			int num2 = readInt("enter the integer: ");
			
			if(num2 == SENTINEL){
				break;
			}
			
			/** if the number is bigger than previous largest integers
			 * it will become the largest.
			 *   */
			if(num2 > largest){
				largest = num2;
			}
			
			/** if the number is smallest than previous smallest integers
			 * it will become the smallest.
			 *   */
			if (num2 < smallest){
				smallest = num2;
			}


		}
		/** after the user input SENTINEL the program
		 * print the smallest and the largest numbers.
		 *   */
		println("smallest: " + smallest);
		println("largest: " + largest);

	}
}
