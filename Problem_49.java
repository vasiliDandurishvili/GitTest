import acm.program.ConsoleProgram;

//49. დაწერეთ stringToInteger მეთოდი, რომელსაც გადაეცემა სტრინგი და აბრუნებს მთელ რიცხვს.
//ჩათვალეთ, რომ გადაცემული სტრინგი მხოლოდ ციფრებისგან შედგება და არ იწყება 0-ით.
//მაგალითად “234” გადაცემის შემთხვევაში მეთოდმა უნდა დააბრუნოს 234. ასევე ჩათვალეთ,
//რომ დაბრუნებული მნიშვნელობა დადებითია და ეტევა int-ში.
public class Problem_49 extends ConsoleProgram {
	public void run() {
		String numStr = "0";
		int num = strintToInt(numStr);
		
		println(num);
		println(num -1);
		println(num + 1);
//		math.pow(num, num)
	}

//	"7" -> 7
	private int strintToInt(String numStr) {
		int num = 0;
		for (int i = 0; i < numStr.length(); i++){
			char currCh = numStr.charAt(i);
			int currDigit = currCh - '0';
			num = num * 10 + currDigit;
		}
		return num;
	}


}