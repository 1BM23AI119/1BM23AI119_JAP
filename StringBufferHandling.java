import java.util.Scanner;

public class StringBufferHandling {
    public static void main(String args[]) {
        StringBuffer sb1 = new StringBuffer();
        System.out.println("Capacity: " + sb1.capacity());

        StringBuffer sb2 = new StringBuffer("Hello");
        System.out.println(sb2);

        // Creating Scanner object to get input from user
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = scan.nextLine();

        // Creating a StringBuffer object to reverse the input string
        StringBuffer rev = new StringBuffer(inputString);

        // Reversing the string, converting to uppercase, and printing it
        System.out.println(rev.reverse().toString().toUpperCase());
        System.out.println("enter string ");
        String appendstr= scan.nextLine();
        rev.append(appendstr);
        System.out.println("after appending "+rev);
        scan.close();


    }
}
/*Capacity: 16
Hello
Enter a string:
hrlo
OLRH
enter string
onma
after appending olrhonma*/

