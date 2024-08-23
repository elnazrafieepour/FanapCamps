package Generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Generic3 {
    public static <K, V> Map<K, V> getKeyMap(Map<K, V> map1, List<K> list1) {
        // int MaxSize = Math.max(map1.size(), list1.size());
        int size = map1.size();
/*
        for (int i=0; i<size; i++) {
            //if (map1.containsKey(list1)) {
            if (list1.contains(map1.())){
                System.out.println("the value of index " + i + " have been Not removed");
            } else{
                map1.remove(i);
                list1.remove(i);
                System.out.println("the value of index " + i + " have been removed");
            }
        }

 */
        return map1;

    }


        public static void main (String[]args){
            HashMap<Integer, String> M1 = new HashMap<>();
            M1.put(1, "eli1");
            M1.put(2, "eli2");
            M1.put(3, "eli3");
            M1.put(4, "eli4");
            ArrayList<Integer> L1 = new ArrayList<>();
            L1.add(2);
            L1.add(4);
            System.out.println(getKeyMap(M1, L1));

        }
    }
