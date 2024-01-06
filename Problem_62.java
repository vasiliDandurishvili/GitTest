import java.util.HashMap;
import java.util.Map;

import acm.graphics.GObject;
import acm.graphics.GRect;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;
/**62. კონსოლიდან შეგვყავს სახელები, მანამ სანამ არ შევიყვანთ ცარიელ სტრინგს. დაბეჭდეთ
სახელი და მის გასწვრივ რაოდენობა რამდენჯერ შევიყვანეთ ეს სახელი.*/
public class Problem_62 extends ConsoleProgram{
	
	private static final String SENTINEL = "";
	
	public void run(){
		Map <String, Integer> myMap = new HashMap <String, Integer>();
		
		while(true){
			
			String name = readLine("enter name: ");
			
			if(name.equals(SENTINEL)){
				break;
			}
			if(!myMap.containsKey(name)){
				myMap.put(name, 0);
			}
			
			int nameNum = myMap.get(name) + 1;
			
			myMap.put(name, nameNum);
		}
		println(myMap);
	}

}
