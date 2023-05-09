package LeetCode1047;

public class RemoveAllAdjacentString {
	
	public static void main(String[] args) {
		RemoveAllAdjacentString rem = new RemoveAllAdjacentString();
		System.out.println(rem.removeDuplicates("abbaca"));
		
	}
	
	public String removeDuplicates(String s) {
       StringBuilder sb = new StringBuilder();
        
       for(char c: s.toCharArray()) {
    	   int size = sb.length();
    	   
    	   if(size > 0 && sb.charAt(size-1) == c) {
    		   sb.deleteCharAt(size-1);
    	   }else {
    		   sb.append(c);
    	   }
       }
       
       
        return sb.toString();
    }
}
