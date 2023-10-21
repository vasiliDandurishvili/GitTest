import acm.program.ConsoleProgram;
/*
მომხმარებელს შეჰყავს ორი რიცხვი თქვენმა პროგრამამ უნდა დაბეჭდოს ამ ორი რიცხვის
უმცირესი საერთო ჯერადი.
 */
public class Problem_25 extends ConsoleProgram {
	public void run () {
		int num_1 = readInt("enter first the integer:");
		int num_2 = readInt("enter second the integer:");
		for (int i = 1; i <= num_1; i++){
			boolean firstsDividers = num_1 % i ==0;
			if (firstsDividers){
				
			}
		}
		
	}
}	

//if(a == b){
//	continue
//}