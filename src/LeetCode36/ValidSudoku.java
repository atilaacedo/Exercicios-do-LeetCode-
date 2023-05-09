package LeetCode36;

import java.util.HashSet;

public class ValidSudoku {
	
	public static void main(String[] args) {
		
		char[][] c = new char[9][9];
		new ValidSudoku().isValidSudoku(c);
	}
	
	 public boolean isValidSudoku(char[][] board) {
		 
		 HashSet<String> lVal = new HashSet<>();
		 
		 for (int i = 0; i < 9; i++) {
			
			for (int j = 0; j < 9; j++) {
				char c = board[i][j];
				
				if(c != '.') {
					
					if(!lVal.add(c + " index Row: " + i)||!lVal.add(c + " index Col: " + j)||!lVal.add(c + "index Box:" + i/3 + "-" +j /3))
						return false;
						

				}
			}
			 
		}
		 
		 return true;
	 }
}
