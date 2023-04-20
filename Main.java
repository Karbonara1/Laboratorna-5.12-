public class Main {
    public static void main(String[] args) {
        int size = 25;
        int[] oddNumbers = new int[size];

        int count = 1;

        for (int i = 0; i < size; i++) {
            oddNumbers[i] = count;
            count += 2;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(oddNumbers[i]);
        }
    }
}
