import java.util.Scanner;
import java.util.Arrays;

/**
 * Ravi is the owner of Trendy, an online Fashion boutique that sells clothings
 * and accessories. Ravi takes order from Customers online and ships the items
 * all over the world. He maintains the details of an order like Customer id and
 * Name, Items purchased, Total amount, etc., in a simple automated system,
 * whenever he gets a new order.
 * 
 * 
 * The System suddenly started to malfunction and the Customer details got
 * shuffled. Ravi usually assigned Ids to the Customers sequentially (starting
 * from a specific number) and he doesn't know which was the last Customer id.
 * Now there is a new order and he ought to give the Customer an Id, so help him
 * find what could be the next Id he should assign to the new Customer.
 * 
 * 
 * Given the number of Ids and the sequence of the shuffled Ids, find the next
 * Id that Ravi has to give his new Customer.
 * 
 * 
 * 
 * Input Format: Input consists of n+1 lines. First line of the input is an
 * integer 'n' that corresponds to the number of Customers. The next 'n' lines
 * corresponds to the list of Customers Ids
 * 
 * Output Format: Print in a single line the next Customer Id. Refer the sample
 * Input and Output for formatting specifications.
 * 
 * [All text in bold corresponds to input and rest corresponds to output.]
 * Sample Input and Output: 5 2 3 5 4 1 Next customer id is 6
 */

public class NextCustomerId {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int[] arr = new int[input];

        for (int i = 0; i < input; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int total = arr.length;
        int nextId = arr[total - 1] + 1;

        System.out.println("Next customer id is " + nextId);
        sc.close();
    }
}