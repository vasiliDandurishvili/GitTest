import acm.program.ConsoleProgram;

public class IsFatherOrNot extends ConsoleProgram {
	private int mostCommon = 0;
	private int currCommon;

	public void run() {
		String fatherDNM = readLine("father's DNM: ");
		String childDNM = readLine("child's DNM: ");

		boolean isFather = isFather(fatherDNM, childDNM);
		if (isFather) {
			print("true");
		} else {
			print("false");
		}
	}

	private Boolean isFather(String fatherDNM, String childDNM) {
		for (int i = 0; i < childDNM.length(); i++) {
			for (int j = 0; j < fatherDNM.length(); j++) {
				currCommon = 0;
				while (i < childDNM.length() && j < fatherDNM.length() && childDNM.charAt(i) == fatherDNM.charAt(j)) {
					currCommon++;
					i++;
					j++;
				}
				i = i - currCommon; // while is mere swori pozicia.
				j = j - currCommon; // while is mere swori pozicia.
				if (currCommon > mostCommon) {
					mostCommon = currCommon;
				}

			}
		}
		return (mostCommon > fatherDNM.length() / 2);
	}
}
