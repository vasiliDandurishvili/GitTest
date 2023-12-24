import java.util.ArrayList;

import acm.program.ConsoleProgram;

/**60. კონსოლიდან შეგვყავს რიცხვები მანამ სანამ არ შეიყვანთ -1-ს, დაბეჭდეთ შეყვანილი
რიცხვები შებრუნებული მიმდევრობით.*/
public class Problem_60 extends ConsoleProgram{
	public void run(){
		ArrayList <Integer> myList = new ArrayList<Integer>();
		
		while(true){
			int n = readInt("enter num: ");
			if(n != -1){
				myList.add(n);
			}else{
				break;
			}
		}
		for (int i = 0; i < myList.size(); i++){
			println(myList.get(myList.size() - i -1));
		}
	}

}
