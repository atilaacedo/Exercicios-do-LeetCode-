package LeetCode198;

public class HouseRobber {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);

        for(int i = 1 ; i < nums.length; i++){
            if(i == 1) 
                nums[i] = Math.max(nums[0], nums[1]);
            else{
                nums[i] = Math.max(nums[i] + nums[i-2], nums[i-1]);
            }
        }

        return nums[nums.length-1];
    }

    public static void main(String[] args) {
        int[] nums = {1,4,5,6,7};

        HouseRobber r = new HouseRobber();
        int m  = r.rob(nums);
        System.out.println(m);
    }
}
