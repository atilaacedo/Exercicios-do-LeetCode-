package ValidParentheses;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        ValidParentheses v = new ValidParentheses();
        String s =  "[[[]";

        System.out.println(v.isValid(s));

    }


    public boolean isValid(String s) {
        String  ABRE = "([{";
        String FECHA = ")]}";
    
        Stack<Character> exp = new Stack<>();
        
        int index = 0;
        char simbolo, topo;
        int fechaParenteses = 0, abreParenteses = 0;
        while(index < s.length() ) {
            simbolo = s.charAt(index);
            
            if(ABRE.indexOf(simbolo) >= 0) {
                exp.push(simbolo);
                abreParenteses+=1;
            }else if(FECHA.indexOf(simbolo) > -1) {
                fechaParenteses+=1;
                if(exp.isEmpty()) {
                    return false;
                }else {
                    topo = exp.pop();
                    
                    if(ABRE.indexOf(topo) != FECHA.indexOf(simbolo)) {
                        return false;
                    }
                }
            }
        
            
            
            index++;
        }
    
        if(abreParenteses > fechaParenteses) {
            return false;
        }
        
        return true;
   }

}
