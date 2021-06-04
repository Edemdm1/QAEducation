package lesson5;

import java.util.HashMap;
import java.util.Map;

public class MainClassMap {
    public static void main(String[] args) {
//        login = Test
//        pass = 9090
        Map<String, String> ourMap = new HashMap();
        System.out.println(ourMap);
        ourMap.put("login", "Test");
        System.out.println(ourMap);
        ourMap.put("pass", "9090");
        System.out.println(ourMap);
        ourMap.put("autorization", "true");
        System.out.println(ourMap);

        if(ourMap.get("autorization").contains("true")){
            System.out.println("TRUE");
        }
        if (Boolean.parseBoolean(ourMap.get("autorization"))){
            System.out.println("Boolean True");
        }

    }
}
