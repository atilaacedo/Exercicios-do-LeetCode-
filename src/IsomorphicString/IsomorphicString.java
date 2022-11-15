package IsomorphicString;

import java.util.HashMap;

public class IsomorphicString {
    public boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()) return false;   
       
        HashMap<Character, Character> caracteres = new HashMap<>();
        HashMap<Character, Boolean> map2 = new HashMap<>();
        for(int i = 0; i < s.length();i++){
            char cs = s.charAt(i);
            char ct = t.charAt(i);

            if(caracteres.containsKey(cs)){
                if(caracteres.get(cs) != ct) return false;
            }else{
                if(map2.containsKey(ct) == true) return false;
                else{
                    caracteres.put(cs, ct);
                    map2.put(ct, true);
                }
            }
        }


        return true;
    }
}
