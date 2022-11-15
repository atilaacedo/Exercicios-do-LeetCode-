package RomanToInteger;

public class RomanToInteger {

    public static void main(String[] args) {
        RomanToInteger r = new RomanToInteger();

        System.out.println(r.romanToInt("MCMXCIV"));
    }

    public int romanToInt(String s) {
        int numero = 0;

        String[] separados = s.split("");

        for(int i =0; i < separados.length; i++){
            
            if(i+1 < separados.length){
                if(separados[i].equals("I") && !(separados[i+1].equals("V")) && !(separados[i+1].equals("X"))){
                    numero++;
                }else if(separados[i].equals("I") && separados[i+1].equals("V")){
                    numero+=4;
                    separados[i+1] = " ";
                }else if(separados[i].equals("I") && separados[i+1].equals("X")){
                    numero+=9;
                    separados[i+1] = " ";
                }

                if(separados[i].equals("X") && !(separados[i+1].equals("L")) && !(separados[i+1].equals("C"))){
                    numero+=10;
                }else if(separados[i].equals("X") && separados[i+1].equals("L")){
                    numero+=40;
                    separados[i+1] = " ";
                }else if(separados[i].equals("X") && separados[i+1].equals("C")){
                    numero+=90;
                    separados[i+1] = " ";
                }


                if(separados[i].equals("C") && !(separados[i+1].equals("D")) && !(separados[i+1].equals("M"))){
                    numero+=100;
                }else if(separados[i].equals("C") && separados[i+1].equals("D")){
                    numero+=400;
                    separados[i+1] = " ";
                }else if(separados[i].equals("C") && separados[i+1].equals("M")){
                    numero+=900;
                    separados[i+1] = " ";
                }


                if(separados[i].equals("V")){
                    numero+=5;
                }

                if(separados[i].equals("L")){
                    numero+=50;
                }

                if(separados[i].equals("D")){
                    numero+=500;
                }

                if(separados[i].equals("M")){
                    numero+=1000;
                }
            }else{
                switch(separados[i]){
                    case "I":
                        numero++;
                        break;
                    case "V":
                        numero+=5;
                        break;
                    case "X":
                        numero+=10;
                        break;
                    case "L":
                        numero+=50;
                        break;
                    case "C":
                        numero+=100;
                        break;
                    case "D":
                        numero+=500;
                        break;
                    case "M":
                        numero+=1000;
                        break;
                }
            }
        }

        return numero;
    }
}
