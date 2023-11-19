/*
 * File: Breakout.java
 * -------------------
 * Name:
 * Section Leader:
 * 
 * This file will eventually implement the game of Breakout.
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Breakout extends GraphicsProgram {

/** Width and height of application window in pixels */
	public static final int APPLICATION_WIDTH = 400;
	public static final int APPLICATION_HEIGHT = 600;

/** Dimensions of game board (usually the same) */
	private static final int WIDTH = APPLICATION_WIDTH;
	private static final int HEIGHT = APPLICATION_HEIGHT;

/** Dimensions of the paddle */
	private static final int PADDLE_WIDTH = 60;
	private static final int PADDLE_HEIGHT = 10;

/** Offset of the paddle up from the bottom */
	private static final int PADDLE_Y_OFFSET = 30;

/** Number of bricks per row */
	private static final int NBRICKS_PER_ROW = 10;

/** Number of rows of bricks */
	private static final int NBRICK_ROWS = 10;

/** Separation between bricks */
	private static final int BRICK_SEP = 4;

/** Width of a brick */
	private static final int BRICK_WIDTH =
	  (WIDTH - (NBRICKS_PER_ROW - 1) * BRICK_SEP) / NBRICKS_PER_ROW;

/** Height of a brick */
	private static final int BRICK_HEIGHT = 8;

/** Radius of the ball in pixels */
	private static final int BALL_RADIUS = 10;

/** Offset of the top brick row from the top */
	private static final int BRICK_Y_OFFSET = 70;

/** Number of turns */
	private static final int NTURNS = 3;
	
	private static final double BRICK_X_OFFSET = (double)WIDTH / 2 - (double)(NBRICKS_PER_ROW * BRICK_WIDTH + (NBRICKS_PER_ROW - 1) * BRICK_SEP) / 2;
	
	private static final int PAUSE = 20;
	
	private GRect paddle;
	private int prevX;
	private int prevY;
	private GObject object;
	
	public void init() {
		
		for (int i = 0; i < NBRICK_ROWS; i++) {
			for (int j = 0; j < NBRICKS_PER_ROW; j++) {
				double x = BRICK_X_OFFSET + j * (BRICK_WIDTH + BRICK_SEP);
				double y = BRICK_Y_OFFSET + i * (BRICK_HEIGHT + BRICK_SEP);
				
				GRect brick = new GRect(BRICK_WIDTH, BRICK_HEIGHT);
				brick.setFilled(true);
				paintBricks(i, brick);
				add(brick, x, y);
			}
		}
		
		paddle = new GRect(PADDLE_WIDTH, PADDLE_HEIGHT);
		double x = getWidth() / 2 - PADDLE_WIDTH / 2;
		double y = getHeight() - PADDLE_Y_OFFSET - PADDLE_HEIGHT;
		paddle.setFilled(true);
		add(paddle, x, y);
		addMouseListeners();
		// sazgvrebshi ver chavsvi chogani jer
		
		
	}

	private boolean paintBricks(int i, GRect brick) {
		if (i < 2) {
			brick.setColor(Color.RED);
			return(true);
		}
		if (i < 4) {
			brick.setColor(Color.ORANGE);
			return(true);
		}
		if (i < 6) {
			brick.setColor(Color.YELLOW);
			return(true);
		}
		if (i < 8) {
			brick.setColor(Color.GREEN);
			return(true);
		}
		else {
			brick.setColor(Color.CYAN);
			return(true);
		}
	}

  public void mouseMoved(MouseEvent e){
    int mouseX = e.getX();

    if(mouseX >= PADDLE_WIDTH / 2 && mouseX <= getWidth() - PADDLE_Y_OFFSET){
      paddle.setLocation(mouseX - PADDLE_WIDTH / 2, paddle.getY());
    }
  }
	
	// public void mousePressed(MouseEvent e) {
	// 	prevX = e.getX();
	// 	prevY = e.getY();
	// 	object = getElementAt(prevX, prevY);
	// }
	
	// public void mouseDragged(MouseEvent e) {
	// 	if (object != paddle) {
	// 		object = null;
	// 	}
	// 	if (object != null) {
	// 		object.move(e.getX() - prevX, 0);
	// 		prevX = e.getX();
	// 	}
	// }
		
		
	RandomGenerator rgen = RandomGenerator.getInstance();
	private double vx;
	private double vy;
	private GObject collider;

/* Method: run() */
/** Runs the Breakout program. */
	public void run() {
		GOval ball = new GOval(2 * BALL_RADIUS, 2 * BALL_RADIUS);
		ball.setFilled(true);
		add(ball, getWidth() / 2 - BALL_RADIUS, getHeight() / 2 - BALL_RADIUS);
		
		vx = rgen.nextDouble(1.0, 3.0);
		if (rgen.nextBoolean(0.5)) {
			vx = - vx;
		}
		vy = 3.0;

		while (ball.getX() >= 0 && ball.getX() <= getWidth() - 2 * BALL_RADIUS && ball.getY() >= 0 && ball.getY() <= getHeight() - 2 * BALL_RADIUS) {
			while (true) {
				if (ball.getX() <= 0 || ball.getX() >= getWidth() - 2 * BALL_RADIUS) {
					vx = - vx;
				}
				if (ball.getY() <= 0 || ball.getY() >= getHeight() - 2 * BALL_RADIUS) {
					vy = - vy;
				}
				
		getCollidingObject(ball.getX(), ball.getY(), collider);
		if (collider == paddle) {
			vy = - vy;
		}
			
		
			
		
		ball.move(vx,  vy);
		pause(PAUSE);
			}
		}
	}
	
	private GObject getCollidingObject(double a, double b, GObject c) {
		if (getElementAt(a, b) == null) {
			return(null);
		}
		else {
			return(c);		
		}
	}

}