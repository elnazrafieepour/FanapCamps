package FanapCamps.Comparision;

import java.util.ArrayList;

public interface comparison2Array {
    public static ArrayList<Integer> compare(ArrayList<Integer> myList1, ArrayList<Integer> myList2) {
        ArrayList<Integer> finalArray = new ArrayList<>();

        if (myList1.size() < myList2.size()) {
            for (int i = 0; i < myList1.size() ; i++) {
                int e = myList1.get(i) + myList2.get(i);
                finalArray.add(e);
                System.out.println(e);
            }
            finalArray.addAll(myList2);

        } else {
            for (int i = 0; i < myList2.size() ; i++) {
                int e = myList1.get(i) + myList2.get(i);
                finalArray.add(e);
               // finalArray.addAll(myList1);

                System.out.println(e);
            }
            finalArray.addAll(myList1);

        }

        return finalArray;
    }
}
