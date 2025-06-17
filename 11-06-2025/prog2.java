public class ClimbingStairs {

    public static int countWays(int n) {
        if (n == 0||n==1) 
            return 1;
            return countWays(n - 1) + countWays(n - 2);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Number of ways to climb " + n + " stairs: " + countWays(n));
    }
}