import acm.program.ConsoleProgram;

public class IsFatherOrNot extends ConsoleProgram {
	private int mostCommon = 0;
	private int currCommon ;
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
			currCommon = 0;
			for(int j = 0; j < fatherDNM.length(); j ++){
				if(childDNM.charAt(i) ==fatherDNM.charAt(j)){
					currCommon++;
					while(childDNM.charAt(i +1)  == fatherDNM.charAt(j +1)){
						currCommon++;
						i
					}
				}
			}
			
		}
		
		return false;
	}
}
