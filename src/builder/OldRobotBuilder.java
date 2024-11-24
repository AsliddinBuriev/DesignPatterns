package builder;

public class OldRobotBuilder implements RobotBuilder {
    private Robot robot;
    public OldRobotBuilder() {
        robot = new Robot();
    }

    public void buildRobotHead() {
        robot.setRobotHead("Tin Head");
    }

    public void buildRobotArm() {
        robot.setRobotArms("Blowtorch Arms");
    }

    public void buildRobotLegs() {
        robot.setRobotLegs("Roller Skate Legs");
    }

    public void buildRobotTorso() {
        robot.setRobotTorso("Tin Torso");
    }

    public Robot getRobot() {
        return robot;
    }
}
