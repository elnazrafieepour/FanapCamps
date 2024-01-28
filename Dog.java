public class Dog extends Animal{

    private String Voice="HopHop";
    private boolean Foot= true;

    @Override
    public void move(){
        System.out.println("Dog is Running!");
    }
public void Voicing(){
    System.out.println("the voice of dog is " + Voice);
}

}
