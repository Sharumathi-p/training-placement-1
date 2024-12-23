public class PerfectNumber {
    public static boolean isPerfect(int num) {
        int sum = 1;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num && num != 1;
    }

    public static void main(String[] args) {
        int num = 28;
        System.out.println(num + " is a perfect number: " + isPerfect(num));
    }
}
