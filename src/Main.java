import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static int[] generateRandomArray() { // Объявить метод «сгенерироватьМассив»
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("_____ Задача 1 _____");
        int[] arr = generateRandomArray();
        int totalPay = 0;
        for (int index = 0; index < arr.length - 1; index++) {
            totalPay += arr[index];
        }
        System.out.println("Сумма трат за месяц составила " + totalPay + " рублей");
    }

    public static void task2() {
        System.out.println("_____ Задача 2 _____");
        int[] arr = generateRandomArray();
        int minPay = 200_001;
        int maxPay = 0;
        for (int index = 0; index < arr.length - 1; index++) {
            if (arr[index] < minPay) {
                minPay = arr[index];
            }
            if (arr[index] > maxPay) {
                maxPay = arr[index];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minPay + " рублей. Максимальная сумма трат за день составила " + maxPay + " рублей");
    }

    public static void task3() {
        System.out.println("_____ Задача 3 _____");
        int[] arr = generateRandomArray();
        int totalPay = 0;
        for (int index = 0; index < arr.length - 1; index++) {
            totalPay += arr[index];
        }
        double averagePay = totalPay / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averagePay + " рублей");
    }

    public static void task4() {
        System.out.println("_____ Задача 4 _____");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

}