import java.util.Scanner;

/**
 * The Shipment Management System is an interactive application where all its
 * Users connect and operate easily. Only authorized Users are allowed to
 * operate the System and is therefore required to store the details of such
 * Users. To accomplish this , the development team set out to read the details
 * of the Users including their rating for the system and display the details in
 * the specified format.
 * 
 * 
 * Write a program to input the user details and print the desired output.
 * 
 * Problem Specification : Use Scanner class for getting the input from the user.
 * 
 * Input Format: First input consists of an integer that corresponds to the user
 * id. Second input consists of a String that corresponds to the user's name.
 * Third input consists of a String that corresponds to the user's username.
 * Fourth input consists of a String that corresponds to the user's password.
 * Fifth input consists of a String that corresponds to the user's mobileNumber.
 * Sixth input consists of a Double that corresponds to the user's rating.
 * 
 * Output Format: Display the rating value in the format as shown in the sample
 * input and output. Refer Sample Input and Output for displaying User Details
 * 
 * [All text in bold corresponds to input and rest corresponds to output.]
 * Sample Input and Output :
 * 
 * Enter the User Details : Enter the id : 18 Enter the name : Richard Enter the
 * username : richard Enter the password : richard@12#$ Enter the mobilenumber :
 * 7034561239 Enter the rating : 5.0 User details are : Id : 18 Name : Richard
 * Username : richard Mobile Number : 7034561239 Rating : 5.0
 */

public class DisplayUserDetails {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the User Details :");

        System.out.println("Enter the id :");
        int userId = sc.nextInt();

        System.out.println("Enter the name :");
        String name = sc.next();

        System.out.println("Enter the username :");
        String username = sc.next();

        System.out.println("Enter the password :");
        String password = sc.next();

        System.out.println("Enter the mobilenumber :");
        String mobilenumber = sc.next();

        System.out.println("Enter the rating :");
        double d = sc.nextDouble();

        System.out.println("User details are :" + "\nId : " + userId + "\nName : " + name + "\nUsername : " + username
                + "\nMobile Number : " + mobilenumber + "\nRating : " + d);

        sc.close();

    }
}