package LeetCode1323;

public class Max69 {
    public int maximum69Number (int num) {
     
        String numero = Integer.toString(num);

        for(int i = 0; i < numero.length(); i++){

            if(numero.charAt(i) == '6'){
                numero = numero.substring(0, i) + "9" + numero.substring(i+1, numero.length());
                break;
            }
        }
        
        int numeroConvert = Integer.parseInt(numero);

        return numeroConvert;
    }




    public static void main(String[] args) {
        Max69 m = new Max69();


        int n = m.maximum69Number(9669);
        System.out.println(n);

    }
}
