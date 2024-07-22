package FanapCamps.ResturantPractice;

import FanapCamps.Printer.Printer;

import java.util.ArrayList;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class Resturant {
    String foodName;
    float foodPrice;
    int foodRate;

    Resturant (String myfoodName, float myfoodPrice,  int myfoodRate){
        myfoodName= foodName;
        myfoodPrice= foodPrice;
        myfoodRate= foodRate;
    }
    String[] Name= {"food1", "food2", "food3"};
    float[] price= {1000, 1100, 1110};
    int[] rate= {2, 4, 5};
    static int itemNumber= 4;
    public static String[] menue(String[] Name, float[] price, int[] rate, int myitemNumber){
       int i;
        String[] listItem = new String[0];

        for (i=0; i<myitemNumber; i++){
            System.out.println(Name[i] + price[i] + rate[i]);
            String a = Name[i] + price[i] + rate[i];
            listItem[i]= a;
        }
        System.out.println(listItem);
        return listItem;
    }

    public static void addItem(String newName, float newPrice, int newRate, String[] listItem){
        String b= newName + newPrice + newRate;
        listItem [itemNumber + 1] = b;
        System.out.println(listItem);
    }
    public static String[] deleteItem(String Name, String[] listItem){
        int g;
        for (g=0; g< listItem.length; g++){
            String[] substrings = listItem[g].split(" ");
            if (substrings[0] == Name){
                removeAllGivenElements(listItem, Name);
            } else{
                System.out.println(" ");
            }
        }

        return listItem;
    }
    public static String[] removeAllGivenElements(String[] array, String elements) {
        return ArrayUtils.removeElements(array, elements);
    }

}
