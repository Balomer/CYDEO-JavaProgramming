package day09_IfStatements;

import java.util.Scanner;

public class MedianNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        if((n1>n2 || n1>n3) && (n1<n2 || n1<n3)) System.out.println(n1+" is the median number");
        if((n2>n1 || n2>n3) && (n2<n1 || n2<n3)) System.out.println(n2+" is the median number");
        if((n3>n2 || n3>n1) && (n3<n2 || n3<n1)) System.out.println(n3+" is the median number");

    }
}
