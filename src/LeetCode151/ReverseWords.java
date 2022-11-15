package LeetCode151;

public class ReverseWords {
	public String reverseWords(String s) {
		String reverse = "";
		
		s = s.replaceAll("\\s+", " ");
		s = s.trim();
		
		String[] ss = s.split(" ");
		
		for (int i = ss.length-1; i >= 0 ; i--) {
			if(i > 0) 
				reverse+= ss[i] += " ";
			else
				reverse += ss[i];
		}
		
		
		return reverse;
    }
	
	
	public static void main(String[] args) {
		ReverseWords r = new ReverseWords();
		
		System.out.println(r.reverseWords( "a good   example"));
	}
}
