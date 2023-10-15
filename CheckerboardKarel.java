/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {
	public void run() {
		fillLineOddAvenuesWithBeepers();
		turnBack();
		while (leftIsClear()) {
			goUp();
			fillLineEvenAvenuesWithBeepers();
			turnBack();
			if (leftIsClear()) {
				goUp();
				fillLineOddAvenuesWithBeepers();
				turnBack();
				
			}
		}
		
		
	}

	private void goUp() {
		turnLeft();
		move();
		turnRight();
		
	}

	private void turnBack() {
		turnAround();
		while (frontIsClear()) {
			move();
		}
		turnAround();
	}

	private void fillLineEvenAvenuesWithBeepers() {
		while (frontIsClear()) {
			move();
			putBeeper();
			if (frontIsClear()) {
				move();
			}
		}
		
	}

	private void fillLineOddAvenuesWithBeepers() {
		putBeeper();
		while (frontIsClear()) {
			move();
			if (frontIsClear()) {
				move();
				putBeeper();
			}
		}
		
	}
	

}
