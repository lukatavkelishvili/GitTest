import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Problem14 extends GraphicsProgram {
	private static final int FACE_WIDTH = 200;
	private static final int FACE_HEIGHT = 300;
	private static final int MOUTH_WIDTH = 80;
	private static final int MOUTH_HEIGHT = 30;
	private static final int EYES_WIDTH = 80;
	private static final int EYES_HEIGHT = 30;
	public void run() {
		drawRobot();
		
	}

	private void drawRobot() {
		drawFace();
		drawMouth();
		drawEyes();
		
	}

	private void drawFace() {
		GRect face = new GRect(FACE_WIDTH, FACE_HEIGHT);
		
		double x = getWidth() / 2 - FACE_WIDTH / 2;
		double y = getHeight() / 2 - FACE_HEIGHT / 2;
		
		add(face, x, y);
		
		
	}

	private void drawMouth() {
		// TODO Auto-generated method stub
		
	}

	private void drawEyes() {
		// TODO Auto-generated method stub
		
	}

}
