package Keshtiban;

import java.util.*;

public class Exc2 {

    public static List<Integer> sortOrder(int numCustomer, List<Integer> orderMilk, List<Integer> orderEsperso) {
        Map<Integer, Integer> map1 = new HashMap<>();
        LinkedHashMap<Integer, Integer> newMap = new LinkedHashMap<>();


        for (int i = 0; i < numCustomer; i++) {
            //ساخت یک مپ از کلیدها و ولیوهایی که حاصل جمع شیر و اسپرسو هستند
            map1.put(i, orderMilk.get(i) + orderEsperso.get(i));
        }
            //مرتب کردن صعودی بر روی ولیوهای مپ بالا
            List<Map.Entry<Integer, Integer>> collection1 = new ArrayList<>(map1.entrySet());
            Collections.sort(collection1, new Comparator<Map.Entry<Integer, Integer>>() {
                public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                    return o1.getValue().compareTo(o2.getValue());
                }
            });

            //برای اینکه ترتیب سورت اعمال شده به همراه کلیدها لحاظ شود از یک linkedHashMap استفاده میکنیم
            LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();
            //ولیوهای مرتب شده را در داخل linkedHashMap میریزیم که ترتیب ها حفظ می شود
            for (Map.Entry<Integer, Integer> entry : collection1) {
                sortedMap.put(entry.getKey(), entry.getValue());
            }

            //حالا مپ سورت شده و ساخته شده از مرحله قبل را به یک مپ جدید دیگر اضافه میکنیم با این تفاوت که سایز این مپ به اندازه نصف مشتریان است
            int Cont = 0;
            //int sum = 0;

        for (Map.Entry<Integer, Integer> e : sortedMap.entrySet()) {
                if (Cont < (numCustomer / 2) + 1) {
                    newMap.put(e.getKey(), e.getValue());
                    Cont++;
                } else {
                    break;
                }
            }

        //برگرداندن یک مپ سورت شده به اندازه نصف مشتریان به ترتیب صعودی
        System.out.println("newMap is: " + newMap);

        //حالا برای اینکه بتوانیم مجموع شیر ها و مجموع اسپرسوهای کمینه را بصورت مجزا و مانند نمونه خروجی اعلام شده نمایش دهیم لازم است تا لیستی از شیرها و اسپرسوهای منتخب را ایجاد و در نهایت مجموع هر اعضای هر دو لیست را در قالب یک لیست نمایش دهیم
        //ایجاد یک لیست برای تعیین کلیدها بر اساس ترتیب سورت شده
        List<Integer> keySort= new ArrayList<>(newMap.keySet());
        //ایجاد لیستی از شیرها بر اساس ایندکس های سورت شده در sortedMap
        List<Integer> milkSorted= new ArrayList<>();
        List<Integer> espersoSorted= new ArrayList<>();
        List<Integer> sumArray= new ArrayList<>();
        int sumMilk=0;
        int sumEsperso=0;


        for (int i=0; i< keySort.size(); i++){
            int milkInput= orderMilk.get(keySort.get(i));
            milkSorted.add(milkInput);
            sumMilk += milkSorted.get(i);
            int espersoInput= orderEsperso.get(keySort.get(i));
            espersoSorted.add(espersoInput);
            sumEsperso += espersoSorted.get(i);
        }
        sumArray.add(sumMilk);
        sumArray.add(sumEsperso);

        return sumArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Input the num of Customer: ");
        int numOfCustomer = scanner.nextInt();
        List<Integer> orderMilk = new ArrayList<>();
        List<Integer> orderEsperso = new ArrayList<>();

        for (int i = 0; i < numOfCustomer; i++) {
            System.out.println("Please Input data for Milk: ");
            int milkk = scanner.nextInt();
            orderMilk.add(milkk);
            System.out.println("Please Input data for Esperso: ");
            int espersoo = scanner.nextInt();
            orderEsperso.add(espersoo);
            System.out.println(orderMilk);
            System.out.println(orderEsperso);

        }
        System.out.println(sortOrder(numOfCustomer, orderMilk, orderEsperso));
    }

    }




