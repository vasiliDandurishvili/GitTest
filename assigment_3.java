import stanford.karel.SuperKarel;
/*
  
 */
public class assigment_3 extends SuperKarel{
	public void run(){
		fillBoard();
	}

	private void fillBoard() {
		fillOneBoard();
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