package lesson4;

import java.util.ArrayList;
import java.util.List;

public class MainClassList {
    public static void main(String[] args) {
        ArrayList<String> ourList = new ArrayList<String>();
        ourList.add("test");
        ourList.add("");

        ourList.add("test3");
        ourList.add("test4");
        System.out.println(ourList);
        System.out.println(ourList.get(2));
        System.out.println(ourList.size());


        for (int i = 0; i < ourList.size(); i++) {
            System.out.println(i + 1 +  "." + ourList.get(i));
        }

        int counter = 1;
        for (String element: ourList) {
            if (element.isEmpty()){
                System.out.println("Empty");
            }
            System.out.println(counter + "." + element);
            counter++;
        }

        System.out.println(ourList);
        ourList.remove(2);
        System.out.println(ourList);
        ourList.add(0, "Test5");
        System.out.println(ourList);
        ourList.add(0, "Test6");
        System.out.println(ourList);
        ourList.add(3, "Test8");
        System.out.println(ourList);

        for (int i = 0; i < ourList.size(); i++) {
            if (ourList.get(i).equals("Test5")){
                System.out.println("index = " + i);
                break;
            }
        }

        for (int i = 0; i < ourList.size(); i++) {
            if (ourList.get(i).toLowerCase().contains("test")){
                System.out.println("index = " + i);

            }
        }
    }
}
