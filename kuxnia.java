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
				boolean can = true;
				for(String ingredient: receipts.get(dish)){
					if(!fridge.contains(ingredient) && !result.contains(ingredient)){
						can = false;
					}
				}
				if(can)
					dishes.add(dish);
			}
			if (dishes.isEmpty()) {
				break;
			}
			for (String dish : dishes) {
				result.add(dish);
			}
		}
		return result;
	}
}
