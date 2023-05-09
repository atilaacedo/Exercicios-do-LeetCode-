package LeetCode1046;


import java.util.Arrays;

public class LastStoneWeight {
	 public int lastStoneWeight(int[] stones) {
		 
		 if(stones.length == 1) return stones[0];
		 
		 Arrays.sort(stones);
		 
		 for (int i = stones.length-1; i > 0; i--) {
			Arrays.sort(stones);
			 if(stones[i] != stones[i-1])
				 stones[i-1] = stones[i] - stones[i-1];
			 else {
				 stones[i - 1] = 0;
			 }
		 }
		 
		 
		 
		 return stones[0];
	 }
}
