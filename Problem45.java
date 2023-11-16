import acm.program.ConsoleProgram;

public class Problem45 extends ConsoleProgram {
	public void run() {
		String phrase = readLine("Enter word: ");
		char symbol = readLine("Enter symbol: ").charAt(0);
		symbolRepetition();
		
		
	}

	private int symbolRepetition(phrase) {
		int a = 0;
		for (int i = 0; i < phrase.length(); i++) {
			if (symbol.equals(phrase.charAt(i))) {
				a += 1;
			}
			return(a);
			
			
		}
		
	}

}
