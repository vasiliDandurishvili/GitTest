import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

/**matricis ganuleba.*/
public class Final_2022_2 extends ConsoleProgram{
	public void run(){
		
	}
	private void zero(int[][] matrix){
		int temp = findNumThatIsNotInMtx(matrix);
		
		changeMtxWithTmps(matrix,temp );
		changeTmpsWithZeros(matrix,temp);
	}
	private int findNumThatIsNotInMtx(int[][] matrix) {
		RandomGenerator rgen = RandomGenerator.getInstance();
		while(true){
			int tmp = rgen.nextInt();
			if(!contains(matrix,tmp)){
				return tmp;
			}
		}

	}
	private boolean contains(int[][] matrix, int tmp) {
		int row = matrix.length;
		int col = matrix[0].length;
		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
				if(matrix[i][j] == tmp){
					return true;
				}
			}
		}
		return false;
	}
	private void changeTmpsWithZeros(int[][] matrix, int tmp) {
		int row = matrix.length;
		int col = matrix[0].length;
		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
				if(matrix[i][j] == tmp){
					matrix[i][j] == 0;
				}
			}
		}
		
	}
	private void changeMtxWithTmps(int[][] matrix, int tmp) {
		int row = matrix.length;
		int col = matrix[0].length;
		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
				if(matrix[i][j] == 0){
					changeColWithTmps(matrix, j, tmp);
					changerowWithTmps(matrix, i, tmp);
				}
			}
		}
	}
	private void changerowWithTmps(int[][] matrix, int i, int tmp) {
		int row = matrix.length;
		int col = matrix[0].length;	
		
	}
	private void changeColWithTmps(int[][] matrix, int j, int tmp) {
		int row = matrix.length;
		int col = matrix[0].length;		
	}
}
