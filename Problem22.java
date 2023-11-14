import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Problem22 extends GraphicsProgram {
	private static final int NUM_CELLS = 8;
	public void run() {
		double squareLength = Math.min((double)getWidth() / NUM_CELLS, (double)getHeight() / NUM_CELLS);
		double x = 0;
		double y = 0;
		for(int j = 0; j < NUM_CELLS; j++) {
			for (int i = 0;i < NUM_CELLS; i++) {
			GRect square = new GRect(squareLength, squareLength);
//			if ((i + j) % 2 == 1) {
//				square.setFilled(true);
//			}
			square.setFilled((i + j) % 2 == 1); 
			
			add(square, x, y);
			
			x += squareLength;
			
		}
		x = 0;
		y += squareLength;
		}

	}
	
}
