import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Bonus_20 extends ConsoleProgram{
	RandomGenerator g = RandomGenerator.getInstance();
	public void run(){
		int x = 0;
		int a = 0;
		double c = 0;
		for(int i = 0; i< 1000000; i++){
			
			for(int t = 0; t< 323; t++){
				
				
				int m = g.nextInt(-1,100) ;
				
				if(m == 0){
					x++;
				}
				a += m;
				
				
			}
			c += a/322.0 ;
			
			a =0;
			
		}
		
		println((c * 2 / 3 )/1000000);
		println(x);
		
		
	}

}
