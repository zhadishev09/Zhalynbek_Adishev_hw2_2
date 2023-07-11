public class Lamborghini extends Car{
    public Lamborghini(String name, double capacity, String color, int maxSpeed) {
        super(name, capacity, color, maxSpeed);
    }

    @Override
    public void print() {
        System.out.println(getInfo());

    }
}
