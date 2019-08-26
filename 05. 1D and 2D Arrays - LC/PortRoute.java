import java.util.Scanner;

/**
 * Daniel is a leading dealer in Automobile parts and he wants to ship few items
 * to his customers at Australia. He approached GreenDart Shipping Company for
 * shipping his items. The Items are to be shipped via multiple ports to reach
 * the destination and being an analytical guy he wanted to know if there is a
 * direct route between two ports in the transit or not. To analyse clearly he
 * prepared a matrix of ports where 1 denotes that a direct route exists and a 0
 * denotes no direct route.
 * 
 * 
 * 
 * Example : Consider a 3*3 Matrix of Ports:
 *
port1	port2	port3
port1	1	1	0
port2	1	1	0
port3	0	0	1
 * 
 * 1 denotes there is a
 * route between ports and 0 denotes there is no route. Here, Port1 to Port 2 -
 * Route exists Port 1 to Port 3 - Route does not exist Port 2 to Port 3 - Route
 * does not exist
 * 
 * Given the number of ports and the port matrix(of 0's and 1's), write a
 * program to find whether there is a direct route between the two ports or not.
 * 
 * Input Format: First line corresponds to n, the number of ports. Next n lines
 * represent elements of the port matrix. The last 2 integers represent two port
 * numbers for which you need to find whether there is a direct route or not.
 * 
 * Problem Specification : Use Scanner class to read the input.
 * 
 * Output Format: Output can be to strings “There is a route” if the route or
 * “There is no route”
 * 
 * [All text in bold corresponds to input and rest corresponds to output.]
 * Sample Input and Output 1: 2 1 1 1 1 Enter two port numbers A and B : 1 2
 * There is a route
 * 
 * Sample Input and Output 2: 2 1 0 0 1 Enter two port numbers A and B : 1 2
 * There is no route
 */

public class PortRoute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        String arr[] = new String[input];

        int count = 0;
        while (count < input) {
            String str = sc.nextLine();
            if (!str.trim().isEmpty()) {
                arr[count] = str;
                count++;
            }
        }

        System.out.println("Enter two port numbers A and B :");
        int x = sc.nextInt();
        int y = sc.nextInt();
        x -= 1;
        y -= 1;

        String result = "There is no route";
        if (y < arr.length) {
            String firstInnerArr[] = arr[x].split("\\s+");
            String secondInnerArr[] = arr[y].split("\\s+");
            if (firstInnerArr[x].equals(secondInnerArr[x]) && firstInnerArr[y].equals(secondInnerArr[y])) {
                result = "There is a route";
            }
        }
        System.out.println(result);
        sc.close();
    }
}