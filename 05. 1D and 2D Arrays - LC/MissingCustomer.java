import java.util.Scanner;

/**
 * Zayn has a Mobile Accessories shop. He wants to ship some accessories to his
 * remotely located Customers. He maintains the details of an order like
 * Customer id and Name, Items purchased, Total amount, etc., in a simple
 * automated system, whenever he gets a new order.
 * 
 * 
 * 
 * 
 * The System encountered a bug and one of the Customers details got missed.
 * Zayn usually assigned Ids to the Customers sequentially from 1 to 'n' and now
 * wants to know the Id of the missing Customer. Help him find it out, given the
 * number of Customers and the sequence of their Ids.
 * 
 * Input Format:
 * 
 * The first input consists of an integer 'n' corresponding to the number of
 * customers. Next 'n' inputs corresponds to the Customers Ids.
 * 
 * Output Format: Output should display the missing customer Id. Refer sample
 * input and output for formatting specifications.
 * 
 * [All text in bold corresponds to input and rest corresponds to output.]
 * Sample Input and Output: 5 1 2 3 5 6 Customer id 4 is missing
 */

public class MissingCustomer {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int a[] = new int[input];
        for (int i = 0; i < input; i++) {
            a[i] = sc.nextInt();
        }
        int miss = getMissingNo(a, a.length);
        System.out.println("Customer id " + miss + " is missing");
        sc.close();
    }

    public static int getMissingNo(int a[], int n) {
        int i, total;
        total = (n + 1) * (n + 2) / 2;
        for (i = 0; i < n; i++)
            total -= a[i];
        return total;
    }

}