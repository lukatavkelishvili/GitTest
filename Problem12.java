import acm.graphics.GLine;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Problem12 extends GraphicsProgram {
	private static final double HOUSE_WIDTH = 200;
	private static final double HOUSE_HEIGHT = 200;
	private static final double WINDOW_WIDTH = 200;
	private static final double WINDOW_HEIGHT = 200;
	public void run() {
		drawMidLine();
		drawHouse();
		
		
		//GRect wall = new GRect(300, 100);
		//add(wall, 100, 300);
		
		//GLine head = new head()
	}

	private void drawHouse() {
		drawWall();
//		drawWindows();
//		drawRoof();
//		drawDoor();
		
	}

	private void drawWall() {
		GRect wall = new GRect(HOUSE_WIDTH, HOUSE_HEIGHT);
		double x = getWidth() / 2 - HOUSE_WIDTH /2;
		double y = getHeight() - HOUSE_HEIGHT;
		add(wall, x, y);
		
	}

	private void drawMidLine() {
		double x1 = 0;
		double y1 = getHeight() / 2;
		double x2 = getWidth();
		double y2;
		GLine line = new GLine(x1, y1, x2, y2);
		add(line);
		
	}

}

		