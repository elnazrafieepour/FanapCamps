package FanapCamps.Pet29;

public class Main {
    public static void main(String[] args) {
        Dog d1= new Dog("dog1",12, "barbie");
        Dog d2= new Dog("dog2", 24, "barbie2");
        Bird b1= new Bird("bird1", 12, 132);
        Bird b2= new Bird("bird2", 14, 12);

        d1.DisplayDetail();
        d2.DisplayDetail();
        b1.DisplayDetail();
        b2.DisplayDetail();

    }

}
