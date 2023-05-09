package LeetCode12;

public class IntegerToRoman {
	 
	// 1 -> I / V
	// 2 -> X / L
	// 3 -> C / D
	// 4 -> M
	// 1234
	//234
	//34
	//4
	
	public String intToRoman(int num) {
		Integer[] valores = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
		String[] simbolos = {"I", "IV","V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
		
		String auxNum = Integer.toString(num);
		StringBuilder convertToRoman = new StringBuilder();
		
		for(int i = valores.length -1; i>=0 && num > 0; i--) {
			while(num>= valores[i]) {
				num-=valores[i];
				convertToRoman.append(simbolos[i]);
			}
		}
		
		
		
		return convertToRoman.toString();
	 }
}
