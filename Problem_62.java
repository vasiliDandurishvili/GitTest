import java.util.HashMap;

import acm.graphics.GObject;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

/**
 * 62. კონსოლიდან შეგვყავს სახელები, მანამ სანამ არ შევიყვანთ ცარიელ სტრინგს.
 * დაბეჭდეთ სახელი და მის გასწვრივ რაოდენობა რამდენჯერ შევიყვანეთ ეს სახელი.
 */
public class Problem_62 extends GraphicsProgram {
	private static final String SENTINEL = "";

	public void run() {
		HashMap<String, Integer> myMap = new HashMap<String, Integer>();

		while(true) {
			String name = readLine("Enter name: ");
			if(name.equals(SENTINEL)) {
				break;
			}

			if(!nameCounts.containsKey(name)) {
				nameCounts.put(name, 0);
			}

			int newCount = nameCounts.get(name) + 1;
			nameCounts.put(name, newCount);
		}

		println(myMap);
	}

}
