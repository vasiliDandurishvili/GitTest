import acm.program.ConsoleProgram;

//45. მომხმარებელს კონსოლიდან შეჰყავს ტექსტი და სიმბოლო, თქვენმა პროგრამამ უნდა იპოვოს
//რამდენჯერ გვხვდება მოცემულ ტექსტში მოცემული სიმბოლო
public class Problem_45 extends ConsoleProgram {
	public void run() {
		int x = 0;
		String text = readLine("enter text: ");
		String symbolText = readLine("enter symbol: ");

		char symbol = symbolText.charAt(0);

		for (int i = 0; i < text.length(); i++) {
			if (symbol == text.charAt(i)) {
				x++;
			}
		}
		print(x);
	}
}
