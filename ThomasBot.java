package tap;
import robocode.*;
import java.awt.Color;

// API help: http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * ThomasBot - a robot by Thomas Peters
 */
public class ThomasBot extends Robot
{
	/**
	 * run: ThomasBot's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here
		setColors(Color.orange, Color.orange, Color.red); // body,gun,radar

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			ahead(100);
			turnGunRight(360);
			back(100);
			turnGunRight(360);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		fire(1);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		back(10);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		back(20);
	}	
}
