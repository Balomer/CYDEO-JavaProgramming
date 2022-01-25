package TwoStatements;

import java.util.*;

public class VendingMachine {
    public static void main(String[] args) {
        //ENTER CODE HERE
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter cents:");
        int givenCents=scanner.nextInt();
        int quarters=givenCents/25;
        int dimes=(givenCents%25)/10;
        int nickels=(givenCents%25%10)/5;
        int pennies=(givenCents%5);

        if (givenCents>=100 || givenCents<=0){
            System.out.println("Invalid cents amount");
        }
        else{
            System.out.println("Your change is "+quarters+" quarters, "+dimes+" dimes, "+nickels+" nickels, and "+pennies+" pennies");
        }
    }
}