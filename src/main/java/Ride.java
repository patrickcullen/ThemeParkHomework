import java.util.ArrayList;

public abstract class Ride implements Checkinable{

    private String name;
    private double fee;
    private int minAge;
    private int minHeight;
    private int maxWeight;
    private int capacity;
    private ArrayList<Customer> customers;

    public Ride(String name, double fee, int minAge, int minHeight, int maxWeight, int capacity) {
        this.name = name;
        this.fee = fee;
        this.minAge = minAge;
        this.minHeight = minHeight;
        this.maxWeight = maxWeight;
        this.capacity = capacity;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getFee() {
        return fee;
    }

    public int getMinAge() {
        return minAge;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCustomerCount(){
        return this.customers.size();
    }

    public void checkIn(Customer customer){
        if (getCustomerCount() < this.capacity &&
        customer.getCash() > this.fee &&
        customer.getAge() > this.minAge &&
                customer.getHeight() > this.minHeight &&
                customer.getWeight() < this.maxWeight)
        {
            this.customers.add(customer);
        }
    }
}
