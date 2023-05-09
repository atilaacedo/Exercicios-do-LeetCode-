package LeetCode374;

public class GuessNumberHigLow {
	
	public static void main(String[] args) {
		new GuessNumberHigLow().guessNumber(10);
	}
	
	//CREATE BY LEETCODE
	int guess(int n) {
		return n == 6  ? 0 : n > 6 ? -1 : 1;
	}
	
	public int guessNumber(int n) {
		int low = 1;
		int high = n;
		for(int i = 0; i < n; i++) {
			int guess = low +  ( high - low ) /2;
			
			if(guess(guess) == 0) return guess;
			
			if(guess(guess) == -1) {
				high = guess -1;
			}else {
				low = guess+1;
			}
			
			
		}
		
		
		return 0;
    }
}
