package lesson2;

public class Calc {
    /**
     *
     * @param var1 ex 56
     * @param var2 ex "35" -> 35
     * @return
     */
    public Integer sum(int var1, String var2) {
        try {
            int result = var1+Integer.parseInt(var2);
            System.out.println(result);
            return result;
        }catch (NumberFormatException e) {
            System.out.println("Error : " + e);
            return 88888;
        }catch (Exception e) {
            System.out.println("Error : " + e);
            return 99999;
        }finally {
            System.out.println("Finally");
        }
    }
    public Double sum (double var1, String var2) throws NumberFormatException{
        Double result = var1 + Double.parseDouble(var2);
        System.out.println(result);
        return result;
    }
}
