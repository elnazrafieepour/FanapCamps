package FanapCamps.Country;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Country newCountry1= new Country("Iran", "IRN", 8500);
        Country newCountry2= new Country("America", "USA", 1000);
        Country newCountry3= new Country("Norway", "NOR", 9100);
        Country newCountry4= new Country("Austria", "AUT", 750);
        Country newCountry5= new Country("Australia", "AUS", 10);

        HashMap<String, Country> newMap = new HashMap<>();
        newMap.put(newCountry1.getSwiftCode(), newCountry1);
        newMap.put(newCountry2.getSwiftCode(), newCountry2);
        newMap.put(newCountry3.getSwiftCode(), newCountry3);
        newMap.put(newCountry4.getSwiftCode(), newCountry4);
        newMap.put(newCountry5.getSwiftCode(), newCountry5);

        for (String e : newMap) {
            System.out.println(newMap.toString());
        }
*/
        System.out.println(newMap.get("AUT"));
        System.out.println(newMap.get("BLZ"));


    }
}