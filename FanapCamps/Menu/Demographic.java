package FanapCamps.Menu;

public class Demographic {
    String name;
    String lastName;
    String Age;

    //Constructors:
    public Demographic(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Demographic(String name, String lastName, String age) {
        this.name = name;
        this.lastName = lastName;
        this.Age = age;
    }

    //Getters:
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAge() {
        return Age;
    }

    @Override
    public String toString(){
        return "نمایش اطلاعات خوداظهاری بیمار: {" +
                "نام:'" + this.name + '\'' +
                ", نام خانوادگی:" + this.lastName + '\'' +
                ", سن:" + this.Age +
                '}';
    }

}
