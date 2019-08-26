import java.util.ArrayList;
import java.util.Scanner;

/**
 * TransGlobal Corporation is a shipping company and a leading logistics
 * marketplace changing the way of doing interstate and international movement
 * of goods. The Company had huge shipment orders booked that day and so the
 * employees were bustling with activities. They wanted to collect the details
 * of the destination ports of each shipment and felt an automated code would
 * ease their process which should execute like 'if the port is located in a
 * different country ask for the country name or if it is located in the same
 * country the country name will be India'. Help them by writing a program to
 * get the port details from the user and display it.
 * 
 * This problem will help you understand about Constructor Overloading. It is a
 * technique in Java in which a class can have any number of constructors that
 * differ in parameter lists.The compiler differentiates these constructors by
 * taking into account the number of parameters in the list and their type.
 * 
 * 1. Create a class named Port with the following private member variables /
 * attributes.
 * 
 * Integer id String name String country Include the getters, setters and
 * following constructors public Port(id,name). public Port(id,name,country).
 * 
 * Display the Port details by overriding the toString() method in Port class.
 * 
 * Use System.out.format("%-15s %-15s %-15s",id,name,country) to format the
 * string. 2. Create a Main Class and write a main method in it and test the
 * above class.
 * 
 * [Note :Strictly adhere to the object oriented specifications given as a part
 * of the problem statement.Use the same class names, attribute names and method
 * names.]
 * 
 * Input and Output Format : Print the String "The port details are" and the
 * table header details in main method itself. The toString() method will only
 * contains the format for printing the object. Refer Sample Input and Output
 * for formatting Specifications.
 * 
 * Note : [All text in bold corresponds to input and rest corresponds to
 * output.] Sample Input and Output : Enter the number of ports 2 Enter the
 * port1 details 112 Sydney Port Is the port from same country[Y/N] N Enter the
 * country Australia Enter the port2 details 123 Kandla Port Is the port from
 * same country[Y/N] Y The port details are Id Name Country 112 Sydney Port
 * Australia 123 Kandla Port India
 */

public class DisplayPortDetails {
    public static void main(String[] args) {
        ArrayList<Port> prt = new ArrayList<Port>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of ports");
        String str = sc.nextLine();
        int input = Integer.parseInt(str);

        for (int i = 0; i < input; i++) {
            System.out.println("Enter the port" + (i + 1) + " details");
            String id = sc.nextLine();
            int portID = Integer.parseInt(id);

            String name = sc.nextLine();

            System.out.println("Is the port from same country[Y/N]");
            String isSameCountry = sc.nextLine();

            if (isSameCountry.equals("N")) {
                System.out.println("Enter the country");
                String country = sc.nextLine();

                prt.add(new Port(portID, name, country));
            } else {
                prt.add(new Port(portID, name));
            }

        }
        System.out.println("The port details are");
        System.out.format("%-15s %-15s %-15s", "Id", "Name", "Country");
        System.out.println("");
        for (int j = 0; j < prt.size(); j++) {
            System.out.println(prt.get(j).toString());
        }

        sc.close();
    }

}

class Port {
    private int id;
    private String name;
    private String country;

    public Port(int id, String name) {
        this.id = id;
        this.name = name;
        this.country = "India";
    }

    public Port(int id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return String.format("%-15s %-15s %-15s", getId(), getName(), getCountry());
    }
}