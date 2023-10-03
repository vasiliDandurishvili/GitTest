import stanford.karel.Karel;

/*კარელი დგას 1x1 უჯრაზე, შეავსებინეთ მას მთელი სამყარო თითო ბრილიანტით. ანუ მთელ
სამყაროში ყველა უჯრაზე უნდა იდოს ზუსტად ერთი ბრილიანტი. ჩათვალეთ რომ საწყისი
სამყარო ცარიელი არ არის და გარკვეულ(ჩვენთვის უცნობ) უჯრებში თითო(მხოლოდ ერთი)
ბრილიანტი დევს. ამასთან გაითვალისწინეთ, რომ სამყაროს ზომები თქვენთვის უცნობია და
თქვენი პროგრამა უნდა მუშაობდეს ნებისმიერი ზომის სამყაროსათვის.
 */
public class problem_07 extends Karel{
	public void run(){
		if (noBeepersPresent()){
			putBeeper();
		}
		while (frontIsClear()){
			if (noBeepersPresent()){
				putBeeper();
				move();
			}else{
				move();
			}
		}
		
		while(frontIsBlocked()){
			turnLeft();
			move();
			turnLeft();
		}
		while (frontIsClear()){
			if (noBeepersPresent()){
				putBeeper();
				move();
			}else{
				move();
			}
		}
		while(frontIsBlocked()){
			for(int i=0; i<3; i++){
				turnLeft();
			}
			move();
			for(int i=0; i<3; i++){
				turnLeft();
			}
		}
		
	}
		
}