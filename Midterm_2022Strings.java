import acm.program.ConsoleProgram;

public class Midterm_2022Strings extends ConsoleProgram {
	public void run() {
		String s1 = readLine("enter text: ");
		String s2 = readLine("enter text: ");

		boolean isManipulation = manipulation(s1, s2);

		if (isManipulation) {
			println("true");
		} else {
			println("false");
		}
	}

	private boolean manipulation(String s1, String s2) {
		for (int i = 1; i < s1.length() - 1; i++) {
			String sub1 = s1.substring(0, i);
			String sub2 = s1.substring(i );
			if(canManupitale(sub1, sub2, s2)){
				return true;
			}
		}

		return false;
	}

	private boolean canManupitale(String sub1, String sub2, String s2) {
		
		return false;
	}

}
