package Generics;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class Generic7 {
    public static <K, V> void MethodeGeneric(HashMap<K, V> newMap){
        for (Map.Entry<K, V> entry: newMap.entrySet()) {
            K key= entry.getKey();
            V Value= entry.getValue();
            System.out.println("your key is: " + key + " and your value is: " + Value);

        }

    }
    public static void main(String[] args) {
        HashMap<Integer, String> newMap= new HashMap<>();
        newMap.put(1, "a");
        newMap.put(2, "b");
        newMap.put(3, "c");
        newMap.put(3, "c");
        newMap.put(3, "a");
        newMap.put(4, "d");

        System.out.println(newMap);
        MethodeGeneric(newMap);

    }

}
