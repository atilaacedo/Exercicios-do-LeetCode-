package LeetCode441;

public class ArrangCoins {
    public int arrangeCoins(int n) {
        int rowCompl = 0;
        int row = 1;
        while(n > 0){
            if(row <= n){
                n-=row;
                row++;
                rowCompl++;
            }else{
                break;
            }
        }


        return rowCompl;
    }


    public static void main(String[] args) {
        ArrangCoins aC = new ArrangCoins();

        int r = aC.arrangeCoins(8);

        System.out.println(r);
    }
}
