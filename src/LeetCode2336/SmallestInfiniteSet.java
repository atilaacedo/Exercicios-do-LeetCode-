package LeetCode2336;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SmallestInfiniteSet {
	ArrayList<Integer> smallestInfiniteSetArray; 
	ArrayList<Integer> removeNumbers;
	int lastNumber = 1;
	
	public static void main(String[] args) {
		SmallestInfiniteSet s = new SmallestInfiniteSet();
		
		s.addBack(2);
		System.out.println(s.popSmallest());
		System.out.println(s.popSmallest());
		System.out.println(s.popSmallest());
		s.addBack(1);
		System.out.println(s.popSmallest());
		System.out.println(s.popSmallest());
		System.out.println(s.popSmallest());
	} 
	
	public SmallestInfiniteSet() {
		smallestInfiniteSetArray = new ArrayList<>();
		removeNumbers = new ArrayList<>();
		smallestInfiniteSetArray.add(1);
	 }
	    
	public int popSmallest() {
		int last =  smallestInfiniteSetArray.get(0);
		smallestInfiniteSetArray.remove(0);
		removeNumbers.add(last);
		lastNumber++;
		smallestInfiniteSetArray.add(lastNumber);
		
		return last;
	}
	    
	
	public void addBack(int num) {
	     if(removeNumbers.contains(num)) {
	    	 smallestInfiniteSetArray.add(num);
	    	 Collections.sort(smallestInfiniteSetArray, new Comparator<Integer>() {
	             @Override
	             public int compare(Integer numero1, Integer numero2) {
	                 return numero1.compareTo(numero2);
	             }
	         });
	    	 int indexNum = removeNumbers.indexOf(num);
	    	 removeNumbers.remove(indexNum);
	     }
	     
	     
	    
	}
}
