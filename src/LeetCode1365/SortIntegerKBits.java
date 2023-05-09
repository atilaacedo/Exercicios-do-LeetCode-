package LeetCode1365;

import java.util.Arrays;


public class SortIntegerKBits {
	
		public static void main(String[] args) {
			
			SortIntegerKBits s = new  SortIntegerKBits();
			
			int[] arr = {0,1,2,3,4,5,6,7,8};
			
			int[] ord = s.sortByBits(arr);
			
			for(Integer i : ord) {
				System.out.println(i);
			}
		}
	
	  public int[] sortByBits(int[] arr) {
		  Integer[] sortedBin  = Arrays.stream(arr).boxed().toArray(Integer[]::new);
		  Arrays.sort(sortedBin, (a,b) -> Integer.bitCount(a) == Integer.bitCount(b) ? a-b : Integer.bitCount(a) - Integer.bitCount(b));
		  
		  return Arrays.stream(sortedBin).mapToInt(Integer::intValue).toArray();
	  }
}
