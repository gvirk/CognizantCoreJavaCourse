import java.util.ArrayList;
import java.util.Scanner;

/**
 * TransGlobal Shipping Company is a big name in the Logistics marketplace, with
 * their global presence in over 10 countries. Having a widespread influence,
 * the Company has huge connects with many Agents and Carriers for a customer –
 * centric delivery.
 * 
 * A Shipment Entity can be handled by Customer himself, Agents, Carriers or the
 * Company. At TransGlobal, there is enourmous shipment data flowing across and
 * therefore they need an efficient system to handle them. Write a program that
 * will retrieve the details of the Shipment Entity based on 4 types of people
 * who handle it namely, Customer, Agent, Carrier and Company. Get all the
 * details related to the Shipment Entity as input from the user.
 * 
 * This problem uses the concept of Hierarchical Inheritance. ShipmentEntitty
 * Class is the parent class and 4 classes Customer, Agent, Carrier and Company
 * extends it.
 * 
 * [Note : Strictly adhere to the object oriented specifications given as a part
 * of the problem statement. Use the same class names and member variable names.
 * Create separate classes in separate files.]
 * 
 * 
 * 1.Create a class named ShipmentEntity Include the following protected data
 * members / attributes:
 * 
 * String shipmentEntityName String identificationNumber Include appropriate
 * getters and setters and constructor Constructor : ShipmentEntity(String
 * shipmentEntityName,String identificationNumber). Include the methods void
 * display() which will be implemented by all its sub classes.
 * 
 * 2.Create a class named Customer that extends ShipmentEntity Include the
 * following private data members / attributes:
 * 
 * Integer id String name Include appropriate getters and setters and
 * constructor. Constructor : Customer(String shipmentEntityName,String
 * identificationNumber,Integer id,String name) Include the following methods :
 * 
 * S.NO Method Name Method Description 1 void display() display the customer
 * details Use System.out.format("%-15s %-25s %-15s
 * %-15s\n","Name","Identification Number","Customer Id","Customer Name") in
 * display method.
 * 
 * 3.Create a class named Company that extends ShipmentEntity Include the
 * following private data members / attributes:
 * 
 * String identifier String iata String fmc Include appropriate getters and
 * setters and constructor. Constructor : Company(String name,String
 * identificationNumber,String identifier,String iata,String fmc). Include the
 * following methods :
 * 
 * 
 * S.NO Method Name Description 1 void display() display the company details Use
 * System.out.format("%-15s %-25s %-15s %-15s %-15s\n","Name","Identification
 * Number","Company Name","IATA","FMC") in display method.
 * 
 * 4.Create a class named Agent that extends ShipmentEntity Include the
 * following private data members / attributes:
 * 
 * String name String iata String fmc; Include appropriate getters and setters
 * and constructor. Constructor as follows Agent(String
 * shipmentEntityName,String identificationNumber,String name,String iata,String
 * fmc) Include the following methods :
 * 
 * S.NO Method Name Description 1 void display() display the agent details Use
 * System.out.format("%-15s %-25s %-15s %-15s %-15s\n","Name","Identification
 * Number ","Agent Name","IATA","FMC");
 * 
 * 5.Create a class named Carrier that extends ShipmentEntity Include the
 * following private data members / attributes:
 * 
 * String carrierCode String iata Include the following methods : Include
 * appropriate getters and setters and constructor. Constuctor : Carrier(String
 * name,String identificationNumber,String carrierCode,String iata).
 * 
 * 
 * S.NO Method Name Description 1 void display() display the carrier details Use
 * System.out.format("%-15s %-25s %-15s %-15s\n","Name","Identification
 * Number","Code Name","IATA");
 * 
 * 
 * Input and Output Format: Refer sample input and output for formatting
 * specifications. Note : [All text in bold corresponds to input and the rest
 * corresponds to output.]
 * 
 * Sample Input and Output: Enter the number of shipment entity 3 Enter the
 * shipment entity 1 details : Select the shipment entity type 1)Customer
 * 2)Company 3)Agent 4)Carrier 1 Laptop,800101,111,Rahul Enter the shipment
 * entity 2 details : Select the shipment entity type 1)Customer 2)Company
 * 3)Agent 4)Carrier 1 Micro phone,801102,211,Mitharan Enter the shipment entity
 * 3 details : Select the shipment entity type 1)Customer 2)Company 3)Agent
 * 4)Carrier 3 Electric Fan,912115,Rahul,USCTG1230,PMI/SJC/1361 Shipment details
 * are Enter the shipment entity type to display Customer Name Identification
 * Number Customer Id Customer Name Laptop 800101 111 Rahul Micro phone 801102
 * 211 Mitharan
 */


