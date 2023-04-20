
import java.util.Random;

public class second {
    public static void main(String[] args) {
        int[] numbers = new int[20];

        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }

        System.out.print("Початковий масив: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        for (int i = 1; i < numbers.length; i += 2) {
            numbers[i] = 0;
        }

        System.out.print("Оновлений масив: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
