package ImplementStr;

public class ImplementstrStr {

    public static void main(String[] args) {
        ImplementstrStr s = new ImplementstrStr();
        System.out.println(s.strStr("aaaaa", "bba"));
    }


    public int strStr(String haystack, String needle) {
        
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        
        return -1;
    }
}
