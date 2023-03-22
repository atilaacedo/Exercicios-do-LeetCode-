package LeetCode448;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDisNumber {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disappeareNumbers = new ArrayList<>();
        int[] numT = new int[nums.length];
        Map<Integer, Boolean> map = new HashMap<>();
        Arrays.sort(nums);

        for (int i = 0, aux = 1; i < nums.length; i++, aux++) {
            numT[i] = aux;
            map.put(nums[i], true);
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(numT[i]);
            if (!map.containsKey(numT[i])) {
                disappeareNumbers.add(numT[i]);
            }
        }

        return disappeareNumbers;
    }

    public static void main(String[] args) {
        FindDisNumber f = new FindDisNumber();

        int[] n = { 4, 3, 2, 7, 8, 2, 3, 1 };

        f.findDisappearedNumbers(n);
    }
}
