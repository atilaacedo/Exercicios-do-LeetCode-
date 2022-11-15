package SingleNumber;

import java.util.HashSet;

public class SingleNumber {
    public static void main(String[] args) {
        SingleNumber n = new SingleNumber();
        int[] nums  = {4,1,2,1,2};
        System.out.println(n.singleNumber(nums));
        System.out.println(n.mySqrt(8));
    }

    public int singleNumber(int[] nums) {
        int singleNumber = 0;
        int cont = 0;
        for(int i = 0; i < nums.length; i++){
            cont = 0;
            for(int j = 0; j < nums.length; j++ ){
                if(nums[i] == nums[j] ){
                   cont++;
                }
            }
            if(cont == 1){
                singleNumber = nums[i];
                break;
            }
            
        }

        return singleNumber;
    }

    public int singleNumber2(int[] nums) {
        HashSet<Integer> singleNum = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            if(!(singleNum.contains(nums[i]))){
                singleNum.add(nums[i]);
            }else{
                singleNum.remove(nums[i]);
            }
        }

        return singleNum.stream().findFirst().get();
    }

    public int mySqrt(int x) {
        int raiz = (int) Math.sqrt(x);
        
        return raiz;
    }

}
