package LeetCode896;

public class MonotonicArray {
    public boolean isMonotonic(int[] nums) {
        boolean orderCres = false;
        boolean isMonotonic = true;
        boolean isEqual = true;
        int n =1;
        for(int i = 0; i < nums.length-1; i++){
            if(!(nums[i] == nums[i+1])) isEqual = false;
            
            if(!(isEqual == true) && n !=0){
                if(nums[i] > nums[i+1]){
                    orderCres = false;
                }else if(nums[i] < nums[i+1]){
                    orderCres = true;
                }
                n =0;
            }else{
                if(orderCres == false && nums[i] < nums[i+1]) return false;
                else if(orderCres == true && nums[i] > nums[i+1]) return false;
            }
        }

        return isMonotonic;
    }
}
