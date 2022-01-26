package day09_IfStatements;

public class MinNumber {
    public static void main(String[] args) {
        int n1 = 10, n2 = 20, n3 = 30;
        if (n1 < n2 && n1 < n3) System.out.println(n1 + " is the minimum number");
        if (n2 < n1 && n2 < n3) System.out.println(n2 + " is the minimum number");
        if (n3 < n2 && n3 < n1) System.out.println(n3 + " is the minimum number");
    }
}
