package FanapCamps.Animal;

public class Dog extends Animal {
    private String name;
    private boolean pet;

    @Override
    public void moving() {
        System.out.println("The Dog is Running!");
    }

    @Override
    public void voicing() {
        System.out.println("The Dog is Hopping!");
    }

    public void sentry() {
        System.out.println("The Dog is Sentry!");
    }
}
