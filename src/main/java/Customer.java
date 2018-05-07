public class Customer {

    private String name;
    private double cash;
    private int age;
    private int height;
    private int weight;

    public Customer(String name, double cash, int age, int height, int weight) {
        this.name = name;
        this.cash = cash;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getCash() {
        return cash;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}
