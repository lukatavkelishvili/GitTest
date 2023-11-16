import acm.program.ConsoleProgram;

public class Problem45 extends ConsoleProgram {
	public void run() {
		String phrase = readLine("Enter word: ");
		char symbol = readLine("Enter symbol: ").charAt(0);
		symbolRepetition(phrase, symbol);
		
		
	}

	private int symbolRepetition(String phrase, char symbol) {
		int a = 0;
		for (int i = 0; i < phrase.length(); i++) {
			if (symbol == (phrase.charAt(i))) {
				a += 1;
			}
			
			
			
		}
		return(a);
		
	}

}
// f(x )  = x * 2 + 4;
// 
// f ( 5 ) = 5 * 2 + 4