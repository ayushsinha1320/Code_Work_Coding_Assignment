package Code_Work;

import java.util.Scanner;

public class Longest_Common_Prefix {
    public static String longestCommonPrefix(String[] words) {
        if (words == null || words.length == 0) {
            return "";
        }

        String prefix = words[0];

        for (int i = 1; i < words.length; i++) {
            while (words[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of words: ");
        int length = sc.nextInt();
        String[] words = new String[length];

        for(int i=0;i<length;i++){
            words[i] = sc.next();
        }

        System.out.println("Output: " + longestCommonPrefix(words));
    }
}
