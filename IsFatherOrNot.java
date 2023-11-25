import acm.program.ConsoleProgram;

public class IsFatherOrNot extends ConsoleProgram {
	public void run(){
		String fatherDNM = readLine("father's DNM: ");
		String childDNM = readLine("father's DNM: ");
		
		boolean isFather = isFather(fatherDNM, childDNM);
		if(isFather){
			print("true");
		}else{
			print("false")
		}
	}	
}
