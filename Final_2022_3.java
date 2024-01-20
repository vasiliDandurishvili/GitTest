import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Final_2022_3 extends ConsoleProgram{
	public void run(){
		
	}
	private boolean sorted(ArrayList<Integer> a){
		
		for(int i = 0; i < a.size();i++){
			for(int j = i + 1; j < a.size();j++ ){
				swap(a, i, j);
				if(sortedWithReverse(a)){
					return true;
				}
				/**ukanac isev iseti gavxadot tu ar gamovida.*/
				swap(a,i,j);
			}
		}
		return false;
	}
	private boolean sortedWithReverse(ArrayList<Integer> a) {
		for(int i = 0; i < a.size();i++){
			for(int j = i + 1; j < a.size();j++ ){
				revereElems(a, i, j);
				if(reallySorted(a)){
					return true;
				}
				revereElems(a,i,j);
			}
		}
		return false;
	}
	private void revereElems(ArrayList<Integer> a, int i, int j) {
		int mid = (j - i + 1) / 2 ;
		/**swap each elements, i = 10 j = 20 =>  11<=>19, 12<=>18... .*/
		for(int k = 0; k < mid; k++){
			swap(a, i + k, j - k);
		}
		
	}
	private boolean reallySorted(ArrayList<Integer> a) {
		for(int i = 1; i < a.size(); i++){
			if(a.get(i) < a.get(i - 1)){
				return false.
			}
			
		}
		return true;
	}
	private void swap(ArrayList<Integer> a, int i, int j) {
		int temp = a.get(i);
		a.set(i, j);
		a.set(j, temp);
		
	}
}
