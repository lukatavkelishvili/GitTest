import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class Problem21 extends GraphicsProgram {
	private static final int NUM_LINES = 11;
	public void run() {
		drawHorizontalLines();
		drawVerticalLines();
	}
	private void drawVerticalLines() {
		double n = getWidth() / 10;
		for (int x = 0; x < 11; x += n) {
			GLine vLine = new GLine(x, 0, x, getHeight());
			add(vLine);
		}
		
		
	}
	private void drawHorizontalLines() {
		// TODO Auto-generated method stub
		
	}
}