import stanford.karel.Karel;

/*კარელი დგას 1x1 უჯრაზე. 5x1 უჯრაზე დევს 10 ცალი ბრილიანტი, კარელმა ათივე
ბრილიანტი უნდა გადაიტანოს 6x1 უჯრაზე.
 */
public class prolem_02CLASS extends Karel{
	public void run(){
		moveToTheBeeperPile();
		pickTenBeepers();
//		move();
		putTenBeepers();
		
	}

	private void putTenBeepers() {
		for (int i=0; i<4;i++){
			move();
		}
		
		
	}

	private void pickTenBeepers() {
		// TODO Auto-generated method stub
		
	}

	private void moveToTheBeeperPile() {
		// TODO Auto-generated method stub
		
	}
}