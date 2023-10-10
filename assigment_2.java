import stanford.karel.SuperKarel;
/*
  
 */
public class assigment_2 extends SuperKarel{
	public void run(){
		fillColumns();
		forBlockedFront();
		fillColumns();
	}

	private void forBlockedFront() {
		while(frontIsBlocked()){
			if (noBeepersPresent()){
				putBeeper();
				turnRight();
				}
		}
	}

	private void fillColumns() {
		turnLeft();
		while(frontIsClear()){
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
}
		
