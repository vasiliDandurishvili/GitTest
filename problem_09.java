import stanford.karel.SuperKarel;

/*კარელმა უნდა გაამრავლოს ორი რიცხვი, 2x1 უჯრაზე დევს n ცალი ბრილიანტი, 3x1 უჯრაზე
m ცალი ბრილიანტი, კარელმა 4x1 უჯრაზე უნდა დადოს n * m ბრილიანტი. ჩათვალეთ, რომ
კარელს ჩანთაში უსასრულო რაოდენობის ბრილიანტი აქვს.
 */
public class problem_09 extends SuperKarel{
	public void run(){
		move();
		mutliplieBeepers();
		turnLeft();
		move();
		mutliplieBeepers();
//		addBeepers();
//		goHome();
	}

	private void mutliplieBeepers() {
		pickBeeper();
		turnLeft();
			while(frontIsClear()){
				move();
				putBeeper();
				if(frontIsBlocked()){
					goBack();
					if(beepersPresent()){
						pickBeeper();
					}else{
						turnAround();
					}
			}
		}
	}

	private void goBack() {
		turnAround();
		while(frontIsClear()){
			move();
		}
		turnAround();
	}
}