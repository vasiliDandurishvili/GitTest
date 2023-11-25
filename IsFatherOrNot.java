import acm.program.ConsoleProgram;

public class IsFatherOrNot extends ConsoleProgram {
	public void run(){
		String fatherDNM = readLine("father's DNM: ");
		String childDNM = readLine("father's DNM: ");
		
		boolean isFather = isFather(fatherDNM, childDNM);
		if(isFather){
			print("true");
		}else{
			print("false");
		}
	}
	private Boolean isFather(String fatherDNM,String childDNM){
		for(int i = 0; i < childDNM.length(); i++){
			for(int j = 0; j < fatherDNM.length(); j ++){
				
			}
			
		}
		
		return false;
	}
}
