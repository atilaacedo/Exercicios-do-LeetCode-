package Palindrome;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(isPalindrome(lerInt(sc)));
    }

    private static int lerInt(Scanner sc){
        return sc.nextInt();
    }

    private static boolean isPalindrome(int x) {
        String number = Integer.toString(x);
        String numberTest ="";
        char[] numbers = number.toCharArray();

        for(int i = numbers.length-1; i>=0; i--){
            numberTest+=numbers[i];
        }

        if(number.equals(numberTest)){
            return true;
        }
       
        return false;
    }
}
