//მომხმარებელს შეყავს მთელი რიცხვი n, პროგრამამ უნდა დაბეჭდოს n ის გამყოფების
//რაოდენობა

import acm.program.ConsoleProgram;

public class Problem24 extends ConsoleProgram {
	public void run() {
		int n = readInt ("Enter number: ");
		println(numberOfDivider(n));
	}
	private int numberOfDivider(int n) {
		int a = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				a += 1;
			}
		}
		return a;
	}

}
