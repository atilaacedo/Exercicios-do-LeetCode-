package LeetCode190;

public class ReverseBit {
    public int reverseBits(int n) {
        int reverseDecimal = 0;

        for(int i = 0; i < 32;i++){
            reverseDecimal<<=1;
            reverseDecimal+=n%2;
            n>>>=1;
        }

        
        return reverseDecimal;

    }



   
}
