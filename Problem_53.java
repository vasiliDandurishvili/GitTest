import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import acm.program.ConsoleProgram;

/**53. დაწერეთ პროგრამა რომელიც ფაილიდან წაიკითხავს ტექტს და დათვლის შემდეგ
სტატისტიკებს: სიმბოლოების რაოდენობა, სიტყვების რაოდენობა(სიტყვები სფეისებით
გამოყოფილია ერთმანეთისგან), წინადადებების რაოდენობა. რამდენი წინდადება მთავრდება
წერტილით, კითხვის ნიშნით და ძახილის ნიშნით?*/
public class Problem_53 extends ConsoleProgram{
	private static final String FILENAME = "statistics.txt";
	public void run(){
		try {
			BufferedReader reader = new BufferedReader (new FileReader(FILENAME));
			
			String text = "";
			while(true){
				
			}
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
