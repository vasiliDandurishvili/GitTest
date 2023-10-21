import java.math.BigDecimal;
import acm.program.ConsoleProgram;
/*
 მომხმარებელს შეჰყავს ორი რიცხვი თქვენმა პროგრამამ უნდა დაბეჭდოს ამ ორი რიცხვის
უმცირესი საერთო ჯერადი.
 */
public class Practice_1 extends ConsoleProgram {
	public void run () {
//		task 25
		int num_1 = readInt("enter first integer:");
		int num_2 = readInt("enter second integer:");
		
		int LeastCommonMultiple = num_1 * num_2;
		for (int i = 1; i <= num_1;i++){
			boolean divisionNum_1_WithoutRemainder = num_1 % i == 0;
			if(divisionNum_1_WithoutRemainder){
				for(int j = 1; j <= num_2; i++){
					boolean divisionNum_2_WithoutRemainder = num_2 % j == 0;
					if(divisionNum_2_WithoutRemainder){
						if(i == j){
							LeastCommonMultiple = LeastCommonMultiple / i;
						}else{
							println()
						}
					}
							
				}
			}
		}
		println("the least common multiple: " + LeastCommonMultiple);
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
////		task 17
//		calculateNumInBigDecimal();
//		
//	}
//
//	private void calculateNumInBigDecimal() {
//		double a = readDouble ("enter real number: " );
//		String a_AsString = "" + a;
//		BigDecimal decimal = new BigDecimal (a_AsString);
//		
//		int integerPart = decimal.intValue() ;
//		BigDecimal franctionPart = decimal.remainder(BigDecimal.ONE);
//		
//		println("Integer part: " + integerPart);
//		println("Franction part (as BigDecimal): " + franctionPart);
//	