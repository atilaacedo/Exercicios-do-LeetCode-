package LeetCode1768;

public class MergeStringsAlter {
	 public String mergeAlternately(String word1, String word2) {
	        StringBuilder mergeString = new StringBuilder();
	        String maior = "";
	       
	        int tam = 0;
	        
	        if(word1.length() > word2.length()) { 
	        	tam = word2.length();
	        	maior = word1;
	        	
	        }else {	
	        	tam = word1.length();
	        	maior = word2;	        	
	        }
	        int index = 0;
	        for (int i = 0; i < tam; i++) {
				mergeString.append(word1.charAt(i));
				mergeString.append(word2.charAt(i));
				
				
				index++;
			}
	        
	        
	        
	        mergeString.append(maior.substring(index, maior.length()));
	        
	        return mergeString.toString();
	   }
}
