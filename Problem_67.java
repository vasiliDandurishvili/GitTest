import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import acm.graphics.GImage;
import acm.program.GraphicsProgram;
/**67. გააკეთეთ ფოტოების აპლიკაცია. აპლიკაციას უნდა ჰქონდეს ტექსფილდი სადაც შეიძლება
ფოტოს(ფაილის) მისამართის ჩაწერა. ენტერზე დაჭერის შემდეგ ეს ფოტო უნდა გამოჩნდეს
ფანჯრის ცენტრში.*/
public class Problem_67 extends GraphicsProgram{
	private JTextField textField; 
	
	public void init(){
		textField = new JTextField(20);
		add(textField, SOUTH);
		textField.addActionListener(this);
		
//		addActionListeners();
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == textField){
			GImage image = new GImage (textField.getText());
			add(image, getWidth() / 2 - image.getWidth() / 2, getHeight() / 2 - image.getHeight() / 2 );
			
		}
	}

}
