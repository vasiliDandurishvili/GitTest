import acm.program.ConsoleProgram;
/*
მოხმარებელს შეყავს მთელი რიცხვი n, პროგრამამ უნდა დაბეჭდოს ფიბონაჩის მიმდევრობის
მე n წევრი.
 */
public class Problem_29 extends ConsoleProgram {
	public void run () {
		int n = readInt ("enter the integer: ");
		int firstNum = 0;
		int secondNum = 1;
		int k = 0;
		println("findFibonachNum: " + findFibonachiNum(firstNum, secondNum, n, k));
	}

	private int findFibonachiNum(int firstNum, int secondNum, int n, int k) {
		if(n == 1){
			return firstNum;
		}
		if(n == 2){
			return secondNum;
		}
		for(int i = 2; i <= n; i++){
			k = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = k;
		}
		return k;
	}
}
