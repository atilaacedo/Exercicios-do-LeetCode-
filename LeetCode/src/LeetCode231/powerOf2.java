package LeetCode231;

import java.util.HashSet;
import java.util.Set;

public class powerOf2 {
	 
	static Set<Integer> set = new HashSet<>();
	
	public static boolean isPowerOfTwo(int n) {
		
		if(n< 1) return false;
		
		if(set.size() == 0) {
			preencherSet();
		}
		
		if(set.contains(n)) return true;
		
		return false;
		
	 }
	
	
	public static void preencherSet() {
		int mult = 1;
		
		while(mult > 0) {
			set.add(mult);
			mult*=2;
		}
		
	}
	
	
	public static void main(String[] args) {
		boolean b = isPowerOfTwo(8);
		
		System.out.println(b);
	}
}

