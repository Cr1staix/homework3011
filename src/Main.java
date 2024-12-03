import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    /**
     * Задача №1
     */
    public static void task1() {
        try {
            double a = DividingNumbers.getDividing(10, 0);
            System.out.println(a);
        } catch (ArithmeticException el) {
            System.out.println(el.getMessage());
        }
    }

    /**
     * Задача №2
     */
    public static void task2() {
        Car cars = new Car();
        cars.addCar("LADA");
        cars.addCar("UAZ");
        cars.addCar("KIA");
        cars.addCar("VOLGA");
        Car car1 = new Car("BMW");
        Car car2 = new Car("LADA");
        Car car3 = new Car("UAZ");

        cars.findCar(cars.getCars(), car1);
        cars.findCar(cars.getCars(), car2);
        cars.findCar(cars.getCars(), car3);
    }

    /**
     * Задача №3
     */
    public static void task3() {
        String[] passwords = {"MyPassword123", "ffffff66", "ShlechtPass", "aSdf3h", "avalanche gt2020", "MyPassword222"};
        CheckPasswords passwordValidator = new CheckPasswords();
        System.out.println(passwordValidator.checkPasswords(passwords));
    }
}