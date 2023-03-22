package LeetCode118;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> listaT = new ArrayList<>();
        int elementos = 1;
        for(int i = 0; i < numRows; i++){
        	int k = 0;
            List<Integer> listRow = new ArrayList<>();
            for(int j = 0; j < elementos; j++){
                
                
                if(j == 0 || j == elementos-1)
                    listRow.add(1);
                else{
                	List<Integer> listAux = listaT.get(i-1);
                	
                	System.out.println();
                     if(k +1 < listAux.size()){
                        int somaAux = listAux.get(k) + listAux.get(k+1);
                        listRow.add(somaAux);
                       System.out.print(listAux.get(k) + " " + listAux.get(k+1));
                     }
                       
                     k++;
                }
               
            }

            listaT.add(listRow);

            elementos++;
        }

        return listaT;
    }


    public static void main(String[] args) {
        PascalTriangle pT = new PascalTriangle();
        for(List l: pT.generate(5)){
            System.out.println(l);
        }
    }
}
