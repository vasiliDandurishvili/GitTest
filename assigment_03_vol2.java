import stanford.karel.SuperKarel;

public class assigment_03_vol2 extends SuperKarel{
	public void run(){
		makeChessBoard();
	}
/*
this is a main method which contains all small and big steps.	  
 */
	private void makeChessBoard() {
		if (frontIsClear()){
			fillHorizontals();
		}else{
			fillVertical();
		}
	}
/*
this is a cycle to fill the one horizontal and   move to the
 second again and again Until we climb to the top. 
 */	
	private void fillHorizontals() {
		putBeeper();
		while (frontIsClear()){
			move();
			if(frontIsClear()){
				move();
				putBeeper();
			}
			if(frontIsBlocked()){
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
			putBeeper();
		}else{
			turnRight();
			move();
			turnRight();
			putBeeper();
		}
	}
	private void fillVertical() {
		turnLeft();
		putBeeper();
		while (frontIsClear()){
			move();
			if(frontIsClear()){
				move();
				putBeeper();
			}
		}
	}
}