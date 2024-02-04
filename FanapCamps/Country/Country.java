package FanapCamps.Country;

public class Country {
    private String name;
    private String swiftCode;
    private long population;

    //Constructor:
    public Country(String name, String swiftCode, long population) {
        this.name = name;
        this.swiftCode = swiftCode;
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
}
