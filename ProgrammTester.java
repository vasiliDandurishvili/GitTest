import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class ProgrammTester extends ConsoleProgram{
	
	public void run(){
		ArrayList<String> students = new ArrayList<>();
		students.add("vako1");
		students.add("vako2");
//		ProgramGroupsMyClass classB = new ProgramGroupsMyClass ();
		ProgramGroupsMyClass classB = new ProgramGroupsMyClass (students);
		
		println(classB.getScore("vako1"));
		println(classB.getScore("vako133"));
	}

}
