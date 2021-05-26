package lesson2;

public class MainClass {
    public static void main(String[] args) {
        Calc calc = new Calc();
        calc.sum(56, "35");
        System.out.println(calc.sum(57, "3a5"));

        calc.sum(1.5, "2.5");
        try {
            calc.sum(1.6, "2..5");
        } catch (Exception e) {
        System.out.println("Error");
    }
        int age1 = 15;
        int age2 = 20;

        int[] age = {15, 20, 25, 30, 26};
        System.out.println("" + age[0] + age[1] + age[2] + age[3]);
        System.out.println(age.length);
        System.out.println(age[4]);

        int[] ageNew = new int[10];
        ageNew[0] = 10;
        ageNew[5] = 51;
        System.out.println("" + ageNew[5] + ageNew[4]);

        System.out.println("---The End---");
    }
}
