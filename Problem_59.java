import acm.program.ConsoleProgram;
/**59. (2018 წლის გამოცდის ამოცანა)
გადმოგეცემათ nxm-ზე მატრიცა რომელშიც მხოლოდ 0-ები და 1-ები წერია. მეთოდმა
უნდა დააბრუნოს ამ მატრიცის ყველაზე დიდი ქვემართკუთხედის
ზომა(ელემენტების რაოდენობა) რომელიც მხოლოდ 1-ებისგან შედგება.
მაგალითად:
01100100
01111100
00111100
00111100
ამ მატრიცაში ყველაზე დიდი შიდა მართკუთხედი, რომელიც სულ ერთიანებისგან
შედგება არის 12 ზომის:
01100100
01111100
00111100
00111100
შესაბამისად ამ მატრიცაზე მეთოდმა უნდა დააბრუნოს 12. ჩათვალეთ რომ
გადმოცემულ მატრიცაში ერთი უჯრა მაინც იქნება რომელშიც წერია 1.*/
public class Problem_59 extends ConsoleProgram{
	public void run(){
		int[][] matrix1 = new int[][] {
			{0,1,1,0,0,1,0,0}, 
			{0,1,1,1,1,1,0,0},
			{0,0,1,1,1,1,0,0}, 
			{0,0,1,1,1,1,0,0},
		};
		int sum = maxArea(matrix1);

		println(sum);
	}

	private int maxArea(int[][] matrix1) {
		int maxArea =0;
		int nRows  = matrix1.length;
		int nCols = matrix1[0].length;
	
		/**get all rect. take the rects starting coordinate.*/
		for(int i1 = 0 ; i1 < nRows; i1++){
			for(int j1 = 0; j1 < nCols; j1++){
				
				/**take the rects last coordinate.*/
				for(int i2 = i1; i2 < nRows; i2++){
					for(int j2 = j1; j2 < nCols; j2++){
						
						if(hasOnlyOnes(matrix1, i1, j1, i2, j2)){
							int currArea = (i2 - i1 +1) * (j2 - j1 +1);
							maxArea = Math.max(maxArea, currArea);
						}
					}
				}
				
			}
		}
		return maxArea;
	}

	private boolean hasOnlyOnes(int[][] matrix1, int i1, int j1, int i2, int j2) {
		for(int i = i1; i < i2; i++){
			for(int j = j1; j < j2; j++){
				if(matrix1[i][j] != 1){
					return false;
				}
			}
		}
		return true;
	}
}
