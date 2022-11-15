package RunningSum;

public class RunningSum {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        RunningSum s = new RunningSum();

        System.out.println(s.runningSum(nums));
    }
    public int[] runningSum(int[] nums) {
        int[] novoNums = new int[nums.length];
        int sum = 0;
        for(int i =0; i < novoNums.length; i++){
            novoNums[i] = sum + nums[i];
            sum+= nums[i]; 
        }   
       
        return novoNums;
    }
}
