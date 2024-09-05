package FanapCamps.Pet29;

public class Dog extends Pet {
    public String FavoriteToy;

    //Constructor:
    public Dog(String name, long age, String favoriteToy) {
        super(name, "Dog", age);
        this.FavoriteToy = favoriteToy;
    }

    @Override
    public void DisplayDetail() {
        super.DisplayDetail();
        ;
        System.out.println(", And the Favorite Toy is : " + this.FavoriteToy);
    }

}
