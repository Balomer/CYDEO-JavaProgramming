package day15_ForLoop;


public class LettersDigitsSpecialChars {

    public static void main(String[] args) {
        String str = "A\nB\tC  D123#$@!  xyz0567    ";

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder specialChars = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isAlphabetic(ch)) {
                letters.append(ch);
            } else if (Character.isDigit(ch)) {
                digits.append(ch);
            } else if (!Character.isWhitespace(ch)) {
                specialChars.append(ch);
            }
        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);
    }
}