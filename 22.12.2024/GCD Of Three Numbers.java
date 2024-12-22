public class GCD {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int num1 = 54;
        int num2 = 24;
        System.out.println("GCD of " + num1 + " and " + num2 + " is " + gcd(num1, num2));
    }
}
