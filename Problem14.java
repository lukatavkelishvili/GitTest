import com.sun.prism.paint.Color;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Problem14 extends GraphicsProgram {
	private static final int FACE_WIDTH = 200;
	private static final int FACE_HEIGHT = 350;
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
		
//        face.setFilled(true);
//		face.setFillColor(Color.BLUE);
	    
		
		double x1 = getWidth() / 2 - FACE_WIDTH / 2;
		double y1 = getHeight() / 2 - FACE_HEIGHT / 2;
		
		add(face, x1, y1);
		
		
	}

	private void drawMouth() {
		GRect mouth = new GRect(MOUTH_WIDTH, MOUTH_HEIGHT);
		
		double x2 = getWidth() / 2 - MOUTH_WIDTH / 2;
		double y2 = getHeight() / 2 + FACE_HEIGHT / 2 - 2 * MOUTH_HEIGHT;
		
		add(mouth, x2, y2);
		
		
		
		
	}

	private void drawEyes() {
		// TODO Auto-generated method stub
		
	}

}
