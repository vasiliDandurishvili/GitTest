import stanford.karel.SuperKarel;
/*
  
 */
public class assigment_2 extends SuperKarel{
	public void run(){
		fillColumns();
	}

	private void fillColumns() {
		while(frontIsClear()){
			turnLeft();
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
			if(frontIsClear()){
				for(int i=0;i<4;i++){
					move();
				}
				turnLeft();
			}
		}

}
		
}