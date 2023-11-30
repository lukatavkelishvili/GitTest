import acm.program.ConsoleProgram;

public class Prosta extends ConsoleProgram {
	public void run() {
		int a = 5;
		println(factorial(a));
	}

	private int factorial(int a) {
		int b = 1;
		for (int i = 1; i <= a; i++) {
			b *= i;
		}
		return b;
	}

}
