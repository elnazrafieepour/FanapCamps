package FanapCamps.Animal;

public class Main {
    public static void main(String[] args){
        Animal newAnimal1= new Animal();
        Dog newDog1= new Dog();

        newAnimal1.moving();
        newAnimal1.voicing();
        newDog1.moving();
        newDog1.voicing();
        newDog1.sentry();

        Animal newDog2= new Dog();
        newDog2.voicing();
        newDog2.moving();


    }
}
