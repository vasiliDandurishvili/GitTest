import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Final_courses {

	public int courses(String filename) {
		HashMap <String, HashSet<String>> map = new HashMap<>();
		try{
			BufferedReader reader = new BufferedReader (new FileReader(filename));
			
			while(true){
				String line = reader.readLine();
				if(line == null){
					break;
				}
				String pre = line.substring(0, line.indexOf(":"));
				String aft = line.substring(line.indexOf(":") + 1);
				
				map.putIfAbsent(pre, new HashSet<>());
				map.putIfAbsent(aft, new HashSet<>());
				map.get(aft).add(pre);
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int count = 0;
		while(!map.isEmpty()){
			count++;
			Collection<String> subjects = new HashSet<>();
			for(String subject: map.keySet()){
				if(map.get(subject).isEmpty()){
					subjects.add(subject);
				}
			}
			for(String subject: subjects){
				map.remove(subject);
				for(String sub: map.keySet()){
					map.get(sub).remove(subject);//mapshi yvela ro waishleba anu morcha.
				}
			}
		}
		return count;
	}
}
