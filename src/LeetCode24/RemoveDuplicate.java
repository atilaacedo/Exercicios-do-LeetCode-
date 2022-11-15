package LeetCode24;

public class RemoveDuplicate {
    public static void main(String[] args) {
        RemoveDuplicate remove = new RemoveDuplicate();
        int[] nums = {1,1,2};
        System.out.println(remove.removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {
        int tamanho = 0;
        int compara = 0;

        for(int i = 0; i < nums.length; i++){
            if(i > 0){
                if(nums[i] != compara){
                    nums[tamanho] = nums[i];
                    tamanho++;
                }
            }else{
                nums[tamanho] = nums[i];
                tamanho++;
            }

            compara = nums[i];
        }

        for(int i = 0; i < tamanho; i++){
            System.out.println(nums[i]);
        }
       

        return tamanho;
    }
}
