package Code_Work;

import java.util.Scanner;

public class Longest_Substring_Without_Repeating_Characters {
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int[] charIndex = new int[128];
        for (int i = 0; i < 128; i++) {
            charIndex[i] = -1;
        }

        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            if (charIndex[currentChar] >= left) {
                left = charIndex[currentChar] + 1;
            }

            charIndex[currentChar] = right;
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word = sc.nextLine();
        System.out.println(lengthOfLongestSubstring(word));
    }
}
