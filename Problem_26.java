import acm.program.ConsoleProgram;
/*
მომხმარებელს შეჰყავს ორი რიცხვი თქვენმა პროგრამამ უნდა დაბეჭდოს ამ ორი რიცხვის
უდიდესი საერთო გამყოფი
 */
public class Problem_26 extends ConsoleProgram {
	public void run () {
		int num_1 = readInt("enter first integer:");
		int num_2 = readInt("enter second integer:");
		
		int greatestCommonDenominator = 1;
		
		for (int i = 1; i <= num_1;i++){
			boolean divisionNum_1_WithoutRemainder = num_1 % i == 0;
			if(divisionNum_1_WithoutRemainder){
				for(int j = 1; j <= num_2; j++){
					boolean divisionNum_2_WithoutRemainder = num_2 % j == 0;
					if(divisionNum_2_WithoutRemainder){
						if(i == j){
							greatestCommonDenominator = greatestCommonDenominator * j;
						}
					}
				}
			}
		}
		println("the greatest common denominator: " + greatestCommonDenominator);
	}
}
