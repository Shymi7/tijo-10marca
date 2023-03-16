public class Main {

    public static int sumOfNaturals(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumOfNaturals(n - 1);
        }
    }
    public static int sumOfGivenNNumbers(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return sum;

    }
    public static void main(String[] args) {
        int n = 5;
        int sum = sumOfNaturals(n);
        System.out.println("Suma pierwszych " + n + " liczb naturalnych to: " + sum);

        System.out.println(sumOfGivenNNumbers(7));

    }


}
