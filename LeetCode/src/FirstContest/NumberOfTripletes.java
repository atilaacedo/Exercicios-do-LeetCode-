package FirstContest;

public class NumberOfTripletes {

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,8,9};
        System.out.print(arithmeticTriplets(nums, 2));
    }
    public static int arithmeticTriplets(int[] nums, int diff) {
        int cont = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j= 0; j < nums.length; j++){
                for(int k = 0; k < nums.length; k++){
                    if(nums[i] - nums[j] == diff && (nums[i] - nums[k] == diff|| nums[j] - nums[k] == diff) && k != i && i!=j && j!=k){
                        cont++;
                        System.out.println(nums[i] + " " + nums[j] + " "+ nums[k]);
                    }
                }
            }
        }

        return cont;
    }
}
