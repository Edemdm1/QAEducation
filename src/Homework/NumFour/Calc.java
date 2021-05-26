package Homework.NumFour;

public class Calc {
    public double division(int var1, int var2) {
        try {
            double result = (double) var1/var2;
            System.out.println(result);
            return  result;
        }catch (ArithmeticException e) {
            System.out.println("Error: division by zero " + e);
            return 77777;
        }catch (Exception e) {
            System.out.println("Error : " + e);
            return 99999;
        }finally {
            System.out.println("Division done");
        }
    }




    public double division(double var1, double var2) {
        try {
            Double result = var1 / var2;
            System.out.println(result);
            System.out.println("Is result infinite : " + result.isInfinite());
            return result;
        }catch (Exception e) {
            System.out.println("Error : " + e);
            return 99999;
        }finally {
            System.out.println("Double division done");
        }


    }
}
