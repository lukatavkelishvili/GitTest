import acm.program.ConsoleProgram;

//დაწერეთ პროგრამა რომელიც დაადგენს შეყვანილი რიცხვი მარტივია თუ არა
public class Problem31 extends ConsoleProgram {
	public void run() {
		while (true) {
		int a = readInt("Enter number: ");
		if (isSimple(a) == true) {
			println("Your number is simple!");
		}else {
			println("Your number is't simple!");
		}
	}
	}

	private boolean isSimple(int a) {
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

}
