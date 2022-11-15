package LeetCode278;

public class BadVersion {
    //boolean isBadVersion(int version);
    public int firstBadVersion(int n) {
        
        int baixo =0;
        int alto = n;
        int ans = -1;
        while(baixo<= alto){
            int meio = (baixo+alto)/2;
            boolean chute = isBadVersion(meio);

            if(chute == true){
                ans =meio;
                alto = meio -1;
            }else{
                baixo = meio+1;
            }

                

            
        }
        
        return ans;
    }

    private boolean isBadVersion(int i) {
        return false;
    }
}
