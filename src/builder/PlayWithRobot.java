package builder;

public class PlayWithRobot {
    public static void main(String[] args) {
        RobotBuilder oldStyleRobot = new OldRobotBuilder();
        RobotDirector director = new RobotDirector(oldStyleRobot);
        director.makeRobot();
        Robot robot = director.getRobot();
        System.out.println(robot.getRobotHead());
        System.out.println(robot.getRobotArms());
    }
}
