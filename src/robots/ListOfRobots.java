package robots;

import java.util.ArrayList;

public class ListOfRobots {
    public static ArrayList<Robot> robotHashMap = new ArrayList<>();

    public static void addRobot (Robot robot){robotHashMap.add( robot);}

    public static ArrayList<Robot> getRobotArrayList(){
        return robotHashMap;
    }

    public  static  void removeRobotFromList(Robot robot){
        robotHashMap.remove(robot);
    }
}



