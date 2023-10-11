import stanford.karel.SuperKarel;
public class assigment_3 extends SuperKarel{
	public void run(){
		fillTheBoard();
	}
	private void fillTheBoard() {
		while(frontIsClear()){
		fillLine();
		goBackAndMoveToTheNextLineAndMoveOnce();
		fillLine();
		goBackAndMoveToTheNextLineAndMove();
		}
	}
	private void goBackAndMoveToTheNextLineAndMove() {
		if(frontIsBlocked()){
			turnAround();
			while(frontIsClear()){
				move();
			}
			turnRight();
			if(frontIsClear()){
			move();
			}
			turnRight();
		}
	}
	private void goBackAndMoveToTheNextLineAndMoveOnce() {
		if(frontIsBlocked()){
			turnAround();
			while(frontIsClear()){
				move();
			}
			turnRight();
			if(frontIsClear()){
			move();
			}
			turnRight();
			move();
		}
	}
	private void fillLine() {
			putBeeper();
			while(frontIsClear()){
				move();
				if(frontIsClear()){
					move();
					putBeeper();
				}
			}
	}
}