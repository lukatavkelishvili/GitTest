import acm.program.ConsoleProgram;

public class Problem16 extends ConsoleProgram {
	public void run() {
		int a = readInt("Enter first number: ");
		int b = readInt("Enter second number: ");
		int c = readInt("Enter third number: ");
		
		int harm = 1 / (1 / a + 1 / b + 1 / c);
		println(harm);
	}

}
