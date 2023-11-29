import acm.program.ConsoleProgram;

public class Midterm_geometric_progression extends ConsoleProgram {
	public void run() {
		boolean check = false;
		int num1 = readInt("enter num: ");
		if (num1 == -1) {
			println("Not a geometric progression.");
			return;
		}
		int num2 = readInt("enter num: ");
		if (num2 == -1) {
			println("Not a geometric progression.");
			return;
		}
		double q = num2 / (double) num1;
		int num3 = readInt("enter num: ");
		if (num3 == -1) {
			println("Not a geometric progression.");
			return;
		}
		if(num3 / (double)num2 == q && num2 / (double)num1 == q){
			check = true;
		}
		while (true) {
			int numX = readInt("enter num: ");
			if (numX == num3 * q) {
				num3 = numX;
				continue;
			}
			if (numX != num3 * q && numX != -1){
				check = false;
			}
			if(numX == -1){
				break;
			}
		}
		if(check){
			println("Geometric progresion");
		}else {
			println("Not a geometric progression.");
		}
	}
}
