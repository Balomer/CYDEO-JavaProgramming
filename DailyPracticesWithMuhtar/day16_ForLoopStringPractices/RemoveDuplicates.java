package day16_ForLoopStringPractices;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String word = new Scanner(System.in).next();
        String result = "";
        int l = word.length();
        for (int i = 0; i < l; i++) {
            result += word.substring(0, 1);
            word = word.replace(word.substring(0, 1), "");
            if (word.length() == 0) {
                break;
            }
        }
        System.out.println(result);
    }
}