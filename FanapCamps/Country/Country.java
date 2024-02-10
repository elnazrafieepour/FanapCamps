package FanapCamps.Country;

public class Country {
    private final String name;
    private String swiftCode;
    private final long population;

    //Constructor:
    public Country(String name, String swiftCode, long population) {
        this.name = name;
        this.swiftCode = swiftCode;
        this.population = population;
    }

    public Country(String name, long population) {
        this.name = name;
        this.population = population;
    }

    //getter Methode:
    public long getPopulation() {
        return population;
    }

    public String getSwiftCode() {
        return swiftCode;
    }

    public String getName() {
        return name;
    }
/*
    @Override
    public String toString() {
        return name + ", Population is: " + population;
    }
    */

}
