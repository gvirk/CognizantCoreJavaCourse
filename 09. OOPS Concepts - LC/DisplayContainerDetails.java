import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * TheKarriers is a start-up in the logistics marketplace in the City. They are
 * evolving to integrate the logistics network to provide transparent prices,
 * extensive pincode coverage and powerful technology to track and manage
 * shipments. The Company wished to expand its service boundary and decided to
 * deploy Containers for their freight transport which would help them shorten
 * shipping time and reduces losses from damage and theft. Containers were
 * purchased immediately and ready for use while the Company wanted its Shipping
 * Management System to be improved a bit more to manage, track and maintain the
 * Container related information as well.
 * 
 * H elp the Company write a block of code to implement Single Inheritance and
 * get the Container related information and display it in the specified format.
 * Container must have the properties of the Cargo class. Therefore, Container
 * inherits the Cargo Class and its a single Inheritance.
 * 
 * Create a class named Cargo with the following protected member variables.
 * 
 * Float length Float width Float height Double weight
 * 
 * Include appropriate getters, setters and constructors. Use default
 * constructor. Use getter to get the values and setter to set the values.
 * 
 * Create a class named Container that extends Cargo with the following private
 * member variables. String containerNumber In container class create the
 * following public methods. S.No Method Name Method Descripton 1 public void
 * displayContainerDetails() This method is used to display the container
 * details. Create another class Main and write a main method to test the above
 * classes. Print this format in display method System.out.format("%-20s %-15s
 * %-15s %-15s %s\n", "Container Number", "Length", "Width", "Height", "Weight")
 * 
 * Problem requirements : Create container object and set all the values using
 * getters and setters.
 * 
 * Input and Output Format: The first input is an integer 'n' that corresponds
 * to the number of containers. The next 'n' inputs are strings. Each string
 * consists of five comma separated values in the order container number,length,
 * width, height and weight. Refer sample input and output for formatting
 * specifications.
 * 
 * [Note : Strictly adhere to the object oriented specifications given as a part
 * of the problem statement. Use the same class names and member variable names.
 * Follow the naming conventions mentioned for getters / setters. Create
 * separate classes in separate files.]
 * 
 * Sample Input and Output: [All text in bold corresponds to input and the rest
 * corresponds to output. ] Enter the number of containers : 2 Enter the
 * container 1 details : FRT/LKJ/025,30,70,40,10000 Enter the container 2
 * details : JHG/JTR/354,40,80,30,8000 Container details are Container Number
 * Length Width Height Weight FRT/LKJ/025 30.0 70.0 40.0 10000.0 JHG/JTR/354
 * 40.0 80.0 30.0 8000.0
 * 
 */

public class DisplayContainerDetails {
    public static void main(String[] args) throws IOException {
        Container cnt = new Container();
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of containers :");
        int n = Integer.parseInt(buff.readLine());

        Container[] container = new Container[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the container " + (i + 1) + " details :");
            Container cn = new Container();
            String input = buff.readLine();
            String arr[] = input.split("\\,");

            String containerNumber = arr[0];
            float length = Float.parseFloat(arr[1]);
            float width = Float.parseFloat(arr[2]);
            float height = Float.parseFloat(arr[3]);
            double weight = Double.parseDouble(arr[4]);

            cn.setContainerNumber(containerNumber);
            cn.setLength(length);
            cn.setWeight(weight);
            cn.setWidth(width);
            cn.setHeight(height);

            container[i] = cn;
        }
        System.out.format("Container details are\n%-20s %-15s %-15s %-15s %s\n", "Container Number", "Length", "Width",
                "Height", "Weight");
        cnt.displayContainerDetails(container);
    }
}

class Cargo {
    protected Float length;
    protected Float width;
    protected Float height;
    protected Double weight;

    Cargo() {
    }

    public Cargo(Float length, Float width, Float height, Double weight) {
        this.length = length;
        this.height = height;
        this.width = width;
        this.weight = weight;
    }

    public Float getLength() {
        return length;
    }

    public void setLength(Float length) {
        this.length = length;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

}

class Container extends Cargo {
    private String containerNumber;

    Container() {
    }

    public Container(String containerNumber) {
        this.containerNumber = containerNumber;
    }

    public String getContainerNumber() {
        return containerNumber;
    }

    public void setContainerNumber(String containerNumber) {
        this.containerNumber = containerNumber;
    }

    public void displayContainerDetails(Container container[]) {
        for (int i = 0; i < container.length; i++) {
            System.out.format("%-20s %-15s %-15s %-15s %s\n", container[i].getContainerNumber(),
                    container[i].getLength(), container[i].getWidth(), container[i].getHeight(),
                    container[i].getWeight());
        }
    }
}