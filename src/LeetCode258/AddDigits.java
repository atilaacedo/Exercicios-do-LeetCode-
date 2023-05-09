package LeetCode258;

public class AddDigits {
	public int addDigits(int num) {
		
		int numAux = num;
		
		while(Integer.toString(numAux).length() != 1) {
			String separar = Integer.toString(numAux);
			int aux = 0;
			for (int i = 0; i < separar.length(); i++) {
				aux += Integer.parseInt(Character.toString(separar.charAt(i)));
			}
			
			numAux = aux;
		}
		
		return numAux;
		
    }
}
