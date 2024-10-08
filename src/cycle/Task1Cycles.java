package cycle;

/**
 * Задание 1
 * Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
 * Для решения написать 2 функции, которые будут принимать введенное целое число, а возвращать количество четных цифр (вторая функция - нечетных).
 * <p>
 * Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).
 */
public class Task1Cycles {
    public static void main(String[] args) {

        sortingNumberEvenOrOdd(22455241);
        System.out.println();

    }

    private static void sortingNumberEvenOrOdd(int value) {
        findEvenNumbers(value);
        System.out.println(" ");
        findOddNumbers(value);
    }

    private static void findEvenNumbers(int value) {
        int sum = 0;
        int currentValue = value;
//
        for (int i = 0; i < currentValue; i++) {
            int number = currentValue % 10;
            if (number % 2 == 0) {
                System.out.print(number + "; ");
                sum += 1;
            }
            currentValue /= 10;
        }
        System.out.println(" - even numbers " + sum);
    }

    private static void findOddNumbers(int value) {
        int sum = 0;
        int currentValue = value;
        for (int i = 0; i < currentValue; i++) {
            int number = currentValue % 10;
            if (number % 2 != 0) {
                System.out.print(number + "; ");
                sum += 1;

            }
            currentValue /= 10;
        }
        System.out.println(" - odd numbers " + sum);
    }

}
