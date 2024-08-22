package Generics;

import java.util.ArrayList;
import java.util.List;

public class Generic1<E> {


    public static List<Integer> addList(List<Integer> l1, List<Integer> l2) {
        List<Integer> maxArray = (l1.size() < l2.size()) ? l2 : l1;
        List<Integer> minArray = (l1.size() < l2.size()) ? l1 : l2;

        for (int i = 0; i < minArray.size(); i++) {
            maxArray.set(i, maxArray.get(i) + minArray.get(i));
        }
        return maxArray;

    }

    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(5);
        a.add(1);
        a.add(1);
        a.add(1);
        a.add(1);
        a.add(1);
        a.add(1);
        a.add(1);
        a.add(1);
        a.add(1);
        a.add(1);

        List<Integer> b = new ArrayList<>();
        b.add(2);
        b.add(1);
        b.add(9);
        b.add(7);
        b.add(2);
        b.add(4);
        b.add(6);

        System.out.println(addList(a,b));


    }
}
