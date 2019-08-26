import java.util.Scanner;

/**
 * Greendart Shipping Company was seen bustling with activities as it was
 * Christmas Weekend and they had numerous shipments to be transported. Ashok,
 * the Shipper had instructed his team to load the shipments into cargos and
 * gave them a list that contained all the shipment names and the corresponding
 * cargo Id through which it is to be shipped. The shipments are usually loaded
 * sequentially, that is first shipment is boarded to first cargo, second
 * shipment to second cargo, etc.,
 * 
 * 
 * During the day break, Ashok wished to manually supervise his team's work. He
 * randomly pulled out a shipment name and verified if it is boarded in the
 * correct Cargo. Since this task was not so efficient, he wanted the Shipment
 * Management System to supervise it automatically. Given the Cargo Id, he
 * wanted the System to give him the name of the shipment boarded into it. If
 * there is no shipment in a cargo, it should print "Yet to be shipped".
 * 
 * 
 * 
 * Input Format : First input corresponds to the number of Cargos. Second set of
 * inputs corresponds to the Cargo ids. Third input corresponds to the number of
 * shipments. Fourth set of inputs corresponds to shipment names. Fifth input
 * corresponds to cargo id to be searched. Output Format: Refer sample input and
 * output for formatting specifications.
 * 
 * [All text in bold corresponds to input and rest corresponds to output.]
 * Sample Input and Output 1: Enter the number of cargo 4 Enter the cargo id 100
 * 101 102 103 Enter the number of shipment 4 Enter the shipment name Electric
 * Fan Air Conditioner Ceiling Fan Camera Enter the cargo id 102 Ceiling Fan
 * 
 * Sample Input and Output 2: Enter the number of cargo 3 Enter the cargo id 123
 * 124 125 Enter the number of shipment 2 Enter the shipment name Printer Xerox
 * Machine Enter the cargo id 125 Yet to be shipped
 */

public class ShipmentCompany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of cargo");
        int cargoIdCount = sc.nextInt();
        String cargoId[] = new String[cargoIdCount];

        System.out.println("Enter the cargo id");
        for (int i = 0; i < cargoIdCount; i++) {
            cargoId[i] = sc.next();
        }

        System.out.println("Enter the number of shipment");
        int shipmentCount = sc.nextInt();
        String shipmentName[] = new String[shipmentCount];

        System.out.println("Enter the shipment name");
        int count = 0;
        while (count < shipmentCount) {
            String str = sc.nextLine();
            if (!str.trim().isEmpty()) {
                shipmentName[count] = str;
                count++;
            }
        }

        System.out.println("Enter the cargo id");
        int findId = sc.nextInt();

        String result = "Yet to be shipped";

        for (int i = 0; i < cargoId.length; i++) {
            int id = Integer.parseInt(cargoId[i]);
            if (id == findId && (i < shipmentName.length)) {
                if ((shipmentName[i] != null && !shipmentName[i].isEmpty())) {
                    result = shipmentName[i];
                }
            }
        }

        System.out.println(result);
        sc.close();
    }

}