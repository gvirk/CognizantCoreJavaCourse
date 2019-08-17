import java.util.Scanner;

/**
 * Major clients of AGCI Corporation are Shopperstopzone, Zonefi, etc., The
 * Management instructed the development team to have a unique Welcome message
 * on the automated system specific for the clients.
 * 
 * 
 * Write a program that reads the Client name and prints the Welcome message.
 * 
 * 
 * Input Format: The input consists of a single string which corresponds to the
 * name of the client.
 * 
 * Output Format: Refer sample input and output.
 * 
 * Sample Input and Output 1: [All text in bold corresponds to input and the
 * rest corresponds to output]
 * 
 * Enter the name ZopNow Hello ZopNow! Get access to the unique shipping!
 */

public class WelcomeMessage {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name");
        String name = sc.nextLine();
        System.out.println("Hello " + name + "! Get access to the unique shipping! ");

        sc.close();
    }
}