package homeworkNumSix;


//ДЗ№6
//        “   Test_String ”
//        1.  Убрать пробелы в начале и в конце стринги
//        2.  С указанной стринги оставить только слово Test
//        3.  Сделать проверку – если первый Не пустой символ строки ‘t’ или ‘T’ то вывести сообщениее «Первый символ - «Т»» если нет – то ничего не делать.
//        4.  Найти первую букву ‘s’ и заменить ее на  ‘y’
//        Это тренировка по работе со стрингами, поэтому делать ее можно прямо в мейне. Каждый пункт - это отдельное новое действие с исходной стрингой.
//
//        5. Создать лист hwList со значениями 22 , 33, 44 , 55  и вывести в консоль
//        6. Создать новый лист hwListReverse и в него переписать значения с первого в обратном порядке (т.е. 55, 44, 33, 22) и вывести в консоль
//        Это все тоже можно делать прямо в main


import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
           String line = new String("   Test_String ");

        System.out.println(line.trim());
        System.out.println(line.trim().substring(0, 4));
        if (line.trim().toUpperCase().startsWith("T")) {
            System.out.println("Первый символ - «Т");
        }else {
            System.out.println("Ничего не будем делать)");
        }

        System.out.println(line.replaceFirst("s", "y"));

        ArrayList<Integer> hwList = new ArrayList<Integer>();
        hwList.add(22);
        hwList.add(33);
        hwList.add(44);
        hwList.add(55);
        System.out.println(hwList);

        for (int i = 0; i < hwList.size(); i++) {
            System.out.println(i +1 + "." + hwList.get(i));
        }

        System.out.println();
        ArrayList<Integer> hwListReverse = new ArrayList<Integer>();

        for (int i = hwList.size() - 1; i >= 0 ; i = i - 1) {
            hwListReverse.add(hwList.get(i));
            System.out.println(hwListReverse);
        }

        System.out.println();
        for (int i = 0; i < hwListReverse.size(); i++) {
            System.out.println(i +1 + "." + hwListReverse.get(i));
        }
    }
}
