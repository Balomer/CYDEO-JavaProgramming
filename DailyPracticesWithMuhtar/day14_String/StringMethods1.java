package day14_String;


public class StringMethods1 {
    public static void main(String[] args) {

        String str = "      Java is fun, I love learning Java and improving my algorithm skills";
        int currLegth = str.length();
        str = str.trim();
        int length = str.length();
        int firstA = str.indexOf("A");
        int lastA = str.lastIndexOf("a");
        System.out.println("currLegth = " + currLegth);
        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("length = " + length);

        System.out.println("\n=============================================\n");

        String str2 = "My bank account's balance is : $3000";
        str2 = str2.replace("$", "€");
        System.out.println("str2 = " + str2);
        System.out.println(str2.replace("My", "Your"));
        str2 = str2.replace("000","K");
        System.out.println(str2);

        System.out.println("\n=============================================\n");

        String str3 ="&";
        System.out.println(str3.repeat(length/3));

    }
}
