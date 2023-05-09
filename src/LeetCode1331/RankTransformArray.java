package LeetCode1331;

import java.util.Arrays;
import java.util.HashMap;

public class RankTransformArray {
	public static void main(String[] args) {
		int[] arr = {40,10,20,30};
		
		int[] aux = arrayRankTransform(arr);
		
		for(int i: aux) {
			System.out.println("------------------");
			System.out.println(i);
		}
	}
	public static int[] arrayRankTransform(int[] arr) {
        int[] rankArr = new int[arr.length];
        HashMap<Integer, Integer> mapRank = new HashMap<>(); 
        int[] aux = arr.clone();
        int rank = 1;
        
        Arrays.sort(aux);
        
      
        
        for (int i = 0; i < aux.length; i++) {
        	if(!mapRank.containsKey(aux[i])) {
				mapRank.put(aux[i], rank);
				rank++;
        	}
		}
        
        
        for (int i = 0; i < aux.length; i++) {
        	System.out.println(mapRank.get(arr[i]));
			rankArr[i] = mapRank.get(arr[i]);
		}
        
        
        
        return rankArr;
    }
}
