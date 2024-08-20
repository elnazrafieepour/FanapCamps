package Generics;

import java.util.ArrayList;
import java.util.List;

public class Generic1<T> {
    private T Var;
    public void setVar(T Var){this.Var=Var;}
    public T getVar(){return Var;}




    public static void addList(List l1, List l2){
        for (Object item: l1){
           l1.addAll(l2);
            System.out.println(l1);

        }

    }
}
