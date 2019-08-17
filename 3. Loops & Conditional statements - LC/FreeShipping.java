import java.util.Scanner;

/**
 * UFC is a reputed Shipping company in the City and has been awarded the Best
 * Logistics Company for the year by the National Trade Council of India. As a
 * way to thank its customers for their continued support, the company decides
 * to give free shipping offers every day.
 * 
 * The company has fixed certain criteria to select the lucky customers eligible
 * for the free shipping. The criteria is that if the sum of the digits in a
 * customer's shipment number is a prime number, then they are eligible for free
 * shipping.
 * 
 * Write a program to help the company identify the lucky customers who are
 * eligible for free shipping.
 * 
 * Problem Specification : The file name should be Main.java
 * 
 * Input format : Input consists of an integer value which corresponds to a
 * shipment number.
 * 
 * Output format : Output displays a message "Eligible for free shipping" or
 * "Not Eligible for free shipping".
 * 
 * [All text in bold corresponds to input rest corresponds to output] Sample
 * Input and Output 1:
 * 
 * Enter the shipment number : 65736 Not Eligible for free shipping
 * 
 * Sample Input and Output 2:
 * 
 * Enter the shipment number : 98752 Eligible for free shipping
 */
public class FreeShipping {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String result = "Eligible for free shipping";
        int total = 0;
        boolean flag = false;

        System.out.println("Enter the shipment number :");
        String shipNum = sc.nextLine();

        for (int i = 0; i < shipNum.length(); i++) {
            Character c = shipNum.charAt(i);
            total += Character.getNumericValue(c);
        }

        for (int i = 2; i <= total / 2; ++i) {
            if (total % i == 0) {
                flag = true;
                break;
            }
        }
        if (total == 0 || total == 1) {
            flag = true;
        }
        if (flag) {
            result = "Not " + result;
        }

        System.out.println(result);

        sc.close();
    }

}