import acm.program.ConsoleProgram;

//46. დაწერეთ მეთოდი რომელსაც გადაეცემა სტიგნი და რომელიც აბრუნებს ამ სტრინგში
//ყველაზე ხშირ სიმბოლოს.
public class Problem_46 extends ConsoleProgram {
	private int mostChar = 0;
	private char mostC;

	public void run() {
		String text = readLine("enter text: ");

		for (int i = 0; i < text.length(); i++) {
			int currNum = 0;
			for (int j = 0; j < text.length(); j++) {
				if (text.charAt(i) == text.charAt(j)) {
					currNum++;
				}
			}
			if (currNum > mostChar) {
				mostChar = currNum;
				mostC = text.charAt(i);
			}
		}
		println("most offen char: " + mostC + " the number is: " + mostChar);
	}
}