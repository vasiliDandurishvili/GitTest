import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class jsjs extends GraphicsProgram{
	
	public void run(){
		createGrects();
		addMouseListeners();
		
	}

	private void createGrects() {
		for (int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				GRect brick = new GRect ((getWidth() - 9 * 5) / 10 , (getHeight() - 9 * 5) /10);
//				brick.setFilled(true);
				double x = j * getWidth() / 10 + j * 5;
				double y = i * getHeight() /10 + i * 5;
				add(brick, x, y);
			}
		}
		
	}
}
