public class Car {
    private  int speed;
    private int cost;
    private String brand;

    public Car(int speed, int cost, String brand){
        this.speed = speed;
        this.cost = cost;
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public int getCost() {
        return cost;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", cost=" + cost +
                ", brand='" + brand + '\'' +
                '}';
    }
}
