package PlusOne;

public class PlusOne {

    public static void main(String[] args) {
        int[] nums = {9,8,7,6,5,4,3,2,1,0};
        plusOne(nums);
    }

    public static int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i > 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }
    
        int[] novoArray =  new int[digits.length +1 ];

        novoArray[0] = 1;

        return novoArray;
    }
}
