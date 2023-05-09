package LeetCode14;



public class CommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		StringBuilder commonPrefix = new StringBuilder(); 
		
		for (int i = 0; i < strs[0].length(); i++) {
			for (int j = 1; j < strs.length; j++) {
				if(strs[0].charAt(i) != strs[j].charAt(i)) 
					return commonPrefix.toString();
			}
			commonPrefix.append(strs[0].charAt(i));
		}
		
		return commonPrefix.toString();
	}
	
	
	public int encontrarMenorString(String s1, String s2) {
		return s1.length() > s2.length() ? s2.length() : s1.length();
	}
}
