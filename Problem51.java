import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Problem51 extends ConsoleProgram {
	public void run() {
		String text = readLine();
//		StringTokenizer tokenizer = new StringTokenizer(text);
		String editedText = removeDuplicates(text);
		println(editedText);
	}
	private String removeDuplicates(String text) {
		String result = "";
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			
			if (!result.contains("" + ch)) {
				result += ch;
			}
			
		}
			
		
			return result;
	}

}
