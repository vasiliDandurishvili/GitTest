import stanford.karel.SuperKarel;
/*
  
 */
public class assigment_2 extends SuperKarel{
	public void run(){
		fillColumns();
	}

	private void fillColumns() {
		turnLeft();
		while(rightIsClear()){
			while(frontIsClear()){
				if(beepersPresent()){
					move();
				}else{
					putBeeper();
					move();
				}
			}
			if(noBeepersPresent()){
				putBeeper();
			}
			turnAround();
			while(frontIsClear()){
				move();
			}
			turnLeft();
			for(int i=0;i<4;i++){
				move();
			}
		}

}
		
}