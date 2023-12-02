import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

//თქვენი ამოცანაა გააკეთოთ მონეტის აგდების სიმულაციები და დათვალოთ საშუალოდ
//რამდენჯერ უნდა ავაგდოთ მონეტა რათა 3-ჯერ ზედიზედ ამოვიდეს ბორჯღალო.
public class Problem36 extends ConsoleProgram {
	private static final int EXP = 100000;
	RandomGenerator rgen = RandomGenerator.getInstance();
	public void run() {
		
		int sum = 0;
		for (int i = 0; i < EXP; i++) {
			int curr = exp();
			sum += curr;
		}
		double nof = (double)sum / EXP;
		println(nof);
		
	}
	
	private int exp() {
		int flipNums = 0;
		int times = 0;
		while (true) {
			flipNums++;
			boolean isHead = rgen.nextBoolean();
			if (isHead) {
				times += 1;
			}
			if (times == 3) {
				break;
			}
		}
		return flipNums;
	}

}
