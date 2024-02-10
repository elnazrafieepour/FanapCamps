package FanapCamps.Country;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Country newCountry1 = new Country("Iran", "IRN", 8500);
        //Country newCountry2 = new Country("America", "USA", 1000);
        Country newCountry3 = new Country("Norway", "NOR", 9100);
        Country newCountry4 = new Country("Austria", "AUT", 750);
        Country newCountry5 = new Country("Australia", "AUS", 10);

        HashMap<String, Country> newMap = new HashMap<>();
        newMap.put("IRN", new Country("Iran", 8500));
        newMap.put("USA", new Country("America", 1000));
        newMap.put(newCountry3.getSwiftCode(), newCountry3);
        newMap.put(newCountry4.getSwiftCode(), newCountry4);
        newMap.put(newCountry5.getSwiftCode(), newCountry5);

        for (Map.Entry<String, Country> entry : newMap.entrySet()) {
            String key = entry.getKey();
            Country value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
            // System.out.println(entry.toString());
        }

        for (Country entry : newMap.values()) {
             System.out.println(entry.getName() + " " + entry.getPopulation());
        }
//
        System.out.println(newMap.get("AUT").getName());
        System.out.println(newMap.get("BLZ").toString());
    }
}
