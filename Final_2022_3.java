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
		
		
	}
	private boolean reallySorted(ArrayList<Integer> a) {
		// TODO Auto-generated method stub
		return false;
	}
	private void swap(ArrayList<Integer> a, int i, int j) {
		int temp = a.get(i);
		a.set(i, j);
		a.set(j, temp);
		
	}
}
