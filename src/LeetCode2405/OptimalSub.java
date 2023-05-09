package LeetCode2405;

public class OptimalSub {
	// "abacaba"
	// Cada substring n pode ter dois caracters iguais
	// ab -> ac -> ab -> a 
	
	public int partitionString(String s) {
		String subStringAux = "";
		int contPart = 0;
		for (int i = 0; i < s.length(); i++) {
			if(subStringAux.contains(Character.toString(s.charAt(i)))){
				subStringAux = "";
			}
			subStringAux += s.charAt(i);
			if(subStringAux.length() == 1) contPart++;
			
			
			
		}
		
		return contPart;
	}
}
