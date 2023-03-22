package LeetCode1704;

import java.util.ArrayList;

public class StringHalves {
    public boolean halvesAreAlike(String s) {
    	s = s.toLowerCase();
    	ArrayList<String> listaVogais = new ArrayList<>();
    	
    	listaVogais.add("a");
    	listaVogais.add("e");
    	listaVogais.add("i");
    	listaVogais.add("o");
    	listaVogais.add("u");
    	
    	
        String a = "", b="";
        int contVa = 0, contVb = 0;
        for (int i = 0; i < s.length(); i++) {
			if(i < (s.length()/2)) { 
				a += s.charAt(i);
				if(listaVogais.contains(Character.toString(s.charAt(i)))) {
					contVa++;
				}
			}
			else {
				b+= s.charAt(i);
				if(listaVogais.contains(Character.toString(s.charAt(i)))) {
					contVb++;
				}
			}
			
			
			
		}
  
    	
    	return (contVa == contVb);
    }
    
    
    public static void main(String[] args) {
		StringHalves g = new StringHalves();
		
		System.out.println(g.halvesAreAlike("book"));
		
	}
}
