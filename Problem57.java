

import java.util.Arrays;

import acm.program.ConsoleProgram;

public class Problem57 extends ConsoleProgram {
	public void run() {
		String a = readLine("Enter first string: ");
		String b = readLine("Enter second string: ");
		if (anagram(a, b)) {
			println("True");
		}else {
			println("False");
		}
	}

	private boolean anagram(String a, String b) {
		if (Arrays.equals(getCountArray(a), getCountArray(b))) {
			return true;
		}
		return false;
	}
	
	private int[] getCountArray(String text) {
		int[] counts = new int[26];
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			int index = c - 'a';
			counts[index]++;
		}
		
		return counts;
	}

}
