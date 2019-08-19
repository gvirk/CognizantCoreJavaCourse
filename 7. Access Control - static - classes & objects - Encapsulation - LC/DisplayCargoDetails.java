import java.util.Scanner;

/**
 * SendIt is a start-up Logistics Company that connects Shippers with trusted
 * Carriers aimed at making sending easier than ever. Started by a bunch of
 * enterprising young men, the founders themselves are developing a
 * technologically sound automation engine to support their freight Services. In
 * the course of it, there was a requirement in which a module has to be
 * programmed to collect, maintain and display the details of the Cargoes
 * involved in the shipment process. A Cargo is a large item that is loaded for
 * transportation. Help them write a program to accomplish the task.
 * 
 * The first step is to create a class. A Class is a container to hold data
 * members & member functions, representing a template of real-world entity.
 * Lets create a cargo class.
 * 
 * 
 * Create a class named Cargo with the following private member
 * variables/attributes.
 * 
 * String name String description Double width Double length 1. Provide public
 * setter and getter methods to modify and view the variables values.
 * 
 * Hint : Getter and Setter The public setXXX() and getXXX() methods are the
 * access points of the instance variables of the Cargo class. Normally, these
 * methods are referred as getters and setters. Therefore, any class that wants
 * to access the variables should access them through these getters and setters
 * Eg : public class Cargo { private String name; public String getName() {
 * return name; } public void setName(String name) { this.name = name; } } 2.
 * Include the following method in Cargo Class and do the necessary operations
 * in this method.
 * 
 * S.No Method Name
 * 
 * Method Description
 * 
 * 1 public void displayCargoDetails()
 * 
 * In this method, display the Cargo details Create a Main Class and write a
 * main method in it. In the main method, create Cargo instances / objects. Use
 * the setter methods to set the values in the Cargo object. Display the
 * corresponding object details in the displayCargoDetails() method.
 * 
 * 
 * Hint : Object/Instance Creation Declaring a Variable to Refer to an Object Eg
 * : Cargo cargoObject = new Cargo(); Input and Output Format : Print the String
 * "The cargo details are:" in main method itself. Display only the cargo object
 * details in the corresponding method in Cargo class. Refer sample input and
 * output for formatting specifications.
 * 
 * [Note :Strictly adhere to the object oriented specifications given as a part
 * of the problem statement.Use the same class names, attribute names and method
 * names.]
 * 
 * [All text in bold corresponds to input and the rest corresponds to output.]
 * Sample Input and Output 1: Enter the cargo details: Enter the name Car Enter
 * the description Four wheeler Enter the length 390.5 Enter the width 160.5 The
 * cargo details are: Name : Car Description : Four wheeler Length : 390.5 cm
 * Width : 160.5 cm
 */

public class DisplayCargoDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, desc;
        System.out.println("Enter the cargo details:");

        System.out.println("Enter the name");
        name = sc.nextLine();

        System.out.println("Enter the description");
        desc = sc.nextLine();

        System.out.println("Enter the length");
        String lth = sc.nextLine();
        float length = Float.parseFloat(lth);

        System.out.println("Enter the width");
        String wdth = sc.nextLine();
        float width = Float.parseFloat(wdth);

        System.out.println("The cargo details are:");
        Cargo cg = new Cargo();

        cg.setDesc(desc);
        cg.setName(name);
        cg.setWidth(width);
        cg.setLength(length);

        cg.displayCargoDetails();

        sc.close();

    }
}

class Cargo {
    private String name;
    private String desc;
    private float length;
    private float width;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void displayCargoDetails() {
        System.out.println("Name : " + getName() + "\nDescription : " + getDesc() + "\nLength : " + getLength()
                + " cm\nWidth : " + getWidth() + " cm");
    }

}