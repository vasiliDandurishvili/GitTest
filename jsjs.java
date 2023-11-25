import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class jsjs extends GraphicsProgram{
	private GRect brick;
	private int currpaints = 0;
	private int maxPaints = 2;
	public void run(){
		addMouseListeners();

		createGrects();
		setBackground(Color.YELLOW);
		
	}

	private void createGrects() {
		for (int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				brick = new GRect (40 , 30);
				brick.setFilled(true);
				brick.setColor(Color.WHITE);
				double x = j * 40 + j * 5;
				double y = i * 30 + i * 5;
				add(brick, x, y);
				brick[i][j] = brick;
			}
		}
		
	}
	public void mouseClicked(MouseEvent e){
		if(getElementAt(e.getX(), e.getY()) == brick){
			brick.setColor(Color.BLACK);
			
		}
	}
}
