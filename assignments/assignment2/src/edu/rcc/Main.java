package edu.rcc;

public class Main {

	public static void main(String[] args) {
		Robot robot = new Robot();
		RobotController rc = new RobotController(robot);
		RobotCommander robotCommander = new RobotCommander(rc);
		robotCommander.launch(55, 22);
	}

}
