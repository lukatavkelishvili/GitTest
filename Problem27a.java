//მომხმარებელს შეყავს n და m დაბეჭდეთ n^m

import acm.program.ConsoleProgram;

public class Problem27a extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter first number: ");
		int m = readInt("Enter second number: ");
		int power = numbersPower(n, m);
		println(power);
	}
	
	private int numbersPower(int n, int m) {
		int a = 1;
		for (int i = 0; i < m; i++) {
			a *= n;
		}
		return a;
	}

}
