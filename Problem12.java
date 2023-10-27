import acm.graphics.GLine;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Problem12 extends GraphicsProgram {
	private static final int WINDOW_HEIGHT = 60;
	private static final int WINDOW_WIDTH = 30;
	private static final int BODY_HEIGHT = 200;
	private static final int BODY_WIDTH = 300;
	private static final int ROOF_HEIGHT = 100;
	
	public void run() {
		drawBody();
		drawRoof();
		drawWindows();
		drawDoor();
		
	}
	private void drawDoor() {
		// TODO Auto-generated method stub
		
	}
	private void drawWindows() {
		// TODO Auto-generated method stub
		
	}
	private void drawRoof() {
		double x1 = getWidth() / 2 - BODY_WIDTH / 2;
		double y1 = getHeight() /2;
		double x2 = getWidth() / 2;
		double y2 = getHeight() /2 - ROOF_HEIGHT;
		
		GLine leftRoof = new GLine(x1, y1, x2, y2);
		add(leftRoof);
		
		x1 = x2;
		y1 = y2;
		x2 = x1 + BODY_WIDTH / 2;
		y2 = getHeight() / 2;
		
		GLine rightRoof = new GLine(x1, y1, x2, y2);
		add(rightRoof);
		
		
		
		
	}
	private void drawBody() {
		GRect walls = new GRect(BODY_WIDTH, BODY_HEIGHT);
		add(walls, (getWidth() / 2) - (BODY_WIDTH / 2), (getHeight() / 2));
		
	}
}

		