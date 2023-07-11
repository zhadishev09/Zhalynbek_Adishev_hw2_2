public class Car implements Printable{
    private String name;
    private double capacity;
    private String color;
    private int maxSpeed;

    public Car(String name, double capacity, String color, int maxSpeed) {
        this.name = name;
        this.capacity = capacity;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public String getInfo(){
        return "Название: " + getName() + "\nОбъем двигателя: " + + getCapacity() + "\nЦвет: " + getColor() +
                "\nМаксимальная скорость: " + getMaxSpeed();
    }

    @Override
    public void print() {
        System.out.println(getInfo());

    }
}
