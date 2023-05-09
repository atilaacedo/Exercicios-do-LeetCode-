package LeetCode1021;

public class ValidParentheses {
	 public String removeOuterParentheses(String s) {
		 StringBuilder validParenthese = new StringBuilder();
		 int index = 0;
		for(char c: s.toCharArray()) {
			if(c == '(' && index++ > 0 ) {
				validParenthese.append(c);
			}
			
			if(c == ')' && index-- > 1) {
				validParenthese.append(c);
			}
		}
		 
		 return validParenthese.toString();
	 }
}
