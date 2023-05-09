package LeetCode929;

import java.util.HashMap;

public class UniqueMail {

    public static void main(String[] args) {
        String[] emails = { "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com" };

        System.out.println(numUniqueEmails(emails));
    }

    public static int numUniqueEmails(String[] emails) {
        int alt = 0;
        HashMap<String, Boolean> validarMails = new HashMap<>();
        for (int i = 0; i < emails.length; i++) {
            int indexArr = emails[i].indexOf("@");
            String analisada = emails[i].substring(0, indexArr);
            String domain = emails[i].substring(indexArr, emails[i].length());

            if (analisada.contains(".")) {
                analisada = analisada.replace(".", "");

            }

            if (analisada.contains("+")) {
                int indexPlus = analisada.indexOf("+");
                analisada = analisada.substring(0, indexPlus);
            }

            emails[i] = analisada + domain;

            if (!(validarMails.containsKey(emails[i]))) {
                validarMails.put(emails[i], true);
                alt++;
            }
        }

        return alt;
    }
}
