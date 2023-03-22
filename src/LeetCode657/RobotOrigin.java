package LeetCode657;

public class RobotOrigin {
    public boolean judgeCircle(String moves) {
        String[] dir = {"U", "D", "R", "L"};
        int contU = 0, contD = 0, contR = 0, contL = 0;

        if(moves.length() % 2 != 0 ) return false;

        for(int i = 0; i < moves.length(); i++){
            if(moves.charAt(i) == 'D') 
                contD++;
            else if(moves.charAt(i) == 'U') 
                contU++;
            else if(moves.charAt(i) == 'R') 
                contR++;
            else if(moves.charAt(i) == 'L') 
                contL++;
        }


        if(contU != contD) return false;
        if(contR != contL) return false;


        return true;
    }
}
