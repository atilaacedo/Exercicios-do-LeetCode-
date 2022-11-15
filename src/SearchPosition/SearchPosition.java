package SearchPosition;

public class SearchPosition {

    public static void main(String[] args) {
        SearchPosition s = new SearchPosition();
        int[] nums = {1,3,5,6};
        int target = 2;
        System.out.println(s.searchInsert(nums, target));
    }

    public int searchInsert(int[] nums, int target) {
        int baixo = 0;
        int maior = nums.length -1;
        int index = nums.length -1;
        while(baixo <= maior){
            int media = (baixo +maior)/2;
            int chute = nums[media];

            if(chute == target){
                return media;
            }

            if(chute > target){
                maior = media -1;
            }else{
                baixo = media+1; 
            }
           
        }

        while(index >= 0){
            if(nums[index] < target){
                return index+1;
            }else if(nums[0] > target){
                return 0;
            }

            index--;
        }
        

        
        return -1;
    }
}
