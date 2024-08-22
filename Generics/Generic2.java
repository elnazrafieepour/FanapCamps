package Generics;

import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.List;

public interface Generic2<T> {

    public static <E> boolean compareEquality(ArrayList<E> a, ArrayList<E> b) {
        boolean equality = false;
        for (E element : a) {
            equality = a.equals(b);
        }
        return equality;
    }
    public static void main(String[] args) {

        ArrayList<Integer> intg1 = new ArrayList<>();
        intg1.add(1);
        intg1.add(1);
        intg1.add(1);
        intg1.add(1);
        intg1.add(1);
        ArrayList<Integer> intg2 = new ArrayList<>();
        intg2.add(1);
        intg2.add(1);
        intg2.add(1);
        intg2.add(1);
        System.out.println(compareEquality(intg1, intg2));


        ArrayList<String> string1 = new ArrayList<>();
        string1.add("eli");
        string1.add("saba");
        string1.add("1");
        //string1.add(1);
        //string1.add(1);
        ArrayList<String> string2 = new ArrayList<>();
        string2.add("eli");
        string2.add("saba");
        string2.add("1");
       // string2.add("1");
        System.out.println(compareEquality(string1, string2));

    }
}