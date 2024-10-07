package Generics;

import java.util.ArrayList;
import java.util.List;

public class Generic5 {

    public static < T > List < T > mergeLists(List < T > list1, List < T > list2) {
        List < T > mergedList = new ArrayList < > ();

        int maxLength = Math.max(list1.size(), list2.size());
        for (int i = 0; i < maxLength; i++) {
            if (i < list1.size()) {
                mergedList.add(list1.get(i));
            }

            if (i < list2.size()) {
                mergedList.add(list2.get(i));
            }
        }

        return mergedList;
    }

    public static void main(String[] args) {
    List<Integer> list1= List.of(1,2,3,4,5);
    List<Integer> list2= List.of(1,1,1,1,1,6,7,8,9,0);
        System.out.println(mergeLists(list1, list2));

    }
}
