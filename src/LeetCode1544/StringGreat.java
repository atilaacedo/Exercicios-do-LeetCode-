package LeetCode1544;

public class StringGreat {
    public String makeGood(String s) {

       int n = s.length();

       for(int i = 0; i < n-1; i++){
          if(Math.abs(s.charAt(i) - s.charAt(i+1)) == 32){
            return makeGood(s.substring(0, i) + s.substring(i+2, s.length()));
          }
       }

        return s;
    }


    public static void main(String[] args) {
        StringGreat g = new StringGreat();

        String s = g.makeGood("jeSsEJ");
        System.out.println(s);
    }
}
