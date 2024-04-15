import java.util.Objects;

public class Car {//implements Comparable {
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
                '}' + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;                                  // Сравниваем ссылки
        if (o == null || getClass() != o.getClass()) return false;   // Если объекта нет или у объектов разные  классы, возвращаем false
        if(hashCode() != o.hashCode()) return false;                 // Если хеш-значения неравны, значит объекты неравны
        Car car = (Car) o;                                           //  Приводим объект к сравниваемому типу
        return speed == car.speed && cost == car.cost && Objects.equals(brand, car.brand);  // Сравниваем по значениям
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, cost, brand);                    // Получаем числовое значение объекта
    }

    //  @Override
    public int compareTo(Object o) {
        Car car = (Car) o;

        return this.brand.compareTo(car.brand);
    }
}
