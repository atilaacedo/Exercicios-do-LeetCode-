package LastWord;

public class LastWord {
    public int lengthOfLastWord(String s) {
        int lengthOfLastWord = 0;
        s = s.trim();
        String[] last = s.split(" ");
        lengthOfLastWord = last[last.length-1].length();

        return lengthOfLastWord;
    }
}
