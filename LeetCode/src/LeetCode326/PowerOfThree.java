package LeetCode326;

public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
       int raiz = (int) Math.cbrt(n);
       for(int i = raiz; i >=0 ; i-=3){
            if(Math.pow(3, i) == n)
                return true;
       }
       
        return false;
    }
}
