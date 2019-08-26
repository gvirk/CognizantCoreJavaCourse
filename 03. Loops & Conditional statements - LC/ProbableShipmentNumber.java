import java.util.Scanner;

/**
 * Raju is a cloth Merchant and had exported his merchandise through a famous
 * shipping Company couple of days ago. He wished to track the status of his
 * shipment now through the Company's Shipping Management System but he could
 * not recollect his exact shipment number. All that he remembers about the
 * number is that all the digits in the number is a multiple of 3.
 * 
 * 
 * Given a range of numbers, help Raju identify those shipment numbers which
 * probably could be his shipment number. Write a program to find those numbers
 * in the given range that have its digits as a multiple of 3.
 * 
 * Problem specification: File name should be Main.java. Zero is a multiple of
 * every integer.
 * 
 * Input Format : Input consists of two integers which corresponds to the range
 * of shipment number. First integer corresponds to the starting range Second
 * integer corresponds to the ending range (a <= b || a < b).
 * 
 * Output Format: Output consists of n integers which show all the possible
 * shipment numbers.
 * 
 * [All text in bold corresponds to input and rest corresponds to output] Sample
 * Input and Output 1: Enter the range for shipment numbers : 30 40 Possible
 * shipment numbers : 30 33 36 39
 * 
 * Sample Input and Output 2: Enter the range for shipment numbers : 10 20
 * Possible shipment numbers : Shipment numbers unavailable
 */

public class ProbableShipmentNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range for shipment numbers :");

        int firstNum = 0;
        int secondNum = 0;
        String result = "";

        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                firstNum = sc.nextInt();
            } else {
                secondNum = sc.nextInt();
            }
        }
        System.out.println("Possible shipment numbers :");
        
        
        for (int i = firstNum; i <= secondNum; i++) {
            int length = (int) (Math.log10(i) + 1);
            int count = 0;
            String fnum = new Integer(i).toString();

            for (int j = 0; j < (length); j++) {
                char c = fnum.charAt(j);
                int a = Character.getNumericValue(c);

                if (a % 3 == 0) {
                    count++;

                    if (count == length) {
                        result += String.valueOf(i)+'\n';
                    }
                } 
            }
        } 

        if(!result.trim().isEmpty()){
                System.out.println(result.trim());
            } else{
                System.out.println("Shipment numbers unavailable");
            }
            
        sc.close();

    }

}