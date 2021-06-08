package homeworkNumSeven;
//ДЗ 7 :
//        Создать класс WorkWithList с методами
//        /
//        *Method will add new List<String> to List
//        */
//        List<List<String>> addNewList(List<List<String>> ourList){}
//        /
//        * Method should add value to some List
//        * @param numberOfList
//        * @param value
//        */
//        List<List<String>> addValueToListList(int numberOfList, String value , List<List<String>> ourList){}
///**
// * Method should print Every List on new line
// */
//private void printListList(List<List<String>> ourList){}
//        }
//
//        и имплиментировать методы так, что бы  код с основной программы
//
//        WorkWithList workWithList = new WorkWithList();
//        List<List<String>> ourList = new ArrayList<>();
//
//        workWithList.addNewList(ourList);
//        ourList = workWithList.addValueToListList(0,"test01",ourList);
//
//        workWithList.addNewList(ourList);
//        ourList = workWithList.addValueToListList(1,"test11",ourList);
//        ourList = workWithList.addValueToListList(1,"test12",ourList);
//        ourList = workWithList.addValueToListList(0,"test02",ourList);
//
//        workWithList.addNewList(ourList);
//        workWithList.addValueToListList(2,"test21", ourList);
//        workWithList.addValueToListList(1,"test13", ourList);
//
//        приводил к такому выводу в консоль
//        ---------
//        []
//        ---------
//        [test01]
//        ---------
//        [test01]
//        []
//        ---------
//        [test01]
//        [test11]
//        ---------
//        [test01]
//        [test11, test12]
//        ---------
//        [test01, test02]
//        [test11, test12]
//        ---------
//        [test01, test02]
//        [test11, test12]
//        []
//        ---------
//        [test01, test02]
//        [test11, test12]
//        [test21]
//        ---------
//        [test01, test02]
//        [test11, test12, test13]
//        [test21]

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        WorkWithList workWithList = new WorkWithList();
        List<List<String>> ourList = new ArrayList<>();

        workWithList.addNewList(ourList);
        ourList = workWithList.addValueToListList(0,"test01",ourList);

        workWithList.addNewList(ourList);
        ourList = workWithList.addValueToListList(1,"test11",ourList);
        ourList = workWithList.addValueToListList(1,"test12",ourList);
        ourList = workWithList.addValueToListList(0,"test02",ourList);

        workWithList.addNewList(ourList);
        workWithList.addValueToListList(2,"test21", ourList);
        workWithList.addValueToListList(1,"test13", ourList);
    }
}
