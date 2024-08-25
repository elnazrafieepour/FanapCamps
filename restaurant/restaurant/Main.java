package restaurant.restaurant;

public class Main {

    public static void main(String[] args) {
        MenuItem qhormehSabzi  = new MenuItem("قرمه سبزی", 10000D, 5);
        MenuItem pizza  = new MenuItem("پپرونی", 12000D, 5);
        MenuItem kalapch  = new MenuItem("کله پاچه", 50000D, 5);
        MenuItem gheyme  = new MenuItem("قیمه", 12000D, 5);

        MenuItem[] items = {qhormehSabzi, pizza, kalapch, gheyme};

        Restaurant restaurant = new Restaurant(items);
        restaurant.addItem(new MenuItem("ماکارونی", 50000D, 7));
        restaurant.addItem(new MenuItem("ماکارونی", 50000D, 7));
        restaurant.removeItem("قیمه");



    }
}
