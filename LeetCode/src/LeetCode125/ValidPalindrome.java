package LeetCode125;

public class ValidPalindrome {
    public boolean isPalindrome(String s) { 
        s = s.toLowerCase();
        String palavrasTotais = "";
        
        for(int i  = 0; i < s.length(); i++){
            if((s.charAt(i) >= 97 && s.charAt(i) <= 122) || s.charAt(i) >= 48 && s.charAt(i) <= 57){
                palavrasTotais+= s.charAt(i);
            }
        }
        String comparacao = new StringBuilder(palavrasTotais).reverse().toString();

        if(palavrasTotais.equals(comparacao))
            return true;


        return false;

    }
}
