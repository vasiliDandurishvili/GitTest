import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import acm.program.ConsoleProgram;
/**63. კონსოლიდან შეგვყავს წყვილ-წყვილად მეგობრების სახელები, მანამ სანამ არ შევიყვანთ
ცარიელ სტრინგს. დაბეჭდეთ იმ ადამიანის სახელი ვისაც ჰყავს ყველაზე მეტი მეგობარი.
მეგობრობა შეიძლება იყოს ცალმხრივი. თუკი შევიყვანთ A-ს და B-ს, ეს ნიშნავს, რომ A არის
B-ს მეგობარი, მაგრამ B შეიძლება არ იყოს A-ს მეგობარი.*/
public class Problem_63 extends ConsoleProgram{
	private static final String SENTINEL = "";
	
	public void run(){
		Map <String, ArrayList<String>> myMap = new HashMap <>();
		
		while(true){
			String follower = readLine("enter follower: ");
			if(follower.equals(SENTINEL)){
				break;
			}
			
			String person = readLine("enter person: ");
			
			if(!myMap.containsKey(person)){
				myMap.put(person, new ArrayList<String>());
			}
			ArrayList<String> currFriends = myMap.get(person);
			currFriends.add(follower);
			
			// we don't need to call put again
//			friendLists.put(person, currFriends);
		}
		println(myMap);
		
		int maxFollowers = 0;
		String pupularPerson;
		
		for(String person: myMap.keySet()){
			int followers = myMap.get(person).size();
			if(followers > maxFollowers){
				maxFollowers = followers;
				pupularPerson = person;
			}
		}
		println("most popular person: " + pupularPerson);
	}

}
