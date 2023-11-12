import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Problem22 extends GraphicsProgram {
	private static final int NUM_CELLS = 8;
	public void run() {
		double squareLength = Math.min(getWidth() / NUM_CELLS, getHeight() / NUM_CELLS);
		
		for(int j = 0; j < NUM_CELLS; j++) {
			double x = 0;
			double y = 0;
			for (int i = 0;i < NUM_CELLS; i++) {
			GRect square = new GRect(squareLength, squareLength);
			
			add(square, x, y);
			
			x += squareLength;
			
		}
		y += squareLength;
		}

	}
	
}
