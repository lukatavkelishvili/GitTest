import acm.program.ConsoleProgram;

public class Problem27 extends ConsoleProgram {
	public void run() {
		int a = readInt("Enter number: ");
		int b = readInt("Enter power: ");
		
		println("number power: " + numberPower(a, b));
	}
	
	private int numberPower(int a, int b) {
		int pow = 0;
		for (int i = 1; i <= b; i++) {
			pow = a*a;
		}
		return pow;
		
		
		

	
	}

}
