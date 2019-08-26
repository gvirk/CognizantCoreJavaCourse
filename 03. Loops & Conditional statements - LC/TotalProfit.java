import java.util.Scanner;

/**
 * Best Flight is a Shipping Company which offers remarkable range of logistics
 * solutions thereby connecting and improving lives. The Company has seen fair
 * profit lately due to its uncompromising customer-centric and delivering
 * excellence day in and day out, hence the Chariman called for to publish the
 * financial highlights of the Company for the previous financial year.
 * 
 * 
 * Given the number of months and the profit value earned in each month by the
 * Company, write a program to calculate the total profit value for the given
 * months.
 * 
 * Problem Specification: The File name should be Main.java.
 * 
 * Input Format : The first input consists of an integer which corresponds to
 * number of months. The next n set of inputs consists of an integer which
 * corresponds to profit value of each month.
 * 
 * Output Format: If the number of month is less than or equal to 0 print
 * "Invalid input". For the positive number of month display the Total profit
 * value. [Refer Sample Input and Output for formatting specifications.]
 * 
 * Note : [All text in bold corresponds to input and rest corresponds to output]
 * Sample Input and Output 1:
 * 
 * Enter the number of months : 5 
 * Enter the profit of each month in shipment
 * 1500 2000 2500 3000 3500 Total profit : 12500
 * 
 * Sample Input and Output 2:
 * 
 * Enter the number of months : -2 Invalid Input
 */

public class TotalProfit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of months :");
        int month = sc.nextInt();

        String output = "Invalid Input";
        if (month > 0) {
            System.out.println("Enter the profit of each month in shipment");
            int totalprofit = 0;
            for (int i = 0; i < month; i++) {
                int profit = sc.nextInt();
                totalprofit += profit;
            }
            output = "Total profit : " + Integer.toString(totalprofit);
        }

        System.out.println(output);
        sc.close();
    }
}