package LeetCode575;

import java.util.HashSet;

public class DistriubuteCandies {
	public int distributeCandies(int[] candyType) {
        
		HashSet<Integer> controlCandies = new HashSet<>();
		int maxCandyPerm = candyType.length /2;
		int maxCandyType = 0;
		
		for (int i = 0; i < candyType.length; i++) {
			if(!(controlCandies.add(candyType[i]))) 
				continue;
			else if(maxCandyType >= maxCandyPerm) 
				break;
			
			maxCandyType++;
		}
		
		return maxCandyType;
    }
}
