import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Класс для создания объекта типа Car.
 */
public class Car {
    private String brand;
    private List<Car> cars = new ArrayList<>();

    public Car() {

    }

    public Car(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public List<Car> getCars() {
        return cars;
    }

    /**
     * Метод для добавления и создания объекта внутри списка.
     *
     * @param brand В качестве параметра принимает String brand, используемое при создании объекта.
     */
    public void addCar(String brand) {
        Car newCar = new Car(brand);
        cars.add(newCar);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand);
    }

    /**
     * Метод определяет есть ли машина в уже созданном списке машин. В случае отсутствия генерирует ошибку.
     *
     * @param cars В качестве параметра принимает список Car.
     * @param o    в качестве параметра принимает объект типа Car
     */
    public void findCar(List<Car> cars, Car o) {
        try {
            if (cars.contains(o)) {
                System.out.println(o + " есть в списке");
            } else {
                throw new CarNotFountException(o + " в списке нет");
            }
        } catch (CarNotFountException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return brand;

    }
}
