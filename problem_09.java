import stanford.karel.Karel;

/*კარელმა უნდა გაამრავლოს ორი რიცხვი, 2x1 უჯრაზე დევს n ცალი ბრილიანტი, 3x1 უჯრაზე
m ცალი ბრილიანტი, კარელმა 4x1 უჯრაზე უნდა დადოს n * m ბრილიანტი. ჩათვალეთ, რომ
კარელს ჩანთაში უსასრულო რაოდენობის ბრილიანტი აქვს.
 */
public class problem_09 extends Karel{
	public void run(){
		move();
		while (beepersPresent()){
			pickBeeper();
			move();
			while(beepersPresent()){
				pickBeeper();
				move();
				putBeeper();
				move();
				putBeeper();
				turnAround();
				move();
				move();
				move();
				turnAround();
			}
		}
	}

	private void turnAround() {
		turnLeft();
		turnLeft();
		
	}
}