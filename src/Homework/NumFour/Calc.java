package Homework.NumFour;

public class Calc {
    public int division(int var1, int var2) {
        try {
            int result = var1/var2;
            System.out.println(result);
            return result;
        }catch (ArithmeticException e) {
            System.out.println("Error: division by zero " + e);
            return 77777;
        }catch (Exception e) {
            System.out.println("Error : " + e);
            return 99999;
        }finally {
            System.out.println("Integer division done");
        }
    }




    public double division(double var1, double var2) {
        try {
            double result = var1 / var2;
            System.out.println(result);
            return result;
        }catch (ArithmeticException e) {
            System.out.println("Error: division by zero " + e);
            return 77777;
        }catch (Exception e) {
            System.out.println("Error : " + e);
            return 99999;
        }finally {
            System.out.println("Double division done");
        }


    }
}
