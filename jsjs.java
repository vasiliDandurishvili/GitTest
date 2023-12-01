import acm.program.*;


public class jsjs extends ConsoleProgram {
	
	public void run() {
	int n = readInt("enter n: ");
	int m= readInt("enter m: ");
	// m > n
	println(log(n,m));

	}
	private int log(int n, int m){
		int result = 0;
		while(true){
			int sum = m / n;
			m = m / n;
			if(sum > 0){
				result++;
			}else{
				break;
			}
		}
		return result;
	}

	
}