public class SumOfOdd {
    public static void main(String[] args) {

        int a = 4;
        int b = 15;
        int start = Math.min(a, b);
        int end = Math.max(a, b);

        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        System.out.println("Sum of odd numbers = " + sum);
    }
}
