import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

//თქვენი ამოცანაა გააკეთოთ მონეტის აგდების სიმულაციები და დათვალოთ საშუალოდ
//რამდენჯერ უნდა ავაგდოთ მონეტა რათა ამოვიდეს ბორჯღალო
public class Problem35 extends ConsoleProgram {
	private static final int NUM_EXPERIMENTS = 1000;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run() {
		double sumOfFlips = 0;
		for (int i = 0; i < NUM_EXPERIMENTS; i++) {
			int currFlips = holdExperiment();
			sumOfFlips += currFlips;
		}
		double avgFlips = sumOfFlips / NUM_EXPERIMENTS;
		println ("Avg number of flips is: " + avgFlips);
		
	}
	private int holdExperiment() {
		int numFlips = 0;
		while (true) {
			numFlips += 1;
			boolean isHeads = rgen.nextBoolean();
			if (isHeads) {
				break;
			}
		}
		return numFlips;
	}

}
