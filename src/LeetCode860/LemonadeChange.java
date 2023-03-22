package LeetCode860;

public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        boolean temTroco = true;
        int trocoNota5 =0;
        int trocoNota10 =0;
        for(int i = 0; i < bills.length; i++){
            if(bills[i] == 5)
                trocoNota5++;
                else{
                    
                    if(bills[i]==10){
                        if(trocoNota5 < 1)
                            return false;
                        else{
                            trocoNota10++;
                            trocoNota5--;
                        }
                    }
                   
     
                     if(bills[i] == 20){
                            if((trocoNota5 <1 ||trocoNota10 <1) && trocoNota5< 3) return false;
                            else{
                                if(trocoNota10 >= 1 && trocoNota5 >=1){
                                    trocoNota10--;
                                    trocoNota5--;
                                }else{
                                    trocoNota5-=3;
                                }
                            }
                     }
                 }
        }


        return temTroco;
    }
}
