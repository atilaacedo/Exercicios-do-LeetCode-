package PivotIndex;

public class PivotIndex {

    public static void main(String[] args) {
        PivotIndex p = new PivotIndex();
        int[ ] nums ={1,7,3,6,5,6};
        System.out.println(p.pivotIndex(nums));
    }

    public int pivotIndex(int[] nums) {
        int sum = 0;
       
        for(int i = 0; i < nums.length;i++){
            sum+=nums[i];
        }
        
       
     
        if(sum == 0 && nums.length == 1){
            return 0;
        }
        int comp = 0;
        for(int i = 0 ; i <= nums.length -1 ; i ++){
            while(i == 0){
                if(sum - nums[0] == 0) return 0;
                else break;
            }
            
            comp+= nums[i];

            int somaTotal = sum -comp;
            System.out.println(somaTotal);
            System.out.println(comp);
            if(comp == (somaTotal - nums[i+1])){
                return i+1;
            }
           
        }
   
        return -1;
    }
}
