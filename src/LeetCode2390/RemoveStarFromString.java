package LeetCode2390;

import java.util.Stack;

public class RemoveStarFromString {
	
	public static void main(String[] args) {
		System.out.println(removeStars("leet**cod*e"));
	}
	
	 public static String removeStars(String s) {
		Stack<Character> cs = new Stack<>();
		
		for(char c : s.toCharArray()) {
			if(c == '*') cs.pop();
			else cs.push(c);
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(char c : cs) {
			sb.append(c);
		}
		 
		 return sb.toString();
	 }
}
