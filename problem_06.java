import stanford.karel.Karel;
/*
*კარელმა უნდა შეკრიბოს ორი რიცხვი, 2x1 უჯრაზე დევს n ცალი ბრილიანტი, 3x1 უჯრაზე m
ცალი ბრილიანტი, კარელმა 4x1 უჯრაზე უნდა დადოს n+m ბრილიანტი. ჩათვალეთ, რომ
კარელს ჩანთაში უსასრულო რაოდენობის ბრილიანტი აქვს.
*/

public class problem_06 extends Karel{	

	public void run(){
		move();
		carryBeepersFrom2x1();
		carryBeepersFrom3x1();
		

			
		}

	private void carryBeepersFrom3x1() {
		move();
		while (beepersPresent()){
			pickBeeper();
			move();
			putBeeper();
			turnAround();
			move();
			turnAround();
		}
	}

	private void carryBeepersFrom2x1() {
		while (beepersPresent()){
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
