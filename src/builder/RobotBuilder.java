package builder;

public interface RobotBuilder {
    public void buildRobotHead();
    public void buildRobotArm();
    public void buildRobotLegs();
    public void buildRobotTorso();
    public Robot getRobot();
}
