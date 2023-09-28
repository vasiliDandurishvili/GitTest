import stanford.karel.Karel;

//1. კარელი დგას 1x1 უჯრაზე. 3x1 უჯრაზე დევს ბრილიანტი,კარელმა ბრილიანტი უნდა
//გადაიტანოს 4x1 უჯრაზე და დაამთავროს მუშაობა.
public class problem01 extends Karel{
	public void run(){
		
		/*
		 * pre:karel is at 1x1, facing east, beeper at 3x1
		 * 
		 * 
		 *
		 */
		move();
		move();
		pickBeeper();
		move();
		putBeeper();
	}
}	