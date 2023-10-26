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
		println("findFibonachNum: " + findFibonachiNum(secondNum, n));

		
	}
}