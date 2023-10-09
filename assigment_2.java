import stanford.karel.SuperKarel;
/*
  
 */
public class assigment_2 extends SuperKarel{
	public void run(){
		fillColumns();
	}

	private void fillColumns() {
		turnLeft();
		while (frontIsClear()){
			if(noBeepersPresent()){
				putBeeper();
			}
			move();
		}
		
	}
		
}