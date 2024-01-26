import java.util.ArrayList;
import java.util.HashMap;

public class kuxnia {
	

	public ArrayList<String> kitchen(HashMap<String, ArrayList<String>> receipts,ArrayList<String> fridge) {
		ArrayList<String> result = new ArrayList<String>();
		while(true){
			ArrayList<String> dishes = new ArrayList<String>();
			for(String dish: receipts.keySet()){
				if(result.contains(dish)){
					continue;
				}
				if(fridge.contains(dish)){
					dishes.add(dish);
					continue;
				}
			}
		
			if(true){
				break;
			}
		}
		return result;
	}

}
