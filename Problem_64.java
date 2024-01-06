import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/**64. 63-ე ამოცანის გაგრძელება, დაბეჭდეთ თითოეული შეყვანილი სახელი და მის გასწვრივ
მძიმით გამოყოფილი მეგობრების სია.*/
import acm.program.ConsoleProgram;

public class Problem_64 extends ConsoleProgram {
	private static final String SENTINEL = "";
	Map<String, ArrayList<String>> myMap = new HashMap<>();
	
	public void run() {

		while (true) {
			String follower = readLine("enter follower: ");
			if (follower.equals(SENTINEL)) {
				break;
			}

			String person = readLine("enter person: ");

			if (!myMap.containsKey(person)) {
				myMap.put(person, new ArrayList<String>());
			}
			ArrayList<String> currFriends = myMap.get(person);
			currFriends.add(follower);

			// we don't need to call put again
			// friendLists.put(person, currFriends);
		}
		for(String person: myMap.keySet()){
			outputList(person);
		}

	}

	private void outputList(String person) {
		print(person + "'s followers: ");
		print(myMap.get(person).get(0));
		for(int i = 1; i < myMap.get(person).size(); i++){
			print(", " + myMap.get(person).get(i));
		}
		print(". ");
	}
}
