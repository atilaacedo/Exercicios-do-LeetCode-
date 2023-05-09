package LeetCode1431;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsGreatNumberCandies {
	
	public static void main(String[] args) {
		
		KidsGreatNumberCandies k = new KidsGreatNumberCandies();
		int[] nums = {2,3,5,1,3};
		
		List<Boolean> l = k.kidsWithCandies(nums, 3);
		
		for(Boolean b : l) {
			System.out.println(b);
		}
	}
	
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		
		List<Boolean> candiesB = new ArrayList<>();
		int[] candiesAux = Arrays.copyOf(candies, candies.length);
		
		
		Arrays.sort(candiesAux);
		
		
		int maior = candiesAux[candies.length-1];
		System.out.println(maior);
		for (int i = 0; i < candiesAux.length; i++) {
			int totalCandies = candies[i] + extraCandies;
			
			if(totalCandies >= maior) 
				candiesB.add(true);
			else
				candiesB.add(false);
		}
		
		
		return candiesB;
    }
	
	

}
