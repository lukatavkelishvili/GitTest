/*
 * File: MidpointFindingKarel.java
 * -------------------------------
 * When you finish writing it, the MidpointFindingKarel class should
 * leave a beeper on the corner closest to the center of 1st Street
 * (or either of the two central corners if 1st Street has an even
 * number of corners).  Karel can put down additional beepers as it
 * looks for the midpoint, but must pick them up again before it
 * stops.  The world may be of any size, but you are allowed to
 * assume that it is at least as tall as it is wide.
 * In this code I am assuming that width and height are equals.
 */

import stanford.karel.*;

public class MidpointFindingKarel extends SuperKarel {
	public void run() {
		goToLeftUpperCorner(); //Robot will stand on the left upper corner. In the end Karel should be facing east.
		while (rightIsClear()) {
		moveOneForwardAndTwoDown(); // robot moves one corner forward then turns right and moves two times, if the conditions are true.
		}
		putBeeper();
		
	}

	private void moveOneForwardAndTwoDown() {
		move();
		turnRight();
		move();
		if (frontIsClear()) {
			move();
		}
		turnLeft();
		
	}

	private void goToLeftUpperCorner() {
		turnLeft();
		while (frontIsClear()) {
			move();
		}
		turnRight();
		
	}

	

}
