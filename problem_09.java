import stanford.karel.SuperKarel;

/*კარელმა უნდა გაამრავლოს ორი რიცხვი, 2x1 უჯრაზე დევს n ცალი ბრილიანტი, 3x1 უჯრაზე
m ცალი ბრილიანტი, კარელმა 4x1 უჯრაზე უნდა დადოს n * m ბრილიანტი. ჩათვალეთ, რომ
კარელს ჩანთაში უსასრულო რაოდენობის ბრილიანტი აქვს.
 */
public class problem_09 extends SuperKarel{
	public void run(){
		move();
		mutliplieBeepers();
		splitBeepers();
//		დგას  3-2-ზე სახით ზევით
		addBeepers();
//		goHome();
	}

	private void addBeepers() {
		while(beepersPresent()){
			move();
			if(beepersPresent()){
				turnAround();
				move();
				turnRight();
				move();
				turnRight();
				while(beepersPresent()){
					pickBeeper();
					move();
					putBeeper();
					turnAround();
					move();
					turnAround();
				}
		}
	}	
}

	private void splitBeepers() {
		turnLeft();
		while(beepersPresent() ){
			pickBeeper();
			move();
			while(beepersPresent()){
				move();
			}
			if(noBeepersPresent()){
				putBeeper();
				goBack();
			}
			
		}
		move();
		
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
			turnLeft();
			move();
	}

	private void goBack() {
		turnAround();
		while(frontIsClear()){
			move();
		}
		turnAround();
	}
}