package robots;

import java.util.Scanner;

public class ConsoleWriter {
    public static String getNameOfRobotFromConsole(){
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.next();
        } catch (Exception e) {
            return "";
        }
    }

    public static String getRandomKeyFromConsole(){
      Scanner scanner = new Scanner(System.in);
        try {
            return scanner.next();
        } catch (Exception e) {
            return "";
        }
    }

    public static void printSetRobotName(int number) {
        System.out.println( number + " Enter robot`s name ");
    }

    public static void printGameRules() {
        System.out.println("Your step: pres key (QWEASDZXC)");
        System.out.println("To exit press 'P'");
    }
}
