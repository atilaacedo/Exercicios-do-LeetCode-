package TwoSum;

public class TwoSum {
    public static void main(String[] args) {
        int[] array = {3,2,4};

        TwoSum w = new TwoSum();

        int [] novoArray=  w.twoSum(array, 6);

        for(int i = 0; i < novoArray.length; i++){
            System.out.println(novoArray[i]);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        int[] soma = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    soma[0] = i;
                    soma[1] = j ;
                }
            }
        }


        return soma;
    }

}
