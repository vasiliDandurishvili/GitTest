import stanford.karel.SuperKarel;
public class assigment_2 extends SuperKarel{
	public void run(){
		fillAllColumns();
	}

	private void fillAllColumns() {
		turnLeft();
		fillColumns();
		forBlockedFront();
		fillColumns();
	}
/*
 * this is the cycle to move from one to second column and fill each column.
 */
	private void fillColumns() {
		while(frontIsClear()){
			fillEachColumn();
		}
		
	}
/*
 this is to fill only one column, go back and move to the next column with facing up.
 */
	private void fillEachColumn() {
		while(frontIsClear()){
			if(beepersPresent()){
				move();
			}else{
				putBeeper();
				if(frontIsClear()){
					move();
				}
			}
		}
		if(noBeepersPresent()){
			putBeeper();
		}
		turnAround();
		while(frontIsClear()){
			move();
		}
		turnLeft();
		if(frontIsClear()){
			for(int i=0;i<4;i++){
				move();
			}
			turnLeft();
		}
		
	}
/*
 forBlockedFront method is for columns which only include one square
 */
	private void forBlockedFront() {
		while(frontIsBlocked()){
			if (noBeepersPresent()){
				putBeeper();
				turnRight();
				for(int i=0;i<4;i++){
					move();
				}
				turnLeft();
			}
		}
	}
}
		
