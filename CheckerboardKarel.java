/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * The CheckerboardKarel class draws
 * a checkerboard using beepers, as described in Assignment 1.  
 * My program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {
	public void run() {
		fillLineOddAvenuesWithBeepers(); // On current street every odd numbered corners will be filled with beeper
		turnBack(); // Robot will turn back from where it started previous command
		while (leftIsClear()) {
			goUp(); // robot goes up with one avenue at is looking east
			fillLineEvenAvenuesWithBeepers(); // On current street every even numbered corners will be filled with beeper
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
