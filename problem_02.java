import stanford.karel.Karel;
/*
კარელი დგას 1x1 უჯრაზე. 5x1 უჯრაზე დევს 10 ცალი ბრილიანტი, კარელმა ათივე
ბრილიანტი უნდა გადაიტანოს 6x1 უჯრაზე.
 */
public class problem_02 extends Karel{
	public void run(){
		turnLeft();
		for(int i=0; i<4; i++){
			move();
		}
		for(int i=0; i<10; i++){
			pickBeeper();
		}
		move();
		for(int i=0; i<10; i++){
			putBeeper();
		}
	}
}