public class ShipmentEntityMain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Customer cstr = new Customer();
        Company cp = new Company();
        Agent ag = new Agent();
        Carrier cr = new Carrier();

        System.out.println("Enter the number of shipment entity");
        int input = Integer.parseInt(sc.nextLine());
        ArrayList<Customer> cst = new ArrayList<>();
        ArrayList<Company> cmp = new ArrayList<Company>();
        ArrayList<Agent> agt = new ArrayList<>();
        ArrayList<Carrier> crr = new ArrayList<>();

        for (int i = 0; i < input; i++) {
            System.out.println("Enter the shipment entity " + (i + 1) + " details :");
            System.out.println("Select the shipment entity type");
            System.out.println("1)Customer\n2)Company\n3)Agent\n4)Carrier");
            int option = Integer.parseInt(sc.nextLine());
            if (option == 1) {
                String val = sc.nextLine();
                String arr[] = val.split("\\,");

                String shipmentEntityName = arr[0];
                String identificationNumber = arr[1];
                int id = Integer.parseInt(arr[2]);
                String name = arr[3];

                Customer customer = new Customer(shipmentEntityName, identificationNumber);
                customer.setId(id);
                customer.setName(name);
                cst.add(customer);
            } else if (option == 2) {
                String val = sc.nextLine();
                String arr[] = val.split("\\,");
                String shipmentEntityName = arr[0];
                String identificationNumber = arr[1];
                String name = arr[2];
                String fmc = arr[4];
                String iata = arr[3];

                Company company = new Company(shipmentEntityName, identificationNumber);
                company.setFmc(fmc);
                company.setIata(iata);
                company.setIdentifier(name);
                cmp.add(company);
            } else if (option == 3) {
                String val = sc.nextLine();
                String arr[] = val.split("\\,");

                String agentShipmentEntityName = arr[0];
                String agentIdentificationNumber = arr[1];
                String agentName = arr[2];
                String agentIata = arr[3];
                String agentFmc = arr[4];

                Agent agent = new Agent(agentShipmentEntityName, agentIdentificationNumber);
                agent.setFmc(agentFmc);
                agent.setIata(agentIata);
                agent.setName(agentName);
                agt.add(agent);
            } else {
                String val = sc.nextLine();
                String arr[] = val.split("\\,");

                String shipmentEntityName = arr[0];
                String identificationNumber = arr[1];
                String carrierCode = arr[2];
                String iata = arr[3];

                Carrier carrier = new Carrier(shipmentEntityName, identificationNumber);
                carrier.setCarrierCode(carrierCode);
                carrier.setIata(iata);
                crr.add(carrier);
            }
        }

        System.out.println("Shipment details are");
        System.out.println("Enter the shipment entity type to display");
        String userOption = sc.nextLine();

        if (userOption.equalsIgnoreCase("customer")) {
            System.out.format("%-15s %-25s %-15s %-15s\n", "Name", "Identification Number", "Customer Id",
                    "Customer Name");
            cstr.displayArray(cst);
            cstr.display();
        } else if (userOption.equalsIgnoreCase("company")) {
            System.out.format("%-15s %-25s %-15s %-15s %-15s\n", "Name", "Identification Number", "Company Name",
                    "IATA", "FMC");
            cp.displayArray(cmp);
            cp.display();
        } else if (userOption.equalsIgnoreCase("agent")) {
            System.out.format("%-15s %-25s %-15s %-15s %-15s\n", "Name", "Identification Number ", "Agent Name", "IATA",
                    "FMC");
            ag.displayArray(agt);
            ag.display();
        } else {
            System.out.format("%-15s %-25s %-15s %-15s\n", "Name", "Identification Number", "Code Name", "IATA");
            cr.displayArray(crr);
            cr.display();
        }
        sc.close();
    }
}

