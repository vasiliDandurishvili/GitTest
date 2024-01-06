import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import acm.program.ConsoleProgram;

/**65. 63-ე ამოცანის გაგრძელება. დაბეჭდეთ ადამიანი რომელსაც ყველაზე მეტი ადამიანი
ემეგობრება*/
public class Problem_65 extends ConsoleProgram{
	private static final String SENTINEL = "";
	Map <String, ArrayList<String>> myMap = new HashMap<>(); 
	
	public void run(){
		while(true){
			String follower = readLine("enter follower: ");
			if(follower.equals(SENTINEL)){
				break;
			}
			String person = readLine("enter person: ");
			
			if(!myMap.containsKey(follower)){
				myMap.put(follower, new ArrayList<String>());
			}
			ArrayList<String> currPersons = myMap.get(follower);
			currPersons.add(person);
		}
		println(myMap);
		
		int mostPersons = 0;
		String popularFriends = null;
		
		for(String follower: myMap.keySet()){
			int currPersons = myMap.get(follower).size();
			if(currPersons > mostPersons){
				mostPersons = currPersons;
				popularFriends = follower;
			}
		}
		println("person with most following: " + popularFriends);
	}
}
