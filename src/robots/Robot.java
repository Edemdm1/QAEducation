package robots;

import java.util.ArrayList;

public class Robot {
    private String robotsName;
    private int robotsHealth;
    private ArrayList<Character> damageKeys;


    public Robot(String robotsName, int robotsHealth) {
        this.robotsName = robotsName;
        this.robotsHealth = robotsHealth;
        RobotShot charShot = new RobotShot();
        charShot.setRandomChar();
        this.damageKeys =charShot.getShotChar();
    }

    public void removeCharByIndex(char input) {
        for (int i = 0; i < damageKeys.size(); i++) {
            if (damageKeys.get(i) == input) {
                damageKeys.remove(i);
                break;
            }
        }
    }

    public String getRobotsName() {
        return robotsName;
    }

    public int getRobotsHealth() {
        return robotsHealth;
    }

    public void setRobotsHealth(int robotsHelth) {
        this.robotsHealth = robotsHelth;
    }


    public ArrayList<Character> getDamageKeys() {
        return damageKeys;
    }
}

