package JewellsStones;

public class JewellsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        int commumPrefixe = 0;

        for(int i = 0; i < stones.length(); i++){
            for(int j = 0; i < jewels.length(); j++){
                if(jewels.charAt(j) == stones.charAt(i)){
                    commumPrefixe++;
                }
            }
        }
        return commumPrefixe;
    }
}
