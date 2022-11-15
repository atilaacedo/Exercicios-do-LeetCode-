package LeetCode190;

public class ReverseBit {
    public static void main(String[] args) {
        ReverseBit reverseBit = new ReverseBit();
        System.out.println(reverseBit.reverseBits(101));
    }

    public int reverseBits(long n) {
        String num = Long.toString(n);
        String numReverse = "";
        int integerDecimal = 0;
        for(int i = num.length()-1; i>=0; i--){
            numReverse+= num.charAt(i);
        }
        System.out.println(numReverse);
        int index = 1;
        for(int i = numReverse.length() -1; i >= 0; i--){
            if(numReverse.charAt(i) == '1'){
                integerDecimal+=index;
            }
          

            index = index*2;
        }

        return integerDecimal;
    }


}
