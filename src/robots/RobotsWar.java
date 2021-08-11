package robots;

public class RobotsWar {
    public static void main(String[] args) {
        Robot workingRobot;
        RobotShot charShot = new RobotShot();

        System.out.println("START GAME");

        ConsoleWriter.printSetRobotName(1);
        String name1 = ConsoleWriter.getNameOfRobotFromConsole();

        ConsoleWriter.printSetRobotName(2);
        String name2 = ConsoleWriter.getNameOfRobotFromConsole();

        Robot robot1 = new Robot(name1, 100);
        Robot robot2 = new Robot(name2, 100);

        ListOfRobots.addRobot(robot1);
        ListOfRobots.addRobot(robot2);


        String exitChar = "P";
        do {
            for (int i = 0; i < ListOfRobots.getRobotArrayList().size(); i++) {
                workingRobot = ListOfRobots.getRobotArrayList().get(i);
                System.out.println(String.format("Shot the robot= %s", workingRobot.getRobotsName()));
                ConsoleWriter.printGameRules();
                String setInput = ConsoleWriter.getRandomKeyFromConsole();
                exitChar = setInput;
                if (exitChar.equals("P")) {
                    System.out.println("Game exit");
                    break;
                } else if (charShot.alphabet.contains(exitChar)) {

                    char[] charInput2 = exitChar.toCharArray();

                    if (workingRobot.getDamageKeys().contains(charInput2[0])) {
                        System.out.println(String.format("Great shot !!! Babah -20 points for the robot %s",workingRobot.getRobotsName()));
                        int health = workingRobot.getRobotsHealth();
                        workingRobot.setRobotsHealth(health - 20);
                        workingRobot.removeCharByIndex(charInput2[0]);

                        int healthNew = workingRobot.getRobotsHealth();
                        if (healthNew <= 0) {
                            ListOfRobots.removeRobotFromList(workingRobot);
                            System.out.println("-----");
                            System.out.println(String.format("Robot won %s",ListOfRobots.getRobotArrayList().get(0).getRobotsName()));
                            System.out.println("-----");
                            exitChar = "P";
                            break;
                        }
                    } else {
                        System.out.println("Maybe you will be lucky next time!");
                        System.out.println(" ");
                        continue;
                    }
                } else {
                    System.out.println("Invalid value entered!");
                    System.out.println("The move goes to another robot");
                    System.out.println(" ");
                    continue;
                }
            }
            System.out.println(String.format("Robot %s has %s life points left",robot1.getRobotsName(), robot1.getRobotsHealth()));
            System.out.println(String.format("Robot %s has %s life points left",robot2.getRobotsName(), robot2.getRobotsHealth()));
            System.out.println(" ");
        } while (!exitChar.equals("P"));
    }
}




