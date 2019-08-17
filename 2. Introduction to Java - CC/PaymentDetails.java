import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Alvin, on behalf of Home Needs SuperMarket, has raised an Invoice in favour
 * of Royal Orchids Hotel and it is now the turn of the Hotel Management to pay
 * for their orders. The Hotel Management had already agreed upon to pay using
 * multiple payouts/attempts and not as a single time payment.
 * 
 * 
 * 
 * Write a program to get all the details related to the payment like Number of
 * attempts for the payment, Customer Name and the Invoice total amount. Print
 * the details in the specified format.
 * 
 * Problem Specifications: Use Scanner class to get the input.
 * 
 * Input Format: The first input consists of an integer corresponding to the
 * number of attempts/payouts. The second input consists of a string
 * corresponding to the Customer name. The third input consists of a double
 * corresponding to the Total amount in the Invoice.
 * 
 * Output Format: Round off the amount value with 2 decimal places. Refer sample
 * input and output for formatting specifications.
 * 
 * Sample Input and Output: [All text in bold corresponds to input and rest
 * corresponds to output.] Enter the number of attempts: 10 Enter Customer Name:
 * Karthick Enter the Amount: 1599.49 Entered payment details Number of attempt:
 * 10 Customer Name: Karthick Amount: 1599.49
 */

public class PaymentDetails {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Enter the number of attempts:");
        int numAttempts = sc.nextInt();

        System.out.println("Enter Customer Name:");
        String name = sc.next();

        System.out.println("Enter the Amount:");
        double amount = sc.nextDouble();

        String finalAmount = df.format(amount);

        System.out.println("Entered payment details" + "\nNumber of attempt: " + numAttempts + "\nCustomer Name: "
                + name + "\nAmount: " + finalAmount);

        sc.close();

    }
}
