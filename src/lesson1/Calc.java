package lesson1;

public class Calc {
    public static int sum(int dodanok1, int dodanok2){
        int tempRes = dodanok1 + dodanok2;
        System.out.println(tempRes);
        return tempRes;
    }

    public String sum(String line1, String line2){
        String temRes = line1 + line2;
        System.out.println("Result = " + temRes);
        return temRes;
    }
}
