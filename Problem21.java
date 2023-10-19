import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class Problem21 extends GraphicsProgram {
	private static final int NUM_LINES = 11;
	public void run() {
		for (int i = 0; i < NUM_LINES; i++) {
			addVerticalLine(i);
			addHorizontalLine(i);
		}
		
		
	}
	private void addHorizontalLine(int i) {
		double y = i;
		double x1 = 0;
		double x2 = getWidth();
		double height = (double)getHeight() / (NUM_LINES - 1);
		
		GLine line = new GLine(x1, y, x2, y);
		add(line);
	}
	private void addVerticalLine(int i) {
		// TODO Auto-generated method stub
		
	}

}
