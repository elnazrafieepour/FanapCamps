package FanapCamps.Comparision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main implements comparison2Array{
    public static void main(String[] args) {
        ArrayList<Integer> myList1 = new ArrayList<>();
        ArrayList<Integer> myList2 = new ArrayList<>();

        myList1.add(1);
        myList1.add(2);
        myList1.add(3);
        myList1.add(4);
        myList1.add(5);
        myList1.add(0);
        myList1.add(0);
        myList1.add(6);
        myList1.add(7);

        myList2.add(1);
        myList2.add(2);
        myList2.add(4);
        myList2.add(6);
        myList2.add(7);
        myList2.add(null);

        ArrayList<Integer> finalArray= comparison2Array.compare(myList1, myList2);
        System.out.println(finalArray);
    }


}
