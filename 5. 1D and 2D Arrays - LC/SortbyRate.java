import java.util.Scanner;
import java.util.Array;

/**
 * Ravi owns a SuperMarket at Chennai and he wants to ship some goods to his
 * Customers at New York. He approached a Shipping Company to know the Shipment
 * rates they offer to ship goods to New York from Chennai through different
 * aircraft carriers.
 * 
 * 
 * 
 * There are 'n' aircrafts plying between Chennai and New York and the Shipping
 * Officer verbally told the rates that each aircraft carrier charge but Ravi
 * wanted your help to sort the shipment rates in ascending order along with the
 * names of the aircrafts, so that he could decide the economical carrier.
 * 
 * 
 * 
 * Input Format: The first line of the input consists of an integer 'n',
 * corresponding to number of aircraft carriers plying between Chennai and New
 * York. The second n line of the input consists of string values corresponds to
 * name of each aircraft carrier. The third n line of the input consists of
 * double corresponds to shipment rate through each aircraft carrier.
 * 
 * Output Format: Print the aircraft carrier names along with the rate they
 * offer in ascending order based on rates. Refer the Sample Input and Output
 * for formatting specifications.
 * 
 * [All text in bold corresponds to input and rest corresponds to output.]
 * Sample Input and Output: 5 AirIndia Spicejet KingFisher Lufthansa Bluedart
 * 350.52 580.46 550.98 320.75 530.19 Details are : Lufthansa - 320.75 AirIndia
 * - 350.52 Bluedart - 530.19 KingFisher - 550.98 Spicejet - 580.46
 */

public class SortbyRate {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        String matrix[][] = new String[input][2];
        final int col = 1;

        for (int j = 0; j < input; j++) {
            matrix[j][0] = sc.next();
        }
        for (int j = 0; j < input; j++) {
            matrix[j][1] = sc.next();
        }

        Arrays.sort(matrix, new Comparator<String[]>() {
            @Override
            public int compare(final String[] entry1, final String[] entry2) {
                if (Double.parseDouble(entry1[col]) > Double.parseDouble(entry2[col]))
                    return 1;
                else
                    return -1;
            }
        });

        System.out.println("Details are :");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == 0) {
                    System.out.print(matrix[i][j] + " - ");
                } else {
                    System.out.print(matrix[i][j]);
                }
            }
            System.out.println();
        }
        sc.close();
    }

}