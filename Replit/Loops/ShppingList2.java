package Loops;

import java.util.Scanner;

public class ShppingList2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;
        while(count<=10){
            System.out.println("Enter Item"+count+" and its price:");
            item= scan.nextLine();
            price = Double.parseDouble(scan.nextLine());
            shoppingListReport+="Item"+count+": "+item+" Price: "+price+", ";
            System.out.println("Add one more item?");
            totalPrice+=price;
            count++;
            if(scan.nextLine().equalsIgnoreCase("no")) break;
        }
        System.out.println(shoppingListReport.substring(0,shoppingListReport.length()-2));
        System.out.println("Total price: "+totalPrice);
    }
}