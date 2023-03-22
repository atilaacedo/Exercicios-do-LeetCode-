package LeetCode169;

import java.util.HashMap;

public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 1, 2, 3, 4, 1, 1, 1, 4, 4, 4, 4, 4, 44, 4, 4, 4, 4, 4, 4 };

        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int target = nums.length / 2;
        int majorityNumber = 0;
        HashMap<Integer, Integer> mapElements = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (!(mapElements.containsKey(nums[i]))) {
                mapElements.put(nums[i], 1);
            } else {
                int k = 1 + mapElements.get(nums[i]);
                mapElements.put(nums[i], k);
            }

            if (mapElements.containsKey(nums[i])) {
                if (mapElements.get(nums[i]) > target) {
                    return nums[i];
                }
            }
        }

        return majorityNumber;
    }
}
