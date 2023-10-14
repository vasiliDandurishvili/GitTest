import stanford.karel.SuperKarel;
/*
  
 */
public class assigment_03_vol2 extends SuperKarel{
	public void run(){
		makeChessBoard();
	}
/*
this is a main function which contains all small and big steps.	  
 */
	private void makeChessBoard() {
		if (frontIsClear()){
			fillHorizontals();
		}else{
//			fillVertical();
		}
	}
	
	private void fillHorizontals() {
		putBeeper();
		while (frontIsClear()){
			move();
			if(frontIsClear()){
				move();
				putBeeper();
			}else{
				goBackAndMoveToTheNextLine();
			}
			
		}
		
	}
	private void goBackAndMoveToTheNextLine(){
		turnAround();
		while(frontIsClear()){
			move();
		}
		if(rightIsClear()){
			moveToTheNextLine();
		}
		
	}
	private void moveToTheNextLine() {
		if(beepersPresent()){
			turnRight();
			move();
			turnRight();
			move();
		}else{
			turnRight();
			move();
			turnRight();
		}
	}
}