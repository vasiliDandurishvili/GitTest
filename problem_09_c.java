import stanford.karel.SuperKarel;

/*კარელმა უნდა გაამრავლოს ორი რიცხვი, 2x1 უჯრაზე დევს n ცალი ბრილიანტი, 3x1 უჯრაზე
m ცალი ბრილიანტი, კარელმა 4x1 უჯრაზე უნდა დადოს n * m ბრილიანტი. ჩათვალეთ, რომ
კარელს ჩანთაში უსასრულო რაოდენობის ბრილიანტი აქვს.
 */
public class problem_09_c extends SuperKarel{
	public void run(){
		move();
		while (beepersPresent()) {
			pickBeeper();
			move();
			transferBeepers();
		}
	}
	
	// transfers beepers from third to fourth
	private void transferBeepers() {
		addBeepers();
		moveTwice();
		turnAround();
		returnBeepers();
		for (int i = 0; i < 3; i++) {
			move();
		}
		turnAround();
	}
	
	// adds beepers from third to fourth and fifth
	private void addBeepers() {
		while (beepersPresent()) {
			pickBeeper();
			move();
			putBeeper();
			move();
			putBeeper();
			turnAround();
			moveTwice();
			turnAround();
		}
	}
	
	// returns beepers from fifth to third
	private void returnBeepers() {
		while (beepersPresent()) {
			pickBeeper();
			moveTwice();
			putBeeper();
			turnAround();
			moveTwice();
			turnAround();
		}
	}
	
	private void turnAround() {
		turnLeft();
		turnLeft();
	}
	
	private void moveTwice() {
		move();
		move();
	}
}
		
