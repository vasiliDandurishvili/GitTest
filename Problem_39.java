import acm.graphics.*;
import acm.program.GraphicsProgram;

//39. დაწერეთ პროგრამა სადაც იქნება კანვასზე ბურთის მოძრაობა მარცხენა კედლის შუა
//წერტილიდან მარჯვენა კედლამდე.
public class Problem_39 extends GraphicsProgram{
	private static final int R = 30;
	public void run(){
		GOval myOval = new GOval (R,R);
		double x = 0;
		double y = getWidth() / 2 - R / 2;
		
		add(myOval,x,y);
	}

}
