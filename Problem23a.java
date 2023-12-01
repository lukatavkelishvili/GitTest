//მომხმარებელს შეყავს მთელი რიცხვი n, პროგრამამ უნდა დაბეჭდოს 1 დან n მდე რიცხვების
//ჯამი

import acm.program.ConsoleProgram;

public class Problem23a extends ConsoleProgram {
	public void run() {
		while (true) {
		int n = readInt("Enter number: ");
		println(sumN(n));
		}
		
	}
	private int sumN(int n) {
		int a = 0;
		for (int i = 1; i <= n; i++) {
			a += i;
		}
		return a;
	}

}
