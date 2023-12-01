import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Problem50 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text ");
//		StringTokenizer tokenizer = new StringTokenizer(text);
		StringTokenizer tokenizer = new StringTokenizer(text, " ");
//		int count = 0;
//		while (tokenizer.hasMoreTokens()) {
//			String token = tokenizer.nextToken();
//			count++;
//		}
		println(text);
		
	}

}
