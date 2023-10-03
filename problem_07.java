import stanford.karel.Karel;

/*კარელი დგას 1x1 უჯრაზე, შეავსებინეთ მას მთელი სამყარო თითო ბრილიანტით. ანუ მთელ
სამყაროში ყველა უჯრაზე უნდა იდოს ზუსტად ერთი ბრილიანტი. ჩათვალეთ რომ საწყისი
სამყარო ცარიელი არ არის და გარკვეულ(ჩვენთვის უცნობ) უჯრებში თითო(მხოლოდ ერთი)
ბრილიანტი დევს. ამასთან გაითვალისწინეთ, რომ სამყაროს ზომები თქვენთვის უცნობია და
თქვენი პროგრამა უნდა მუშაობდეს ნებისმიერი ზომის სამყაროსათვის.
 */
public class problem_07 extends Karel{
	public void run(){
		fillLine();
//		while nextLineExists
		    moveToTheLine();
//			fillLine
		
	
	}

	private void moveToTheLine() {
		turnLeft();
		move();
		turnLeft();
		while (frontIsClear()){
			move();
		}
		turnAround();
	}

	private void turnAround() {
		turnLeft();
		turnLeft();
	}

	private void fillLine() {
		while (frontIsClear()){
			if(noBeepersPresent()){
				putBeeper();
			}
			move();
		}
		if (noBeepersPresent()){
			putBeeper();
		}
		
	}
		
		
		
		
		
	}
