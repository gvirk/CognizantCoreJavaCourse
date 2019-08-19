import java.util.ArrayList;
import java.util.Scanner;

/**
 * Best Flight is an emerging logistics Company in the City and is evolving the
 * way goods are moved with the power of technology. There are plenty number of
 * Dealers and Customers using Best Flight for shipping their goods. Therefore
 * it essential to connect their Dealers and Customers to Shipment Management
 * System to know the entire details and status of their Shipments. Write a
 * piece of code strictly following the below specifications to get the Shipment
 * details and print the output.
 * 
 * This problem will help you understand about Static Variable and Static
 * Method.
 * 
 * 
 * Create a class named Shipment with the following private member variables /
 * attributes
 * 
 * 
 * int id String shipperName String modeOfTransportation Float totalWeight
 * String arrivalPort String departurePort 1. Create a private static variable
 * nextShipmentId in Shipment class and initialise it to 1000.
 * 
 * 
 * 
 * Hint : static The static variable gets memory only once in class area at the
 * time of class loading. We can apply static keyword with variables, methods,
 * blocks and nested class. The static variable can be used to refer the common
 * property of all objects. It makes your program memory efficient. Eg : static
 * nextShipmentId = 1000; 2. Create a Constructor which accepts 6 arguments in
 * the argument order
 * (id,shipperName,modeOfTransportation,totalWeight,arrivalPort,departurePort)
 * 
 * 
 * Hint : Constructor A constructor in Java is a block of code similar to a
 * method that's called when an instance of an object is created. A constructor
 * doesn't have a return type. Eg : public
 * Shipment(id,shipperName,modeOfTransportation,totalWeight,arrivalPort,departurePort)
 * 3. Create a static method createNewShipment() - which accepts the shipment
 * details in the parameter and generates the shipment object and assigns the
 * shipment id and return the shipment object. For returning the object pass the
 * values in the constructor and return it.
 * 
 * 
 * public static Shipment createNewShipment(String shipperName,String
 * modeOfTransportation,Float totalWeight,String arrivalPort,String
 * departurePort) The id assigned to each shipment must be unique and it must be
 * in order. The first shipment should have the id as 1001, the next shipment
 * should have the id as 1002 and so on.
 * 
 * 
 * Hint : return Type Declare a method's return type in its method declaration.
 * Within the body of the method, use the return statement to return the value.
 * Any method declared void doesn't return a value. Eg : public static Shipment
 * createNewShipment(){ return returnValue; } 4. Display the shipment details by
 * overriding the toString() method in Shipment class. Use
 * String.format("%-15d%-15s%-25s%-15s%-20s%s",this.id,this.shipperName,
 * this.modeOfTransportation,this.totalWeight.toString()+"Kg",
 * this.arrivalPort,this.departurePort) to format the string.
 * 
 * Hint : toString() The toString() method is used when we need a string
 * representation of an object. It is defined in Object class. This method can
 * be overridden to customize the String representation of the Object. Eg :
 * public String toString() { // return the formatted String. - Override the
 * toString() method here } Create a Main Class and write a main method in it
 * and test the above class.
 * 
 * Problem Specification : The toString() method will overrides the object
 * representation into required format. If we try to print the object, the
 * toString() method will be automatically invoked and the changed
 * representation of the string will be printed as shown in Sample input and
 * Output. Print the "Shipment details are" String and the table header details
 * in main method itself. The toString() method will only contain the format for
 * printing the object.
 * 
 * [Note :Strictly adhere to the object oriented specifications given as a part
 * of the problem statement.Use the same class names, attribute names and method
 * names.]
 * 
 * 
 * 
 * Input and Output Format: Refer sample input and output for formatting
 * specifications.
 * 
 * Sample Input and Output : [All text in bold corresponds to the input and the
 * rest corresponds to output.] Enter the number of shipments : 3 Enter the
 * shipment 1 details Enter the shipper name : AGCI Enter the mode of
 * transportation : Air Enter the total weight : 300 Enter the arrival port :
 * India Enter the departure port : America Enter the shipment 2 details Enter
 * the shipper name : DHL Services Enter the mode of transportation : Water
 * Enter the total weight : 500 Enter the arrival port : Cochin Enter the
 * departure port : Srilanka Enter the shipment 3 details Enter the shipper name
 * : Fedex Enter the mode of transportation : Land Enter the total weight : 200
 * Enter the arrival port : India Enter the departure port : China Shipment
 * details are Id Shippername Mode of transportation Total weight Arrival port
 * Departure port 1001 AGCI Air 300Kg India America 1002 DHL Services Water
 * 500Kg Cochin Srilanka 1003 Fedex Land 200Kg India China
 * 
 */

public class DisplayShipmentDetails {
    public static void main(String args[]) {
        ArrayList<Shipment> sp = new ArrayList<Shipment>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of shipments :");
        String str = sc.nextLine();
        int input = Integer.parseInt(str);

        for (int i = 0; i < input; i++) {
            System.out.println("Enter the shipment " + (i + 1) + " details");

            System.out.println("Enter the shipper name :");
            String shipperName = sc.nextLine();

            System.out.println("Enter the mode of transportation :");
            String modeOfTransportation = sc.nextLine();

            System.out.println("Enter the total weight :");
            String totalwght = sc.nextLine();
            float totalWeight = Float.parseFloat(totalwght);

            System.out.println("Enter the arrival port :");
            String arrivalPort = sc.nextLine();

            System.out.println("Enter the departure port :");
            String departurePort = sc.nextLine();

            sp.add(Shipment.createNewShipment(shipperName, modeOfTransportation, totalWeight, arrivalPort,
                    departurePort));

        }

        System.out.println("Shipment details are");
        System.out.format("%-15s%-15s%-25s%-15s%-20s%s", "Id", "Shippername", "Mode of transportation", "Total weight",
                "Arrival port", "Departure port");

        System.out.println("");

        for (int j = 0; j < sp.size(); j++) {
            System.out.println(sp.get(j).toString());
        }
        sc.close();
    }

}

class Shipment {
    int id;
    String shipperName;
    String modeOfTransportation;
    Float totalWeight;
    String arrivalPort;
    String departurePort;
    static int nextShipmentId = 1000;

    Shipment() {
    }

    public Shipment(int id, String shipperName, String modeOfTransportation, float totalWeight, String arrivalPort,
            String departurePort) {
        this.id = id;
        this.shipperName = shipperName;
        this.modeOfTransportation = modeOfTransportation;
        this.totalWeight = totalWeight;
        this.arrivalPort = arrivalPort;
        this.departurePort = departurePort;

    }

    public static Shipment createNewShipment(String shipperName, String modeOfTransportation, Float totalWeight,
            String arrivalPort, String departurePort) {
        nextShipmentId++;
        int id = nextShipmentId;
        return new Shipment(id, shipperName, modeOfTransportation, totalWeight, arrivalPort, departurePort);

    }

    public int getId() {
        return id;
    }

    public String getShipperName() {
        return shipperName;
    }

    public String getModeOfTransportation() {
        return modeOfTransportation;
    }

    public String getTotalWeight() {
        return (totalWeight % 1.0 != 0) ? String.format("%s", totalWeight) + "Kg"
                : String.format("%.0f", totalWeight) + "Kg";
    }

    public String getArrivalPort() {
        return arrivalPort;
    }

    public String getDeparturePort() {
        return departurePort;
    }

    @Override
    public String toString() {
        return String.format("%-15d%-15s%-25s%-15s%-20s%s", getId(), getShipperName(), getModeOfTransportation(),
                getTotalWeight(), getArrivalPort(), getDeparturePort());
    }
}