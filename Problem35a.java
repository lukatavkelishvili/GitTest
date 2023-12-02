import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

//თქვენი ამოცანაა გააკეთოთ მონეტის აგდების სიმულაციები და დათვალოთ საშუალოდ
//რამდენჯერ უნდა ავაგდოთ მონეტა რათა ამოვიდეს ბორჯღალო
public class Problem35a extends ConsoleProgram {
	private static final int EXP = 100000;
	RandomGenerator rgen = RandomGenerator.getInstance();
	public void run() {
		int sumFlips = 0;
		for (int i = 0; i < EXP; i++) {
			int currFlips = experiment();
			sumFlips += currFlips;
		}
		double numOfFlips = sumFlips / EXP;
		println("Number of flips are: " + numOfFlips);
	}
	
	private int experiment() {
		int result = 0;
		while (true) {
			boolean isHead = rgen.nextBoolean();
			if (isHead) {
				break;
			}
		}
		
		return result;
	}

}
