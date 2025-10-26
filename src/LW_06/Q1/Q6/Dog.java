package LW_06.Q1.Q6;

public class Dog extends Pets{
    private double weight;


    public Dog(String name, double weight) {
        super(name);
        this.weight=weight;

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
