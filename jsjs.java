import acm.program.ConsoleProgram;

import java.awt.Color;

import acm.graphics.GOval;
import acm.program.*;

public class jsjs extends GraphicsProgram{

	public void run(){
			char a = 'a';
			int num = 5;
			GOval circle = new GOval(100, 100);
			String dukesPwd = "iloveCS106A";
			a = bark(num);
			squeak(circle, dukesPwd);
			println("all done!");
			}
			private char bark(int num){
			GOval circle = new GOval(150, 150);
			num += 25;
			return 'b';
			}
			private void squeak(GOval oval, String word){
			oval.setColor(Color.BLUE);
			word.toUpperCase();
			}
	}	
