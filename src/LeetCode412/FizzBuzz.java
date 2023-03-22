package LeetCode412;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	
	public List<String> fizzBuzz(int n) {
		List<String> listaFizz =  new ArrayList<>();
		int aux = 1;
		for (int i = 0; i < n; i++) {
			
			if(aux%3 == 0 && aux%5==0)
				listaFizz.add("FizzBuzz");
			else if(aux% 3 == 0)
				listaFizz.add("Fizz");
			else if(aux%5 ==0)
				listaFizz.add("Buzz");
			else 
				listaFizz.add("" +aux);
			
			aux++;
		}
		
		return listaFizz;
		
    }
}
