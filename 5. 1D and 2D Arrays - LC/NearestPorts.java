import java.util.Scanner;

/**
 * Maxwell is a Shipping Agent at Febex Shipping Corporation. There are 'n'
 * shipping ports at New York and he wanted to know which are the nearest ports
 * and farthest ports. As a shipping agent he need to know this information as
 * he is a person who deals with the transactions of a ship in every port that
 * the ship visits or docks.
 * 
 * To find the distance between the ports, he considered an nxn matrix where a
 * non-zero matrix element indicates the distance between 'two ports' and 0
 * indicates there is 'no path' between the ports.
 * 
 * Write a program to find the ports which are closer to each other, i.e., which
 * are the nearest ports to port 1, port 2, port 3, etc.,
 * 
 * Example:
 * 
 * Consider a 4*4 matrix of Ports and each element denotes the distance of a
 * port respective to another port.
 * 
 * port1 port2 port3 port4 port1 0 0 0 0 port2 0 0 1 2 port3 0 1 0 7 port4 0 2 7
 * 0
 * 
 * 
 * Constraints: 1) Distance between same ports are always zero. 2) If distance
 * between two different ports are zero, then there is no path between the two
 * ports. 3) If two ports are at same distance then display the first port.
 * 
 * Hint: Use Scanner class to read the inputs.
 * 
 * 
 * Input Format: The first input consists of a integer 'n' corresponding to the
 * number of ports. The next input is the matrix containing the distances of
 * ports from each other. Output Format: Refer sample input and output for
 * formatting specifications.
 * 
 * [All text in bold corresponds to input and rest corresponds to output].
 * Sample Input and Output: Enter the number of ports : 4 Enter the distance
 * between all ports : 0 0 0 0 0 0 1 2 0 1 0 7 0 2 7 0 No ports are closer to
 * port 1 Port 2 is closer to port 3 Port 3 is closer to port 2 Port 4 is closer
 * to port 2
 */

public class NearestPorts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of ports :");
        int input = sc.nextInt();
        String arr[] = new String[input];

        System.out.println("Enter the distance between all ports :");
        int count = 0;
        while (count < input) {
            String str = sc.nextLine();
            if (!str.trim().isEmpty()) {
                arr[count] = str;
                count++;
            }
        }
        int lastVal = 0;
        String result = null;
        for (int i = 0; i < arr.length; i++) {
            String innerArray[] = arr[i].split("\\s+");
            int counter = 0;
            for (int j = 0; j < innerArray.length; j++) {
                if (!innerArray[j].equals("0")) {
                    if (counter == 0) {
                        result = "Port " + (i + 1) + " is closer to port " + (j + 1);
                        lastVal = Integer.parseInt(innerArray[j]);
                        counter++;
                    } else if (lastVal > Integer.parseInt(innerArray[j])) {
                        result = "Port " + (i + 1) + " is closer to port " + (j + 1);
                        lastVal = Integer.parseInt(innerArray[j]);
                    }
                }

            }
            if (counter == 0) {
                result = "No ports are closer to port " + (i + 1);
                counter++;
            }
            System.out.println(result);
        }

        sc.close();
    }
}