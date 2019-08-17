import java.util.Scanner;

/**
 * Trinity Logistics is a small scale shipping company but has been immensely
 * keen in expanding its customer base over the years, the reason why it has
 * reported a fair profit in business. The Company went ahead furthermore to
 * embrace their Customers by announcing a tax-free shipping for its Valuable
 * Customers' next shipment.
 * 
 * 
 * 
 * Valuable Customers are those Customers if the number shipments made by them
 * per month is greater than 20. Write a program to find if a Customer is a
 * Valuable Customer or not, given the number of shipments made by them per
 * month.
 * 
 * 
 * 
 * Input Format: Input consists of an integer which corresponds to the number of
 * shipments per month.
 * 
 * Output Format: Output consists of a string which shows "Valuable customer" if
 * the shipment is greater than 20, "Not a valuable customer" if the shipment is
 * less than or equal to 20. Print "Invalid Input" if the number of shipments
 * per month is lesser than or equal to 0.
 * 
 * [All text in bold corresponds to input and rest corresponds to output] Sample
 * Input and Output 1: Enter the number of shipments per month : 10 Not a
 * valuable customer
 * 
 * Sample Input and Output 2: Enter the number of shipments per month : 21
 * Valuable customer
 * 
 * Sample Input and Output 3: Enter the number of shipments per month : -5
 * Invalid Input
 * 
 */

public class ValuableCustomer {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of shipments per month :");
        int month = sc.nextInt();

        if (month > 20) {
            System.out.println("Valuable customer");
        } else if (month > 0 && month < 21) {
            System.out.println("Not a valuable customer");
        } else {
            System.out.println("Invalid Input");
        }

        sc.close();

    }
}