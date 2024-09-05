package FanapCamps.Pet29;

public class Pet {
    public String Name;
    public String Species;
    public long age;

    //Constructor:
    public Pet(String name, String species, long age) {
        Name = name;
        Species = species;
        this.age = age;
    }

    public double CalculateAgePet(long age){
        double HumanAge= (age/12);
        return HumanAge;
    }
    public void DisplayDetail(){
        System.out.println("the Age of Pet is: " + CalculateAgePet(this.age));
        System.out.println(" And the Species of Pet is: " + this.Species);
    }
}
