package Divar.Divar;

import java.util.ArrayList;
import java.util.List;

public class MaxGifts {
    public static List<Integer> MaxGiftsList(int[] Options, int Budget) {

        List<Integer> priceList = new ArrayList<>();
        for (int price : Options) {
            priceList.add(price);
        }

        priceList.sort(Integer::compareTo);

        List<Integer> PurchaseGifts = new ArrayList<>();
        int SpendMoney = 0;

        for (Integer Option : Options) {
            if (SpendMoney + Option <= Budget) {
                SpendMoney += Option;
                PurchaseGifts.add(Option);
            } else {
                System.out.println("total Price of Spend Money is: " + SpendMoney);
                System.out.println("the Count of Gifts: " + PurchaseGifts.size());
                break;
            }
        }
        return PurchaseGifts;
    }

}
