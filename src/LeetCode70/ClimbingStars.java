package LeetCode70;

public class ClimbingStars {

    public static int fib(int n) {
        if (n <= 1)
            return n;

        System.out.println(n);
        return fib(n - 1) + fib(n - 2);
    }

    public static int climbStairs(int n) {
        return fib(n + 1);
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
}
