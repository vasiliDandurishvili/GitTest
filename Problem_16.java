import acm.program.ConsoleProgram;

public class Problem_16 extends ConsoleProgram {

	public void run(){
		println("this program gives us three numbers's harmonic.");
		double n1 = readInt ("enter n1: ");
		double n2 = readInt ("enter n2: ");
		double n3 = readInt ("enter n3: ");
		double harmonic = (double) 1 / ( 1 / n1) + ( 1 /  n2 ) + ( 1 /  n3 ) ;
		println("three integers harmonic: "+ harmonic + ".");
	}
}
//n1*n2*n3
//double harmonic = (double) 1 / (1 / n1 + 1 / n2 + 1 / n3);



