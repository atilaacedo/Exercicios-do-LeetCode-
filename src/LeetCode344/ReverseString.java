package LeetCode344;

public class ReverseString {
	public void reverseString(char[] s) {
		int init = 0;
		int tam = s.length-1;
		
		while(init<=tam) {
			char temp = s[init];
			s[init] = s[tam];
			s[tam] = temp;
			init++;
			tam--;
		}

    }
	
	
	
	
	public static void main(String[] args) {
		ReverseString rs = new ReverseString();
		
		char[] s = {'h', 'e', 'l', 'l', 'o'};
		
		rs.reverseString(s);
		
	}
}
