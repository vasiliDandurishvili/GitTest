import javax.swing.JButton;
import javax.swing.JTextField;

import acm.program.GraphicsProgram;

/**68. თქვენი ამოცანაა გრაფიკული პროგრამის საშუალებით გააკეთოთ ჩატი. ფანჯარაზე, SOUTH
რეგიონზე უნდა გქონდეთ ერთი ტექსტფილდი და ერთი ღილაკი ტექტით Enter.
ტექსტი მაინც უნდა გამოჩნდეს ეკრანის ბოლოში, შესაბამისად სულ პირველად შეყვანილი
ტექსტი გაქრება ეკრანიდან. */
public class Problem_68 extends GraphicsProgram{
	private static final int DISTANCE = 40;
	private JTextField  textField;
	private JButton button;
	private double x = DISTANCE;
	private double y = DISTANCE;
	public void init(){
		textField = new JTextField(20);
		add(textField,SOUTH);
		
		textField.addActionListener(this);
		
		button = new JButton("enter");
		add(button,SOUTH);
		
		addActionListeners();
	}
	public void run(){
		
	}

}
