package LeetCode739;

import java.util.Stack;

public class DayTemp {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer =  new int[temperatures.length];
        Stack<Integer> pilha = new Stack<>();

        for(int i = 0; i < answer.length; i++){
           while(!pilha.empty() && temperatures[pilha.peek()] < temperatures[i]){
                int index = pilha.pop();
                int diff = i -index;
                answer[index] = diff;
           } 

           pilha.push(i);
        }

        return answer;
    }


    public static void main(String[] args) {
        DayTemp d =  new DayTemp();
        int[] temp = {30,60,90};
        for(Integer i: d.dailyTemperatures(temp)){
            System.out.println(i);
        }
        
    }
}
