import stanford.karel.SuperKarel;
public class assigment_3 extends SuperKarel{
	public void run(){
		fillTheBoard();
	}
	private void fillTheBoard() {
		fillLine();
	}
	private void fillLine() {
			putBeeper();
			while(frontIsClear()){
				move();
				if(frontIsClear()){
					move();
					putBeeper();
				}
			}
	}
}