class Company extends ShipmentEntity {
    private String identifier;
    private String iata;
    private String fmc;
    private ArrayList<Company> company = new ArrayList<Company>();

    public Company() {
    }

    public Company(String shipmentEntityName, String identificationNumber) {
        super(shipmentEntityName, identificationNumber);
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIata(String iata) {
        this.iata = iata;
    }

    public String getIata() {
        return iata;
    }

    public void setFmc(String fmc) {
        this.fmc = fmc;
    }

    public String getFmc() {
        return fmc;
    }

    public void displayArray(ArrayList<Company> company) {
        this.company = company;
    }

    @Override
    public void display() {
        for (int i = 0; i < this.company.size(); i++) {
            System.out.format("%-15s %-25s %-15s %-15s %-15s\n", this.company.get(i).getShipmentEntityName(),
                    this.company.get(i).getIdentificationNumber(), this.company.get(i).getIdentifier(),
                    this.company.get(i).getIata(), this.company.get(i).getFmc());
        }
    }
}

class Agent extends ShipmentEntity {
    String name;
    String iata;
    String fmc;
    private ArrayList<Agent> agent = new ArrayList<Agent>();

    public Agent() {
    }

    public Agent(String shipmentEntityName, String identificationNumber) {
        super(shipmentEntityName, identificationNumber);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setIata(String iata) {
        this.iata = iata;
    }

    public String getIata() {
        return iata;
    }

    public void setFmc(String fmc) {
        this.fmc = fmc;
    }

    public String getFmc() {
        return fmc;
    }

    public void displayArray(ArrayList<Agent> agent) {
        this.agent = agent;
    }

    @Override
    public void display() {
        for (int i = 0; i < this.agent.size(); i++) {
            System.out.format("%-15s %-25s %-15s %-15s %-15s\n", this.agent.get(i).getShipmentEntityName(),
                    this.agent.get(i).getIdentificationNumber(), this.agent.get(i).getName(),
                    this.agent.get(i).getIata(), this.agent.get(i).getFmc());
        }
    }
}

class Customer extends ShipmentEntity {
    private Integer id;
    private String name;
    private ArrayList<Customer> customer = new ArrayList<Customer>();

    public Customer() {
    }

    public Customer(String shipmentEntityName, String identificationNumber) {
        super(shipmentEntityName, identificationNumber);
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void displayArray(ArrayList<Customer> customer) {
        this.customer = customer;
    }

    @Override
    public void display() {
        for (int i = 0; i < customer.size(); i++) {
            System.out.format("%-15s %-25s %-15s %-15s\n", customer.get(i).getShipmentEntityName(),
                    customer.get(i).getIdentificationNumber(), customer.get(i).getId(), customer.get(i).getName());
        }
    }
}

class Carrier extends ShipmentEntity {
    private String carrierCode;
    private String iata;
    private ArrayList<Carrier> carrier = new ArrayList<Carrier>();

    public Carrier() {
    }

    public Carrier(String shipmentEntityName, String identificationNumber) {
        super(shipmentEntityName, identificationNumber);
    }

    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    public String getCarrierCode() {
        return carrierCode;
    }

    public void setIata(String iata) {
        this.iata = iata;
    }

    public String getIata() {
        return iata;
    }

    public void displayArray(ArrayList<Carrier> carrier) {
        this.carrier = carrier;
    }

    @Override
    public void display() {
        for (int i = 0; i < carrier.size(); i++) {
            System.out.format("%-15s %-25s %-15s %-15s\n", carrier.get(i).getShipmentEntityName(),
                    carrier.get(i).getIdentificationNumber(), carrier.get(i).getCarrierCode(),
                    carrier.get(i).getIata());
        }
    }
}

class ShipmentEntity {
    protected String shipmentEntityName;
    protected String identificationNumber;

    public ShipmentEntity() {
    }

    public ShipmentEntity(String shipmentEntityName, String identificationNumber) {
        this.shipmentEntityName = shipmentEntityName;
        this.identificationNumber = identificationNumber;
    }

    public void setShipmentEntityName(String shipmentEntityName) {
        this.shipmentEntityName = shipmentEntityName;
    }

    public String getShipmentEntityName() {
        return shipmentEntityName;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void display() {
    }
}