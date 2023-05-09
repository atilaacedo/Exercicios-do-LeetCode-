package LeetCode1025;

public class DivisorGame {
    public boolean divisorGame(int n) {
        int count = 1;
        for (int i = 1; i < n; i++) {

            if (i + 1 >= n && n % i + 1 != 0)
                return count % 2 != 0;

            count++;
        }

        return false;
    }
}
