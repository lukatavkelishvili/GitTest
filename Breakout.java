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
    private GOval ball;
    private double vx;
    private double vy;
    RandomGenerator rgen = RandomGenerator.getInstance();

    private int bricksCount = NBRICKS_PER_ROW * NBRICK_ROWS;
    private int livesLeft = NTURNS;


   

    private void initGame() {

        drawBricks();
        drawPaddle();
        drawBall();

        addMouseListeners();
    }
    
    private void drawBricks() {
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
    }
    
    private void drawPaddle() {
        paddle = new GRect(PADDLE_WIDTH, PADDLE_HEIGHT);
        double x = getWidth() / 2 - PADDLE_WIDTH / 2;
        double y = getHeight() - PADDLE_Y_OFFSET - PADDLE_HEIGHT;
        paddle.setFilled(true);
        add(paddle, x, y);
    }

    private void drawBall(){
        ball = new GOval(2 * BALL_RADIUS, 2 * BALL_RADIUS);
        ball.setFilled(true);
        add(ball, getWidth() / 2 - BALL_RADIUS, getHeight() / 2 - BALL_RADIUS);
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

    public void mouseMoved(MouseEvent e) {
        int mouseX = e.getX();

        if (mouseX >= PADDLE_WIDTH / 2 && mouseX <= getWidth() - PADDLE_Y_OFFSET) {
            paddle.setLocation(mouseX - PADDLE_WIDTH / 2, paddle.getY());
        }
    }

    
    
    /* Method: run() */
    /** Runs the Breakout program. */
    public void run() {

        initGame();
        playGame();
    }
    
    private void playGame() {

        while (true) {
            startGame();
            pause(PAUSE);
            restartBallAndPaddlePositions();
            livesLeft--;

            if (bricksCount == 0) {
                // win
            	removeGameAndShowMessage("YOU WON");
                break;
            }

            if (livesLeft == 0) {
                // lose
            	removeGameAndShowMessage("YOU LOSE");
                break;
            }
        }
    }
    
    private void startGame() {
    	
    	waitForClick();
    	
        vx = rgen.nextDouble(1.0, 3.0);
        vy = 3.0; 
        if (rgen.nextBoolean(0.5)) {
            vx = - vx;
        }

        while (true) {

            ball.move(vx,  vy);

            if (ball.getX() <= 0 || ball.getX() >= getWidth() - 2 * BALL_RADIUS) {
                vx = - vx;
            }
            if (ball.getY() <= 0) {
                vy = - vy;
            }

            if (ball.getY() >= getHeight() - 2 * BALL_RADIUS) {
                break;
            }

            GObject collider = getCollidingObject();
            if (collider == paddle) { 
            	vy = -vy;
            }
            else if (collider != null) { 
            	remove(collider);  
            	vy = - vy;
            	bricksCount --;
            	if(bricksCount == 0) {
            		break;
            	}
            }

            pause(PAUSE);
        }
    }

    

    private void restartBallAndPaddlePositions() {

        double paddleX = getWidth() / 2 - PADDLE_WIDTH / 2;
        double paddleY = getHeight() - PADDLE_Y_OFFSET - PADDLE_HEIGHT;

        paddle.setLocation(paddleX, paddleY);

        double ballX = getWidth() / 2 - BALL_RADIUS;
        double ballY = getHeight() / 2 - BALL_RADIUS;

        ball.setLocation(ballX, ballY);
    }


    private GObject getCollidingObject() {

         double x = ball.getX(); 
         double y = ball.getY();

        // check square corners
         if (getElementAt(x, y) != null) {
        	 return getElementAt(x, y);
         }
         if (getElementAt(x + 2 * BALL_RADIUS, y) != null) {
        	 return getElementAt(x + 2 * BALL_RADIUS, y);
         }
         if (getElementAt(x, y + 2 * BALL_RADIUS) != null) {
        	 return getElementAt(x, y + 2 * BALL_RADIUS);
         }
         if (getElementAt(x + 2 * BALL_RADIUS, y + 2 * BALL_RADIUS) != null) {
        	 return getElementAt(x + 2 * BALL_RADIUS, y + 2 * BALL_RADIUS);
         }

        return null;
    }
    
    private void removeGameAndShowMessage(String text) {
    	removeAll();
    	pause(500);
    	GLabel message = new GLabel(text);
    	double a = getWidth() / 2 - message.getWidth() / 2;
    	double b = getHeight() / 2 - message.getHeight() / 2;
    	add(message, a, b );
    	
    	println(text);
    }

   
}