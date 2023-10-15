/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass repairs columns(of course, with beepers). 
 * We do not know exactly how many columns are in Karel world, so our code
 * should work for any world. Columns are in every four streets and the last
 * one is in the corner. Also, we do not know the height of columns.
 * In the end every column will have one beeper in every corner. 
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {
	public void run() {
		repairTheColumn(); // robot will put beepers in current avenue where there are no beepers, then it will turn back to the corner from where it started.
		while (frontIsClear()) {
			goToNextColumn(); // robot will stand on the next column avenue.
			repairTheColumn();
		}
		
	}

	private void goToNextColumn() {
		for (int i = 0; i < 4; i++) {
			move();
		}
		
	}

	private void repairTheColumn() {
		turnLeft();
		if (noBeepersPresent()) {
			putBeeper();
		}
		while (frontIsClear()) {
			move();
			if (noBeepersPresent()) {
				putBeeper();
			}
		}
		turnAround();
		while (frontIsClear()) {
			move();
			
		}
		turnLeft();
	}

	

}
