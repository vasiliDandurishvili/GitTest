import stanford.karel.SuperKarel;
/*
  
 */
public class assigment_3 extends SuperKarel{
	public void run(){
		fillBoard();
	}

	private void fillBoard() {
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