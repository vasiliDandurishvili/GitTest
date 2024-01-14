import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JTextField;

import acm.graphics.GCompound;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

/**
 * 68. თქვენი ამოცანაა გრაფიკული პროგრამის საშუალებით გააკეთოთ ჩატი. ფანჯარაზე,
 * SOUTH რეგიონზე უნდა გქონდეთ ერთი ტექსტფილდი და ერთი ღილაკი ტექტით Enter.
 * ტექსტი მაინც უნდა გამოჩნდეს ეკრანის ბოლოში, შესაბამისად სულ პირველად
 * შეყვანილი ტექსტი გაქრება ეკრანიდან.
 */
public class Problem_69 extends GraphicsProgram {
	private static final int DISTANCE = 40;
	private JTextField textField;
	private JButton button;
	private double x = DISTANCE;
	private double y = DISTANCE;
	private GCompound messages;

	public void init(){
		textField = new JTextField (20);
		add(textField, SOUTH);
		textField.addActionListener(this);
		
		button = new JButton("enter");
		add(button, SOUTH);
		
		messages = new GCompound();
		add(messages);
		
		addActionListeners();
	}
	public void actionPerformed(ActionEvent e){
		println("here");
		
		if(e.getSource() == textField || e.getSource() == button){
			String text = textField.getText();
			println(text);
			drawText(text);
			textField.setText("");
		}
	}
	private void drawText(String text) {
		if(text.equals(null) || text.equals("")){
			return;
		}
		GLabel message = new GLabel (text);
		/**add message here and then on canvas.*/
		messages.add(message, x, y);
		add(messages, x, y);
		
		y += DISTANCE;
		
		fixPositionOfLastMessages();
		
	}
	private void fixPositionOfLastMessages() {
		if(messages.getHeight() + DISTANCE > getHeight()){
			double newY = getHeight() - messages.getHeight() - DISTANCE;
			messages.setLocation(messages.getX(), newY);
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}