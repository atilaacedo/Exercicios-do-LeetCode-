package LeetCode319;



public class BulbSwitcher {
	
	public static void main(String[] args) {
		BulbSwitcher b = new BulbSwitcher();
		
		int n = b.bulbSwitch(3);
		System.out.println(n);
	}
	
	 public int bulbSwitch(int n) {
		 
		Double sq = Math.sqrt(n);
		double floor = Math.floor(sq);
		 
		 return (int) floor;
	  }
}
