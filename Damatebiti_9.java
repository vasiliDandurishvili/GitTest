import acm.graphics.GLabel;
import acm.program.GraphicsProgram;
/*
 გრაფიკულ პროგრამაში დაწერეთ ორი მეთოდი:
void tripleNum(int x) - მეთოდს გადაეცემა int ტიპის ცვლადი და შიგნით ასამმაგებს(ახალი ცვლადი არ შემოიტანოთ, x -ის მნიშვნელობა შეცვალეთ. გასამმაგების მერე  დაამატეთ GLabel ტექსტით: "x in method:"  + x  ( გამოაჩინეთ xის მნიშვნელობა.)
run-ში შექმენით ცვლადი x ,  და დაამატეთ GLabel ტექსტით: "x before method:"  + x  -> (გამოაჩინეთ xის მნიშვნელობა.)
ამის შემდეგ გამოიძახეთ თქვენი დაწერილი მეთოდი tripleNum , რომელსაც არგუმენტად გადასცემთ x-ს.
მეთოდის გამოძახების შემდეგ  დაამატეთ GLabel ტექსტით: "x after method:"  + x  -> 

ანუ საბოლოოდ კანვასზე უნდა იყოს 3 GLabel:
"x before method:"  + x
"x in method:"  + x
"x after method:"  + x

void paintRed(GRect rect) -  მეთოდს გადაეცემა GRect ტიპის ცვლადი და მას აფერადებს წითლად. გაფერადების შემდეგ  დაამატეთ GLabel ტექსტით: "color in method:"  +  rect.getColor() (გამოაჩინეთ თუ რა ფერისაა rect)
run-ში შექმენით ცვლადი rect , შეავსეთ და გააფერადეთ ლურჯად. დაამატეთ GLabel ტექსტით: "color before method:"  +  rect.getColor() (გამოაჩინეთ თუ რა ფერისაა rect). ამის შემდეგ გამოიძახეთ მეთოდი paintRed, რომელსაც არგუმენტად გადასცემთ თქვენს შექმნილ მართკუთხედს. მეთოდის გამოძახების შემდეგ  დაამატეთ GLabel ტექსტით: "color after method:"  +  rect.getColor() 

ანუ საბოლოოდ კანვასზე უნდა იყოს 3 GLabel:
"color before method:"  + rect.getColor()
"color in method:"  +  rect.getColor()
"color after method:"  +  rect.getColor()

 */
public class Damatebiti_9 extends GraphicsProgram {
	
	public void run() {
		int x = 4;
		GLabel label = new GLabel("x before method " + x);
		add(label, 0, 20);
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	}

}
