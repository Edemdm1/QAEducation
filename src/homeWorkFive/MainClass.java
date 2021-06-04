package homeWorkFive;

//Возможно будет полезно. Немного дополненное примерами задание ДЗ№5
//        -1)Создать новый класс по работе с массивами WorkWithMassive(кто был на занятии мы его уже создали).
//        2)В этом классе создать метод который будет создавать матрицу (тип int) по размеру NхN (на пример 3х3) и заполнять ее заданным значением, к примеру 8. После заполнения возвращать ее .
//        Пример:
//        8 8 8
//        8 8 8
//        8 8 8
//        -3)Также в этом классе создать метод fillingOfLeftDiagonal - метод должен принимать на вход матрицу, и значение для заполнения. Проверять квадратная ли она. Если да, то заполнять диагональ переданным значением и возвращать матрицу. Если не квадратная - выводить сообщение "Матрица не квадратная" и возвращать неизмененную матрицу
//        Пример: Диагональ из 5-к
//        5 8 8
//        8 5 8
//        8 8 5
//        4) Также в этом классе создать метод fillingOfRightDiagonal - аналогично fillingOfLeftDiagonal но заполнять правую диагональ
//        8 8 5
//        8 5 8
//        5 8 8
//        5) Метод по заполнению значениями сразу двух диагоналей указанyым значением
//        5 8 5
//        8 5 8
//        5 8 5
//        6) Метод выведения матрицы в консоль в "красивом виде" - строки - значения через пробел, а каждая строка с новой строки . Например
//        1 1 1
//        1 1 1
//        1 1 1
public class MainClass {
    public static int[] ourMassive = {1,2,3};
    public static void main(String[] args) {
        WorkWithMassive workWithMassive = new WorkWithMassive();
        workWithMassive.createMassive(3, 3, 8);
        int [][] massive = workWithMassive.createMassive(-5, -5, 7);
        workWithMassive.fillingOfLeftDiagonal(massive, 5);
        workWithMassive.fillingOfRightDiagonal(massive, 1);
        workWithMassive.fillingOfBothDiagonal(massive, 9);
        workWithMassive.showMatrix(massive);


    }
}
