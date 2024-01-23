import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//63. კონსოლიდან შეგვყავს წყვილ-წყვილად მეგობრების სახელები, მანამ სანამ არ შევიყვანთ
//ცარიელ სტრინგს. დაბეჭდეთ იმ ადამიანის სახელი ვისაც ჰყავს ყველაზე მეტი მეგობარი.
//მეგობრობა შეიძლება იყოს ცალმხრივი. თუკი შევიყვანთ A-ს და B-ს, ეს ნიშნავს, რომ A არის
//B-ს მეგობარი, მაგრამ B შეიძლება არ იყოს A-ს მეგობარი.
//64. 63-ე ამოცანის გაგრძელება, დაბეჭდეთ თითოეული შეყვანილი სახელი და მის გასწვრივ
//მძიმით გამოყოფილი მეგობრების სია.
//65. 63-ე ამოცანის გაგრძელება. დაბეჭდეთ ადამიანი რომელსაც ყველაზე მეტი ადამიანი
//ემეგობრება
//66. 63-ე ამოცანის გაგრძელება. დაბეჭდეთ ორი ადამინი რომელთაც არ ჰყავთ საერთო მეგობრები

public class FriendGroup {
	private Map <String, ArrayList<String>> friendMap; 
	public FriendGroup(){
		friendMap = new HashMap<>();
		
	}
	
	public void addFriendship(String person, String friend){
		if(!friendMap.containsKey(person)){
			friendMap.put(person, new ArrayList<String>());
		}
//		friendMap.get(person).add(friend);
		ArrayList<String> friends = friendMap.get(person);
		friends.add(friend);
		
	
	}
	public String getPopularPerson(){
		int maxCount = 0;
		String popularPerson = null;
		for(String person: friendMap.keySet()){
			int friendCount = friendMap.get(person).size();
			if(friendCount > maxCount){
				maxCount = friendCount;
				popularPerson = person;
			}
		}
		
		return popularPerson;
	}
	public String getFriendsAsString(){
		
		
		return null;
	}
}









