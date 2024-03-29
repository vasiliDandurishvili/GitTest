import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

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
	
	private double prevY;

	public void init(){
		textField = new JTextField (20);
		add(textField, SOUTH);
		textField.addActionListener(this);
		
		button = new JButton("enter");
		add(button, SOUTH);
		
		messages = new GCompound();
		add(messages);
		
		addActionListeners();
		addMouseListeners();
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
		/**add message in GCompound and then on canvas.*/
		messages.add(message, x, y);
		
		y += DISTANCE;
		
		fixPositionOfLastMessages();
		
	}
	private void fixPositionOfLastMessages() {
		if(messages.getHeight() + DISTANCE > getHeight()){
			double newY = getHeight() - messages.getHeight() - DISTANCE;
			messages.setLocation(messages.getX(), newY);
		}
		
		
		
	}
	public void mousePressed(MouseEvent e){
		prevY = e.getY();
		
		
	}
	public void mouseDragged(MouseEvent e){
		/**we want to scrol if messages length is more than canvas.*/
		if(messages.getHeight() + DISTANCE <= getHeight()){
			return;
		}
		messages.move(0, e.getY() - prevY);
		
		prevY = e.getY();
		
		double minY = getHeight() - messages.getHeight() - DISTANCE;
		double maxY = 0;
		
		/**when we scrool at bottom messages.getY() is negative and if is less that minY we cannot scroll 
		 * more down.*/
		if(messages.getY() < minY){
			messages.setLocation(messages.getX(), minY);
		}/**when we scroll up messages.getY() is equals maxY and is 0 and we cannot 
		scroll more up.*/
		else if(messages.getY() > maxY){
			messages.setLocation(messages.getX(), maxY);
		}
	}
	
	
	
	
	
	
	
	
	

	
}