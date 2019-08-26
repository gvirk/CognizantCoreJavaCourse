
import java.io.*;
import java.text.DecimalFormat;

/**
 * Anjali is so glad as its her nephew Anirudh's first birthday. She wished to
 * send a very special birthday gift to her lilttle nephew from Canada to
 * Singapore. She came to know the fact that a shipment can be dispatched by
 * Agents and Companies on behalf of Customers. But she wanted to know the best
 * means of shipping to send her birthday gift and needs your help on the same.
 * Total shipment cost when shipped through Companies is the sum of base price,
 * luxury tax and corporate tax, whereas when shipped through Agents it is the
 * sum of base price and the agent's referal fee. Write a program to guide
 * Anjali to choose the best means of shipment.
 * 
 * 
 * This problem uses the concept of Method Overriding through Hierarchical
 * Inheritance. In this type of inheritance multiple classes inherits from a
 * single class the two classes “Agent” and “Company” is inherited from
 * “Shipment” class. If the two subclasses provides the specific implementation
 * of the method that has been already provided by one of its parent class, it
 * is known as method overriding.
 * 
 * 
 * Create a class named Shipment class with the following protected member
 * variables / attributes
 * 
 * 
 * String name String source String destination Double price Include appropriate
 * getters and setters. Include 4 argument constructor with argument order
 * Shipment(String name, String source, String destination, double price). And
 * this class includes the following method No Method Name Description 1 double
 * calculateShipmentAmount() This is the super class method, which is overrided
 * by the sub-classes.
 * 
 * Use this format for output. System.out.format("%-15s %-15s %-15s
 * %s","Name","Source","Destination","Total Amount").
 * 
 * Create a AgentShipment class, which extends Shipment class with the following
 * private member variables / attributes Double referalFee Include appropriate
 * getters and setters. Include 5 argument constructor with argument order
 * Agent(String name,String source,String destination,double price,double
 * referalFee). Call the super method inside the constructor with four
 * arguements, which calls the Shipment's constructor.
 * 
 * And this class includes the following method No Method Name Method
 * Description 1 double calculateShipmentAmount() In this method, calculate and
 * return the total amount.
 * 
 * Create a CompanyShipment class,which extends Shipment class with the
 * following private member variables / attributes private Double luxuryTax
 * private Double corporateTax Include appropriate getters and setters. Include
 * 6 argument constructor with argument order Company(String name,String
 * source,String destination,double price,double luxuryTax,double corporateTax).
 * Call the super method inside the constructor with four arguements, which
 * calls the Shipment's constructor. And this class includes the following
 * method No Method Name Method Description 1 double calculateShipmentAmount()
 * In this method, calculate and return the total amount.
 * 
 * Create a Main class to test the above 3 classes. Invoke the
 * calculateShipmentAmount methods in the CompanyShipment and AgentShipment
 * class for calculate the total shipment amount and return that calculated
 * amount like sample output.
 * 
 * Problem Specification : Calculate the total amount using method overriding.
 * In AgentShipment class the shipment price will be added to referal fee. In
 * CompanyShipment class, need some calculation to compute the total amount. The
 * luxury tax and corporate tax are in percentage(%).
 * 
 * Input and Output Format: Print the total amount by two decimal places. Refer
 * sample input and output for formatting specifications.
 * 
 * [Note :Strictly adhere to the object oriented specifications given as a part
 * of the problem statement.Use the same class names, attribute names and method
 * names.] [All text in bold corresponds to input and the rest corresponds to
 * output.]
 * 
 * Sample Input and Output 1:
 * 
 * Enter the shipment name : NYK Line Enter the source : Perth Enter the
 * destination : Gold Coast Enter the price : 1800 1. Agent 2. Company Enter
 * your choice : 1 Enter the referal fee : 350.50 Agent details : Name Source
 * Destination Total Amount NYK Line Perth Gold Coast 2150.50
 * 
 * Sample Input and Output 2:
 * 
 * Enter the shipment name : Wan Hai Lines Enter the source : Ballarat Enter the
 * destination : Albany Enter the price : 2000 1. Agent 2. Company Enter your
 * choice : 2 Enter the luxury tax and corporate tax: 15 12.75 Company details :
 * Name Source Destination Total Amount Wan Hai Lines Ballarat Albany 2555.00
 */

