package LeetCode1103;

public class CandiesOfPeople {
	
	
	public static void main(String[] args) {
		CandiesOfPeople p = new CandiesOfPeople();
		
		
		
		int[] result = p.distributeCandies(10, 3);
		
		for(Integer i : result) {
			System.out.println(i);
		}
	}
	
	public int[] distributeCandies(int candies, int num_people) {
        
		int i = 0;
		int aux = 1;
		
		int[] numsOfCandies = new int[num_people];
		boolean haveAnyCandie = true;
		
		
		while(haveAnyCandie) {
			numsOfCandies[i] += aux;
			candies -= aux;
			
			System.out.println(aux);
			System.out.println("Doces restantes: "  + candies);
			
			if(aux >= candies)
				aux = candies;
			else {
				aux++;
			}
			
			if((i+1) == num_people) {
				i = 0;
			}else {
				i++;
			}
			
			
			
			if(candies <= 0) haveAnyCandie = false;
			
			
			
		}
		
		return numsOfCandies;
		
    }
}
