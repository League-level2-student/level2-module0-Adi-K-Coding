package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		// 2. create an array of 5 robots.
		Robot[] robots = new Robot[5];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up

		for (int i = 0; i < robots.length; i++) {
			robots[i].setY(400);
			robots[i].setX(200);
		}

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
//		Random r = new Random();
//		boolean isRacing=true;
//		while (isRacing==true) {
//		for (int i = 0; i < robots.length; i++) {
//			int x = r.nextInt(50);
//			robots[i].setSpeed(10);
//			robots[i].move(x);
//		if(robots[i].getY()<0) {
//			isRacing=false;
//		System.out.println("Robot "+(i+1)+" Wins!");
//		}
//		}
//		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
		Random r = new Random();

		boolean isRacing = true;
		while (isRacing == true) {
			for (int i = 0; i < robots.length; i++) {
				robots[i].setSpeed(9999999);
				robots[i].penDown();
				int x = (r.nextInt(10) + 1);
				for (int j = 0; j < x; j++) {
					robots[i].move(3);
					robots[i].turn(1);
				}
				if (robots[i].getY() < 405 && robots[i].getY() > 395 && robots[i].getX() < 210) {
					isRacing = false;
					System.out.println("Robot " + (i + 1) + " Wins!");
				}
			}
		}

	}
}