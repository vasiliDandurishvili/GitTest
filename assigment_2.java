import stanford.karel.SuperKarel;
/*
  
 */
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

	private void fillColumns() {
		while(frontIsClear()){
			fillEachColumn();
		}
		
	}

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
}
		
