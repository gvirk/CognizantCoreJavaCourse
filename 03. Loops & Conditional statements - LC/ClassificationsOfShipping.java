import java.util.Scanner;

/**
 * The cost of transporting goods is mainly reflective of the mode of
 * transportation used namely truck, ship, train or air craft. The Shipping
 * Management System should let the users know the possible mode of
 * transportation for a specific item(based on the source and destination
 * ports), when placing a shipping order.
 * 
 * 
 * 
 * Datex Shipping Corporation uses a specific code to identify through what
 * modes can an item be possibly shipped. The special shipment code is a string
 * of length strictly 3 characters containing only 0's and 1's. If the item can
 * be shipped through only Airways, the first digit in the code will be 1
 * otherwise 0 --> 100 If the item can be shipped through only Waterways, the
 * second digit in the code will be 1 otherwise 0 --> 010 If the item can be
 * shipped through only Roadways, the third digit in the code will be 1
 * otherwise 0 --> 001 If the item can be shipped through Airways and Waterways,
 * the first and second digit in the code will be 1 otherwise 0 --> 110,
 * likewise for other modes too. If the item can be shipped through all modes,
 * all 3 digits will be 1 --> 111
 * 
 * Given the shipment code, help a customer know what are the ways through which
 * his item can be shipped.
 * 
 * 
 * Note: Shipment code will start from 001 and end at 111.
 * 
 * Problem Specifications: The file name should be Main.java.
 * 
 * Input Format: The input consists of a string which represents the shipment
 * code.
 * 
 * Output Format: Output should display either of the three modes namely
 * "Airway" or "Waterway" or "Roadway". If the item can be shipped through two
 * modes, display the output like "Airway and Roadway", " Waterway and Roadway
 * ", and "Airway and Waterway", If the item can be shipped through all three
 * ways, display "All Ways". Refer sample input and output for formatting
 * specifications. Note : [All text in bold corresponds to input and rest
 * corresponds to output.]
 * 
 * Sample Input and Output 1: Enter the shipment code : 101 Airway and Roadway
 * 
 * Sample Input and Output 2: Enter the shipment code : 111 All ways
 * 
 * Sample Input and Output 3: Enter the shipment code : 010 Waterway
 * 
 */

public class ClassificationsOfShipping {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the shipment code :");
        String code = sc.nextLine();

        switch (code) {
        case "111":
            System.out.println("All ways");
            break;
        case "110":
            System.out.println("Airway and Waterway");
            break;
        case "011":
            System.out.println("Waterway and Roadway");
            break;
        case "101":
            System.out.println("Airway and Roadway");
            break;
        case "010":
            System.out.println("Waterway");
            break;
        case "100":
            System.out.println("Airway");
            break;
        case "001":
            System.out.println("Roadway");
            break;
        }

        sc.close();

    }
}