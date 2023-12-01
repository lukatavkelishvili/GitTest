import acm.program.ConsoleProgram;

public class Prosta extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text: ");
		
		String reversedText = "";
		for (int i = 0; i < text.length(); i++) {
			reversedText = text.charAt(i) + reversedText;
			println(reversedText);
		}
	}
}


