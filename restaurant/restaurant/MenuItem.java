package restaurant.restaurant;

public class MenuItem {
    private String name;
    private double cost;
    private int score;

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public MenuItem(String name, double cost, int score) {
        this.name = name;
        this.cost = cost;
        this.score = score;
    }

}
