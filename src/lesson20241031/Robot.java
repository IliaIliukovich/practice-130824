package lesson20241031;

public class Robot {

    private String name;
    private String description;
    private int version;
    private static int totalRobotCount = 0;

    private static final int ROBOT_DEFAULT_VERSION = 1;

    public Robot(String name, String description) {
        this.name = name;
        this.description = description;
        this.version = ROBOT_DEFAULT_VERSION;
        totalRobotCount++;
    }

    public void printCurrentRobotInfo() {
        System.out.println(this);
    }

    public static void printTotalRobotCount() {
        System.out.println("Total robot count: " + totalRobotCount);
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", version=" + version +
                '}';
    }
}
