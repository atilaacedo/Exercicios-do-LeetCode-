package ConcatenationOfArray;

public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        int j = 0;
        for(int i = 0; i < ans.length; i++){
            if(j > (nums.length-1)) j = 0;
            ans[i] = nums[j];
            
            j++;
        }


        return ans;
    }
}
