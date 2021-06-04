package lesson3;

public class MainClass {
//    Так же объявить массив и инициализировать его {2,4,26,7,28,10,9,20,33}.
//    Далее вывести в Цикле в консоль\лог :
//    Если элемент массива меньше 10 то Значение элемента + фразу "Элемент меньше десяти"
//    Если элемент равен 10 - то Значение элемента + фразу "Элемент равен десяти"
//    Если элемент массива больше 10 то Значение элемента + фразу " Элемент больше десяти"

    public static int[] ourMassive = {2,4,26,7,28,10,9,20,33};

    // 1 1 1
    // 2 2 2
    // 3 3 3

    public static void main(String[] args) {
        WorkWithMassive workWithMassive = new WorkWithMassive();
        workWithMassive.printMassive(ourMassive, 10);

        int[][] ourMassiveMassive = {{1,1,1},{2,2,2},{3,3,3}};
        Integer[][] ourMassiveMassive2 = new Integer[5][6];

        for (int i = 0; i < ourMassiveMassive.length; i++) {
            for (int j = 0; j < ourMassiveMassive[i].length; j++) {
//                System.out.print(ourMassiveMassive[ourMassiveMassive[i].length-1-j][j]);
                System.out.print(ourMassiveMassive[i][j]);
            }
            System.out.println();
        }
//        for (int i = ourMassiveMassive.length-1; i >= 0; i = i-1) {
//            for (int j = 0; j < ourMassiveMassive[i].length; j++) {
//                System.out.print(ourMassiveMassive[i][j] + " ");
//            }
//            System.out.println();
//        }

        //7 8 6
        //8 6 8
        //6 8 7
    }
}
