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
/*
this is a cycle to reach middle vertical line by moving up twice and once right,
When Karel passes X above, he will have passed nearly X/2 to the right and
when it will climb to the top it will go back to the bottom and stand in the
middle of the first horizontal and puts beeper.
*/
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
/*
this is a method to move karel from top to the bottom.	  
*/
	private void goDown() {
		turnAround();
		while(frontIsClear()){
			move();
		}
	}
}