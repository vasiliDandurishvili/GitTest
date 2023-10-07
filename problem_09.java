import stanford.karel.SuperKarel;

/*კარელმა უნდა გაამრავლოს ორი რიცხვი, 2x1 უჯრაზე დევს n ცალი ბრილიანტი, 3x1 უჯრაზე
m ცალი ბრილიანტი, კარელმა 4x1 უჯრაზე უნდა დადოს n * m ბრილიანტი. ჩათვალეთ, რომ
კარელს ჩანთაში უსასრულო რაოდენობის ბრილიანტი აქვს.
 */
public class problem_09 extends SuperKarel{
	public void run(){
		move();
		mutliplieBeepers();
//		goHome();
	}

	private void mutliplieBeepers() {
		while (beepersPresent()){
			pickBeeper();
			turnLeft();
			while(frontIsClear()){
				move();
				putBeeper();
				if(frontIsBlocked()){
					goBack();
				}
			}
		}
		
	}

	private void goBack() {
		turnAround();
		while(frontIsClear()){
			move();
		}
		turnLeft();
	}
}