import acm.program.ConsoleProgram;

public class FriendGroupConsole_63 extends ConsoleProgram {
	private static final String SENTINEL = "";
	public void run() {
		FriendGroup myFriendGroup = new FriendGroup();
		
		while(true){
			String friend = readLine("enter friend: ");
			if(friend.equals(SENTINEL)){
				break;
			}
			String person = readLine("enter person: ");
			myFriendGroup.addFriendship(person, friend);
		}
	}
}
