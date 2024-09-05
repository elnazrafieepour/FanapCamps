package FanapCamps.Pet29;

public class Bird extends Pet {
    public long WingSpan;

    //Constructor:
    public Bird(String name, long age, long wingSpan) {
        super(name, "Bird", age);
        this.WingSpan = wingSpan;
    }

    @Override
    public void DisplayDetail() {
        super.DisplayDetail();
        System.out.println(", And the length of wing is : " + this.WingSpan);
    }
}
