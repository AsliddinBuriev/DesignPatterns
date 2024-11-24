package builder;

public class Robot implements RobotPlan{
    private String robotHead;
    private String robotArms;
    private String robotLegs;
    private String robotTorso;


    public void setRobotHead(String head) {
        robotHead = head;
    }

    public void setRobotArms(String arms) {
        robotArms = arms;
    }

    public void setRobotLegs(String legs) {
        robotLegs = legs;
    }

    public void setRobotTorso(String torso) {
        robotTorso = torso;
    }

    public String getRobotHead() {
        return robotHead;
    }

    public String getRobotArms() {
        return robotArms;
    }

    public String getRobotLegs() {
        return robotLegs;
    }

    public String getRobotTorso() {
        return robotTorso;
    }
}
