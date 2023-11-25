import java.awt.Color;
import acm.graphics.GPolygon;
import acm.graphics.*;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;

public class Class_Practice_1 extends ConsoleProgram {
	public void run(){
		for(int i = 0; i < 5; i++){
			int a = 5;
			while(true){
				println(i);
				i++;
				if(i == 10){
					break;
				}
			}
			println(i);
		}
	}
	
}