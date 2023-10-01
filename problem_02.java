import stanford.karel.Karel;
/*
კარელი დგას 1x1 უჯრაზე. 5x1 უჯრაზე დევს 10 ცალი ბრილიანტი, კარელმა ათივე
ბრილიანტი უნდა გადაიტანოს 6x1 უჯრაზე.
 */
public class problem_02 extends Karel{
	public void run(){
		turnLeft();
		move();
		move();
		move();
		move();
		pickBeeper();
		pickBeeper();
		pickBeeper();
		pickBeeper();
		pickBeeper();
		pickBeeper();
		pickBeeper();
		pickBeeper();
		pickBeeper();
		pickBeeper();
		move();
		putBeeper();
		putBeeper();
		putBeeper();
		putBeeper();
		putBeeper();
		putBeeper();
		putBeeper();
		putBeeper();
		putBeeper();
		putBeeper();

	}
}
