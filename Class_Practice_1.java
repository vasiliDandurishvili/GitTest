import java.awt.Color;
import acm.graphics.GPolygon;
import acm.graphics.*;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;

public class Class_Practice_1 extends ConsoleProgram {
	public void run(){
		String str1 = "mari";
		String str2 = "mari";
		String str3 = new String ("mari");
		String str4 = readLine("enter str4: ");
		
//		//jer gaaketebs mimatebas orive mxares da mere sheadarebs + > ==(prioritetulia).
//		println("1 ,2" + str1 == str2 + "" +str1.equals(str2));
//		println("1 ,3" + str1 == str3 + "" +str1.equals(str3));
//		println("1 ,4" + str1 == str4 + "" +str1.equals(str4));
		
		
		println("1 ,2" + (str1 == str2) + " " +str1.equals(str2));
		println("1 ,3" + (str1 == str3) + " " +str1.equals(str3));
		println("1 ,4" + (str1 == str4) + " " +str1.equals(str4));
	}
	
}