public class Rollercoaster extends Ride{

    private String name;
    private double fee;
    private int minAge;
    private int minHeight;
    private int maxWeight;
    private int capacity;

    public Rollercoaster(String name, double fee, int minAge, int minHeight, int maxWeight, int capacity){
        super(name, fee, minAge, minHeight, maxWeight, capacity);
        this.name = name;
        this.fee = fee;
        this.minAge = minAge;
        this.minHeight = minHeight;
        this.maxWeight = maxWeight;
        this.capacity = capacity;
    }

}
