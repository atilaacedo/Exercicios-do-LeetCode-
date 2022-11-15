package FirstContest;

public class LongestSubsequence {
    public static void main(String[] args) {
        System.out.println(longestIdealString("abfgdc", 3));
    }
    public static int longestIdealString(String s, int k) {
        String ideal = "";

        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i)-s.charAt(i+1) == 1 || s.charAt(i) - s.charAt(i+1) == -1){
                ideal += s.charAt(i);
            }
        }
        System.out.println(ideal);
        return ideal.length();
    }
}
