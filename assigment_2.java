import stanford.karel.SuperKarel;
/*
  
 */
public class assigment_2 extends SuperKarel{
	public void run(){
		fillColumns();
	}

	private void fillColumns() {
		while (frontIsClear()){
			turnLeft();
			if(noBeepersPresent()){
				putBeeper();
			}
			move();
		turnAround();
		while(frontIsClear()){
			move();
		}
		turnLeft();
		for(int i=0;i<3;i++){
			move();
		}
	}
		
}
		
}