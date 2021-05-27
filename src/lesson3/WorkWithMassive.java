package lesson3;

public class WorkWithMassive {
    public void printMassive(int[] massive, int value) {
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] < value) {
                System.out.println(
                        massive[i] + " Element less than " + value);
            }else if (massive[i] == value){
                System.out.println(
                        massive[i] + " Element equals " + value);
            }else {
                System.out.println(
                        massive[i] + " Element is more than " + value);
            }
            
        }
    }
}
