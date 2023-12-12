import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Problem60 extends ConsoleProgram {
	private static final int SENTINEL = -1;
	public void run() {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (true) {
			int n = readInt("Enter number: ");
			if (n == SENTINEL) {
				break;
			}
			
			list.add(n);
		}
		
		for (int i = 0; i < list.size(); i++) {
			println(list.get(i));
		}
	}

}
