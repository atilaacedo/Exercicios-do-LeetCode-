package LeetCode704;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int baixo = 0;
        int alto =  nums.length -1;

        while(baixo <= alto){
            int meio = (baixo + alto) /2;
            int chute = nums[meio];
            if(chute == target){
                return meio;
            }

            if(chute>target){
                alto = meio-1;
            }else{
                baixo = meio+1;
            }
        }
        return -1;
    }
}
