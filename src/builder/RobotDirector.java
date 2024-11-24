package builder;

public class RobotDirector {
    private RobotBuilder builder;
    public RobotDirector(RobotBuilder builder) {
        this.builder = builder;
    }
    public Robot getRobot() {
        return this.builder.getRobot();
    }

    public void makeRobot() {
        this.builder.buildRobotHead();
        this.builder.buildRobotTorso();
        this.builder.buildRobotArm();
        this.builder.buildRobotLegs();
    }
}
