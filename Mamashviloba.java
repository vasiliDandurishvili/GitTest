import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import acm.program.ConsoleProgram;

public class Mamashviloba extends ConsoleProgram{
	private Map <String, HashSet<String>> sonDad = new HashMap<>();
	private Map <String, HashSet<String>> dadSon = new HashMap<>();
	String name;
	String fileName;
	public void run(){
		name = readLine("name: ");
		fileName = "mamashviloba";
		
		println(name + "'s cousins: " + getCousins(fileName, name));
	}
	private ArrayList<String> getCousins(String fileName, String name){
		try{
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			
			while(true){
				String line = reader.readLine();
				if(line == null){
					break;
				}else{
					int space = line.indexOf(" ");
					String son = line.substring(0, space);//second is exclusive
					String dad = line.substring(space + 1);
					if(!sonDad.containsKey(son)){
						sonDad.put(son, new HashSet<String>());
					}
					sonDad.get(son).add(dad);
					//axla piriqitac.
					if(!dadSon.containsKey(dad)){
						dadSon.put(dad, new HashSet<String>());
					}
					dadSon.get(dad).add(son);
					
					
				}
				reader.close();
			}
			
			
		}catch(IOException e){
			
		}
		
		return null;
		
	}
}
