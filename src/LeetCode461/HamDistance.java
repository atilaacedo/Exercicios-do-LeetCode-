package LeetCode461;

public class HamDistance {
    public int hammingDistance(int x, int y) {
        
        int distance = 0;

        String n1 = Integer.toBinaryString(x);
        String n2 = Integer.toBinaryString(y);
        StringBuilder bN1 = new StringBuilder(n1);
        StringBuilder bN2 = new StringBuilder(n2);
        int maior = n1.length();

        if(n1.length() < n2.length()) maior = n2.length();

        while(n1.length() < maior ){
            bN1.insert(0, "0");
            n1 = bN1.toString();
       
        }

        while(n2.length() < maior){
            bN2.insert(0, "0");
            n2 = bN2.toString();
        }
        
        for(int i = 0; i < n1.length(); i++){
            if(n1.charAt(i) != n2.charAt(i)) distance++;
        }



        return distance;
    }

    public static void main(String[] args) {
        HamDistance h = new HamDistance();

        int d = h.hammingDistance(680142203, 1111953568);

        System.out.println(d);
    }
}
