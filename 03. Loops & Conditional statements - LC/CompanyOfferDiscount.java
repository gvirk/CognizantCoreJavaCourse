import java.util.Scanner;

/***
 * Datex Shipping Corporation is quite a renowned name in the logistic space.
 * With the growing competition in the market, the Company planned to give
 * exclusive discount offers to be well in demand amongst its competitors. The
 * Company offered discounts based on the weights of the shipped items or the
 * shipping distance, formally if the shipped item's weight is less than100 kg
 * or if the shipping distance is less than 500 kms.
 * 
 * 
 * Write a program to incorporate this requirement in the Shipping Management
 * System, thereby checking whether the company offers "discount" or "no
 * discount" for given item details.
 * 
 * Problem Specification : The file name should be Main.java.
 * 
 * Input Format : First integer input corresponds to weight of the item. Second
 * integer input corresponds to shipping distance from company.
 * 
 * Ouput Format : Refer sample input and output for formatting specifications.
 * 
 * Note : [All text in bold corresponds to input and rest corresponds to output]
 * Sample Input and Output 1 : Enter the weight 120 Enter the distance 300 Datex
 * shipping offers discount
 * 
 * Sample Input and Output 2 : Enter the weight 130 Enter the distance 700 Datex
 * shipping offers no discount
 */

public class CompanyOfferDiscount {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the weight");
        int weight = sc.nextInt();

        System.out.println("Enter the distance");
        int distance = sc.nextInt();

        String m = "Datex shipping offers no discount";

        if ((weight > 0 && weight < 101) || (distance > 0 && distance < 501)) {
            m = "Datex shipping offers discount";
        }

        System.out.println(m);

        sc.close();

    }
}