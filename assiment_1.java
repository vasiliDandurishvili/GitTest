import stanford.karel.SuperKarel;
public class assiment_1 extends SuperKarel{
	public void run(){
		bringNewspaperAtHome();
	}
/*
this is a main method which contains all small and big steps.	  
 */
	private void bringNewspaperAtHome() {
		goOut();
//		stand on 6x3 and facing left
		pickNewspaper();
		returnHome();
	}
/*
this is a method to move karel to starting location.  
*/
	private void returnHome() {
		move();
		turnRight();
		move();
		turnLeft();
		doubleMove();
		turnAround();
	}
	
	private void pickNewspaper() {
		pickBeeper();
	}
/*
this is a method to move karel on the newspaper.  
*/
	private void goOut() {
		doubleMove();
		turnRight();
		move();
		turnLeft();
		move();
		turnAround();
	}

	private void doubleMove() {
		move();
		move();
	}
}