package LeetCode433;

import java.util.HashMap;

public class MinGeneticMut {
    public static int minMutation(String start, String end, String[] bank) {
        int mutacoes = 0;
        HashMap<String, Boolean> verificarNoBanco = new HashMap();
        String mutada = start;
        for(int i = 0; i < bank.length; i++){
          
          verificarNoBanco.put(bank[i], true);
            
        }

        for(int j = end.length() - 1; j > 0; j--){
            if(start.charAt(j) != end.charAt(j)){
               mutada = mutada.substring(0,j) + end.charAt(j) + mutada.substring(j+1, 8);
               mutacoes++;

               if(!(verificarNoBanco.containsKey(mutada))){
                    return -1;
               }
            }
        }


        if(mutacoes > 0)
            return mutacoes;
        else
            return -1;
    }



    public static void main(String[] args) {

        String[] bank = {"AATTCCGG","AACCTGGG","AACCCCGG","AACCTACC"};

        int min = minMutation("AACCTTGG", "AATTCCGG", bank);

        System.out.println(min);
    }
}
