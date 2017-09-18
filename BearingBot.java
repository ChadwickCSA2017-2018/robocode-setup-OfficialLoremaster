package tap;
import robocode.*;
import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * BearingBot - a robot by (your name here)
 */
public class BearingBot extends Robot
{
	/**
	 * run: BearingBot's default behavior
	 */
	public void run() {
		// Colors
		setBodyColor(Color.blue);
		setGunColor(Color.blue);
		setRadarColor(Color.green);
		setBulletColor(Color.green);

		// Robot main loop
		while(true) {
			turnRadarRight(360);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent event) {
		turnRight(event.getBearing());
		fire(1);
		ahead(event.getDistance() + 5);
		scan();
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent event) {
		back(20);
	}	
}
