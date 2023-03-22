package LeetCode682;

import java.util.ArrayList;
import java.util.List;

public class BaseballGame {
    public int calPoints(String[] operations) {
        int sum = 0;
        List<Integer> recordsList = new ArrayList<>();
        for(int i = 0; i < operations.length; i++){
            if(Character.isDigit(operations[i].charAt(0))){
                recordsList.add(Integer.parseInt(operations[i]));
               
                sum+= Integer.parseInt(operations[i]);
            }else if(Character.isLetter(operations[i].charAt(0))){
                switch(operations[i]){
                   
                    case "D":
                        int dobro = recordsList.get(recordsList.size()-1) * 2;
                        recordsList.add(dobro);
                        sum+= dobro;
                        break;
                    case "C":
                        sum-= recordsList.get(recordsList.size()-1);
                        recordsList.remove(recordsList.get(recordsList.size()-1));
                        
                        break;
                }
            }else{
                if(operations[i].equals("+")){
                    if(recordsList.size() > 1){
                        int somaTemp = recordsList.get(recordsList.size()-1) + recordsList.get(recordsList.size()-2);
                        recordsList.add(somaTemp);
                        sum+=somaTemp;
                        
                    }else{
                        recordsList.add(recordsList.get(recordsList.size()-1));
                    }
                }else if(Integer.parseInt(operations[i]) < 0 ){
                    recordsList.add(Integer.parseInt(operations[i]));
               
                    sum+= Integer.parseInt(operations[i]);
                }
            }
            System.out.println(sum);
        }



        return sum;
    }


    public static void main(String[] args) {
        BaseballGame b = new BaseballGame();
        String[] list = {"5","-2","4","C","D","9","+","+"};
        int s = b.calPoints(list);
        System.out.println(s);
    }
}
