public class Power {
    public static void main(String[] args) {
        int x = 2;
        int n = 3;
        int result = power(x, n);
        System.out.println("Result: " + result);
    }
    
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * power(x, n - 1);
        }
    }
}