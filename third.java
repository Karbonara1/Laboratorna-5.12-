
import java.util.Random;

public class third {
    public static void main(String[] args) {
        int[] arr = new int[15];

        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            arr[i] = random.nextInt(11);
        }

        System.out.print("Масив: ");
        for (int i = 0; i < 15; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int count = 0;
        for (int i = 0; i < 15; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }

        System.out.println("Кількість парних елементів в масиві: " + count);
    }
}


