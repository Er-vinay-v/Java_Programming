package String;

import java.util.Locale;
import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        String s="hello world,";
        String k="India is my native country ";
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a string you wnat to print ");
        //this method is used for printing a whole line of sentences without any space
       // String v=sc.next();

        String w=sc.nextLine();//This method is used for printing a whole paragraph with multiple space
        String l=s+k+w;
        System.out.println(l);

        //length():-This method are used for printing length of the string;
        System.out.println(l.length());

        //charAt():- This method are used for printing special character of string
        System.out.println(l.charAt(12));

        //indexOf():-This method is used for finding target character index
        System.out.println(l.indexOf('t'));

        //compareTo():-This method is used for comparing of two string lexographical
        System.out.println(l.compareTo(w));

        //contains():-This method are used for searching a string in the string array
        System.out.println(l.contains("try"));

        //startWith():-This method is used for verify ,what is starting string
        System.out.println(l.startsWith("hello"));

        //endWith():-This property is used for verify, is the end string is right?
        System.out.println(l.endsWith("labeled"));

        //toLowerCase():-This method is use for convert all the string in lower case alphabet character
        System.out.println(l.toLowerCase());

        //toUpperCase():-This property is used for converting all the string upper case alphabet character
        System.out.println(l.toUpperCase(Locale.ROOT));

        String i=" Dhoni is my favourite player";
        //conCat():-this method is used for adding two string
        System.out.println(l.concat(i));
    }
}
