import java.util.Scanner;

/**
 * Best Flight is a Shipping Company which offers remarkable range of logistics
 * solutions thereby connecting and improving lives. The Company has seen fair
 * profit lately due to its uncompromising customer-centric and delivering
 * excellence day in and day out, hence the Chariman assigned his Business team
 * to perform a detailed analysis on the profit values of 'n' different months
 * of the Company. The Company has set a benchmark of Rs. 100000 and so the
 * Chairman was curious to find the number of months during which the profit
 * values has exceeded the benchmark of Rs.100000.
 * 
 * Kindly help the business team calculate the number of profit values that
 * exceed Rs. 100000, given the profit values of 'n' months.
 * 
 * Input Format : The first input consists of an integer 'n' corresponds to the
 * total number of month. The next n inputs consists of a double value which
 * denotes the profit value earned per month.
 * 
 * Output Format : Output consists of an integer which denotes the total number
 * of months in which profit exceeds the value Rs.100000. Refer the sample input
 * and output for displaying the details.
 * 
 * [All text in bold corresponds to input and rest corresponds to output] Sample
 * Input and Output 1:
 * 
 * Enter the total number of months 
 * 5 
 * 
 * Enter the profit amount of shipment in each month 
 * 50000.00 
 * 25000.00 
 * 110000.00 
 * 200000.00 
 * 30000.00 
 * 
 * Profit value has exceeded Rs. 100000 for 2 month(s).
 */

public class ProfitMonthsCount {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of months");
        int month = sc.nextInt();

        String output = "Invalid Input";
        if (month > 0) {
            System.out.println("Enter the profit amount of shipment in each month");

            int count = 0;
            for (int i = 0; i < month; i++) {
                double profit = sc.nextDouble();
                if (profit >= 100000) {
                    count++;
                }
            }
            output = "Profit value has exceeded Rs. 100000 for " + count + " month(s).";
        }
        System.out.println(output);
        sc.close();

    }
}