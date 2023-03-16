public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println(sumOfGivenNNumbers(7));

    }

    public static int sumOfGivenNNumbers(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return sum;
    }
}