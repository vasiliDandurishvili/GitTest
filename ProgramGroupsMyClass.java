import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ProgramGroupsMyClass {
	private Map<String, Double> studentScores;
	public ProgramGroupsMyClass (){
		studentScores = new HashMap<String, Double>();//es pirvelia
		
	}
	
	public ProgramGroupsMyClass (ArrayList<String> students){//es meore
		studentScores = new HashMap<String, Double>();
		for(String student: students){
			studentScores.put(student, null);
		}
	}
	public Double getScore(String student){
		if(!studentScores.containsKey(student)){
			System.out.println("no student: " + student);
			return null;
		}
		return studentScores.get(student);
	}
	public void setScore (double score){
		
	}
}

