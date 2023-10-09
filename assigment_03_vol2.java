import stanford.karel.SuperKarel;
/*
  
 */
public class assigment_03_vol2 extends SuperKarel{
	public void run(){
		fillOneBoard();
		completeTheBoard();
	}

	private void completeTheBoard() {
		while(frontIsClear()){
			move();
		}
		turnAround();
	}

	private void fillOneBoard() {
		putBeeper();
		while(frontIsClear()){
			if(noBeepersPresent()){
				putBeeper();
			}
			move();
			if(frontIsClear()){
				move();
				putBeeper();
			}
		}
		turnAround();
		while(frontIsClear()){
			move();
		}
		turnRight();
		move();
		turnRight();
//		if(frontIsClear()){
//			move();
//			putBeeper();
//		}
		
	}
	
		
}