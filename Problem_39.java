import acm.graphics.*;
import acm.program.GraphicsProgram;

//39. დაწერეთ პროგრამა სადაც იქნება კანვასზე ბურთის მოძრაობა მარცხენა კედლის შუა
//წერტილიდან მარჯვენა კედლამდე.
public class Problem_39 extends GraphicsProgram{
	private static final int R = 100;
	private static final int PAUSE_TIME = 1000;

	public void run(){
		GOval myOval = new GOval (R,R);
		double x = 0;
		double y = getHeight() / 2 - R / 2;
		
		add(myOval,x,y);
		
		getCircleToTheCentre( x, myOval);
	}
	private void getCircleToTheCentre(double x,GOval myOval) {
		while (x < getWidth() / 2 ){
			myOval.move(5,0);
			pause(PAUSE_TIME);
		}
		
	}

}
