/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * In this code we add the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends SuperKarel {
	public void run() {
		goToNewspaper(); //it will stand on newspaper
		pickBeeper();  // it is same to pick newspaper
		backToStartingPosition();  //in the end, Karel should be facing east.
	}

	private void backToStartingPosition() {
		turnAround();
		move();
		turnRight();
		move();
		turnLeft();
		for (int i = 0; i < 2; i++) {
			move();
		}
		turnAround();
		
		
	}

	private void goToNewspaper() {
		for (int i = 0; i < 2; i++) {
			move();
		}
		turnRight();
		move();
		turnLeft();
		move();
		
	}

	

}
