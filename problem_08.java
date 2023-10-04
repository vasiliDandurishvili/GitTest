import stanford.karel.Karel;

/*კარელმა უნდა გამოაკლოს ორი რიცხვი, 2x1 უჯრაზე დევს n ცალი ბრილიანტი, 3x1 უჯრაზე
m ცალი ბრილიანტი, კარელმა 4x1 უჯრაზე უნდა დადოს n-m ბრილიანტი. ჩათვალეთ, რომ
კარელს ჩანთაში უსასრულო რაოდენობის ბრილიანტი აქვს და ჩათვალეთ, რომ n>=m.
 */
public class problem_08 extends Karel{
	public void run(){
		move();
		carryBeepersFrom2x1();
		checkBeepersOn3x1();
	}

	private void checkBeepersOn3x1() {
		move();
		while (beepersPresent()){
			pickBeeper();
			move();
			pickBeeper();
			turnAround();
			move();
			turnAround();
		}	
	}

	private void carryBeepersFrom2x1() {
		while(beepersPresent()){
			pickBeeper();
			move();
			move();
			putBeeper();
			turnAround();
			move();
			move();
			turnAround();
		}	
	}

	private void turnAround() {
		turnLeft();
		turnLeft();
		
	}	
}