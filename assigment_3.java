import stanford.karel.SuperKarel;
/*
  
 */
public class assigment_3 extends SuperKarel{
	public void run(){
		fillOneBoard();
		completeTheBoard();
		fillOneBoard();
	}

	private void completeTheBoard() {
		while(frontIsClear()){
			move();
			turnAround();
		}
		
	}

	private void fillOneBoard() {
		putBeeper();
		while(frontIsClear()){
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
		
	}
	
		
}