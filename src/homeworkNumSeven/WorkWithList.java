package homeworkNumSeven;

import java.util.ArrayList;
import java.util.List;

public class WorkWithList {

    List<List<String>> addNewList(List<List<String>> ourList){
        ourList.add(new ArrayList<>());
        printListList(ourList);
        return ourList;

    }

    private void printListList(List<List<String>> ourList){
        System.out.println("---------");
        for (int i = 0; i < ourList.size(); i++) {
            System.out.println(i +1 + "." + ourList.get(i));
        }
        System.out.println();

    }

   List<List<String>> addValueToListList(int numberOfList, String value , List<List<String>> ourList){
        if(numberOfList > ourList.size()){
            System.out.println("Такого индеса не сущевствует в списке");
        }
        else if(numberOfList < 0){
            System.out.println("Индекс не может имать отрицательное значение");
        }else {

            ourList.get(numberOfList).add(value);
            printListList(ourList);

        }
       return ourList;
    }
}


