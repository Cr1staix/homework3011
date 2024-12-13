public class DividingNumbers {
    /**
     * Метод для деления чисел.
     *
     * @param a Первое число
     * @param b Второе число
     * @return Возвращает результат деления
     */
    public static double getDividing(int a, int b) {

        if (b == 0) {
            throw new ArithmeticException("Делить на ноль нельзя!");
        }
        return (double) a / b;
    }
}
