import acm.program.ConsoleProgram;

//დაწერეთ პროგრამა რომელიც იპოვის და დაბეჭდავს 1000000 მდე ყველა მერტივ რიცხვს

public class Problem32 extends ConsoleProgram {
	public void run() {
		for (int i = 2; i <= 1000000; i++) {
			if (isPrime(i)) {
				println(i);
			}
		}
	}

	private boolean isPrime(int i) {
		for (int j = 2; j < i; j++) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}

}
