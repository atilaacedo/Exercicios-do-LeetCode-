package RemoveElement;

public class RemoveElement {
    public static void main(String[] args) {
        RemoveElement r = new RemoveElement();
        int[] nums = {5,2,1,54,2,321,2};

        r.removeElement(nums, 2);
    }

    public int removeElement(int[] nums, int val) {
        int index =0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
               nums[index] = nums[i];
                index++;
            }  
        }
        
        return index;
    }
}
