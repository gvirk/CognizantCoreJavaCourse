import java.util.Scanner;

/**
 * AGCI Corporation transports all its goods through Containers. It is mandatory
 * that the Shipping Management System maintains a list of all the goods along
 * with their respective shipping cost, that are put together in a Container.
 * The System should also contain an option to print the total shipping cost of
 * all the goods put in a Container.
 * 
 * 
 * Assume there are three items currently loaded in a Container. Assist the
 * development team to write a program that would input the shipping cost of
 * those three Items in the Container and output the total shipping cost.
 * 
 * 
 * Input Format : The input contains 3 lines each with integer values that
 * corresponds to the cost of item1,item2,item3. Output Format: Refer sample
 * input and output for formatting specifications.
 * 
 * Sample Input and Output: [All text in bold corresponds to input and rest
 * corresponds to output.]
 * 
 * Enter the shipping cost of Item 1 100 Enter the shipping cost of Item 2 76
 * Enter the shipping cost of Item 3 55 Total shipping cost of items is 231
 */

public class ShipppingCost {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter the shipping cost of Item 1");

        int Item1 = myObj.nextInt(); // Read user input
        System.out.println("Enter the shipping cost of Item 2");

        int Item2 = myObj.nextInt();
        System.out.println("Enter the shipping cost of Item 3");

        int Item3 = myObj.nextInt();
        System.out.println("Total shipping cost of items is " + (Item1 + Item2 + Item3));

        myObj.close();
    }
}