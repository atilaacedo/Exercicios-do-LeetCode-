package LeetCode202;

import java.util.HashMap;

public class HappyNumber {
    public static boolean isHappy(int n) {
        HashMap<Integer, Boolean> mapear = new HashMap<>();

        int quadrado = n;
        int auxQuadr = n*n;
        int count = 1;
        while(quadrado != 1){
            String number = Integer.toString(quadrado);
           
            quadrado = 0;
            for(int i =0 ;i < number.length();i++){
                String f1 =  Character.toString(number.charAt(i));
                quadrado += (Integer.parseInt(f1) * Integer.parseInt(f1));
            }
            
            if(count > 1){
                if(mapear.containsKey(quadrado))
                    break;
                else
                    mapear.put(quadrado, true);
            }

            mapear.put(quadrado, true);
            
            count++;
        }

        if(quadrado == 1)
            return true;

        return false;
    }
    
    
    public static void main(String[] args) {
        int n = 19;

        System.out.println(isHappy(n));
    }
}