public class CalculateAmount {

    public static void main(String[] args) throws Exception {
        String name, source, destination;
        double price;
        int choice;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the shipment name :");
        name = br.readLine();
        System.out.println("Enter the source :");
        source = br.readLine();
        System.out.println("Enter the destination :");
        destination = br.readLine();
        System.out.println("Enter the price :");
        price = Double.parseDouble(br.readLine());
        System.out.println("1. Agent\n2. Company\nEnter your choice :");
        choice = Integer.parseInt(br.readLine());
        DecimalFormat df = new DecimalFormat("#.00");

        if (choice == 1) {
            double referalFee;
            System.out.println("Enter the referal fee :");
            referalFee = Double.parseDouble(br.readLine());
            System.out.println("Agent details :");
            AgentShipment agent = new AgentShipment(name, source, destination, price);
            agent.setReferalFee(referalFee);
            System.out.format("%-15s %-15s %-15s %s\n", "Name", "Source", "Destination", "Total Amount");
            agent.setReferalFee(referalFee);
            System.out.format("%-15s %-15s %-15s %s\n", agent.getName(), agent.getSource(), agent.getDestination(),
                    df.format(agent.calculateShipmentAmount()));

        } else if (choice == 2) {
            double luxuryTax, corporateTax;
            System.out.println("Enter the luxury tax and corporate tax:");
            luxuryTax = Double.parseDouble(br.readLine());
            corporateTax = Double.parseDouble(br.readLine());
            System.out.println("Company details :");
            CompanyShipment companyShipment = new CompanyShipment(name, source, destination, price);
            companyShipment.setLuxuryTax(luxuryTax);
            companyShipment.setCorporateTax(corporateTax);
            System.out.format("%-15s %-15s %-15s %s\n", "Name", "Source", "Destination", "Total Amount");
            System.out.format("%-15s %-15s %-15s %s\n", companyShipment.getName(), companyShipment.getSource(),
                    companyShipment.getDestination(), df.format(companyShipment.calculateShipmentAmount()));
        }
    }

}

class Shipment {
    protected String name;
    protected String source;
    protected String destination;
    protected double price;

    public Shipment(String name, String source, String destination, double price) {
        this.name = name;
        this.source = source;
        this.destination = destination;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double calculateShipmentAmount() {
        return Double.NaN;
    }

}

class CompanyShipment extends Shipment {
    private Double luxuryTax;
    private Double price;
    private Double corporateTax;

    public CompanyShipment(String name, String source, String destination, double price) {
        super(name, source, destination, price);
        this.price = price;
    }

    public double getLuxuryTax() {
        return luxuryTax;
    }

    public double getPrice() {
        return price;
    }

    public void setLuxuryTax(double luxuryTax) {
        this.luxuryTax = luxuryTax;
    }

    public Double getCorporateTax() {
        return corporateTax;
    }

    public void setCorporateTax(double corporateTax) {
        this.corporateTax = corporateTax;
    }

    @Override
    public double calculateShipmentAmount() {
        double luxuryTax = getPrice() * (getLuxuryTax() / 100);
        double corporateTax = getPrice() * (getCorporateTax() / 100);
        return getPrice() + luxuryTax + corporateTax;
    }

}

class AgentShipment extends Shipment {
    private double referalFee;
    private Double price;

    public AgentShipment(String name, String source, String destination, double price) {
        super(name, source, destination, price);
        this.price = price;
    }

    public double getReferalFee() {
        return referalFee;
    }

    public double getPrice() {
        return price;
    }

    public void setReferalFee(double referalFee) {
        this.referalFee = referalFee;
    }

    @Override
    public double calculateShipmentAmount() {
        return getPrice() + getReferalFee();

    }

}