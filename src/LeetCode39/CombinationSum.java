package LeetCode39;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
	//VOLTAREI
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> nComb = new ArrayList<>();
		List<Integer> nSums = new ArrayList<>();
		
		for (int i = 0; i < candidates.length; i++) {
			if(target < candidates[i]) {
				int divEx = target / candidates[i];
				for(int j = 0; j < divEx; j++)
					nSums.add(candidates[i]);
				
				
			}
		}
		
		
		return nComb;
		
    }
}
