package LeetCode821;

public class DistanceChar {
    public int[] shortestToChar(String s, char c) {
        int[] answer  = new int[s.length()];
        int d;
        for(int i = 0; i < s.length(); i++){
            d = 0;

            for(int j = i,  k = i; j < s.length()*s.length();j++, k--){
               
                if( j < s.length() && s.charAt(j) == c) {
                    break;
                }

                if(k >= 0 && s.charAt(k) ==c)
                    break;
                
                d++;
            }

            answer[i] = (int) d;

        }

        return answer;
    }

    public static void main(String[] args) {
        DistanceChar d=  new DistanceChar();
        for(int a: d.shortestToChar("abaa", 'b')){
            System.out.println(a);
        }
    }
}
