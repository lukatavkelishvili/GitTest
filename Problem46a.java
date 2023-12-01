import acm.program.ConsoleProgram;

//დაწერეთ მეთოდი რომელსაც გადაეცემა სტიგნი და რომელიც აბრუნებს ამ სტრინგში
//ყველაზე ხშირ სიმბოლოს.
public class Problem46a extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text: ");
		char common = mostCommonChar(text);
		println("In your text most common symbol is: " + common);
	}

	private char mostCommonChar(String text) {
		
		int prev = 0;
		int now = 0;
		char more = text.charAt(0);
		
		for (int i = 0; i < text.length(); i++) {
			if (prev > now) {
				more = text.charAt(i);
			}
			if (now > prev) {
			now = prev;
			now = 0;
			}
			if (more == text.charAt(i)) {
				now += 1;
			}
			
			
		}
		return more;
			
	}

}
