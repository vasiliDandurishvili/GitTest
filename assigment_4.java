import stanford.karel.SuperKarel;

public class assigment_4 extends SuperKarel{
	public void run(){
		putBeeperInTheMiddle();
	}
/*
this is a main method which contains all small and big steps.	  
*/
	private void putBeeperInTheMiddle() {
		if (frontIsBlocked()){
			putBeeper();
		}else{
			turnLeft();
			doubleMoveUpAndOneRight();
		}
	}
	private void doubleMoveUpAndOneRight() {
		while (frontIsClear()){
			move();
			if (frontIsClear()){
				move();
				turnRight();
				move();
				turnLeft();
			}
			if(frontIsBlocked()){
				goDown();
				putBeeper();
			}
		}
	}
	private void goDown() {
		turnAround();
		while(frontIsClear()){
			move();
		}
	}
}