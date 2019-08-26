import java.util.*;

/**
 * Mathews works as a Shipping Officer at Febex Logistics. Whenever a shipment
 * order is placed, Mathews has to decide the mode of transportation of the
 * order based on the destination ports. Mathews maintains the details of
 * destination ports in the format
 * portId|portName|railTransportation|roadTransportation|airTransportation.
 * 
 * Suppose there are 'n' destination ports for shipment on a particular day, he
 * collects the details of all the 'n' ports in the above given format. Now he
 * wanted to know, out of these 'n' ports, what are those ports which can handle
 * only one mode of transportation and those which can handle more than one mode
 * of transportation. Write a program to print these details in a specified
 * format.
 * 
 * Note that the three fields
 * railTransportation|roadTransportation|airTransportation are either a '1'
 * (true) if the port is enabled for that mode or '0' (false) if the port is not
 * enabled for that mode.
 * 
 * 
 * 
 * 
 * 
 * Hint : Use System.out.format("%-5s%s\n","Id","Name") for formatting.
 * 
 * Input Format : The first input consists of an integer that corresponds to
 * number of ports 'n'. The next 'n' lines of input contains port details in a
 * single line which is split by pipe( ' | ' ). The format is
 * cityId|cityName|railTransportation|roadTransportation|airTransportation.
 * 
 * Output Format : The output consist two sets: The first set of output prints
 * the Id and Name for those ports which can handle one mode of transportation
 * (i.e. those ports where only one mode of transportation is 1). The second set
 * of output prints the Id and Name for those ports which can handle more than
 * one mode of transportation (i.e. those ports where two or more modes of
 * transportation is 1). If the port can not handle any mode of
 * trasportation,then print "No transportation in any port" . Refer sample input
 * and output for formatting specifications.
 * 
 * Note : [All text in bold corresponds to input and rest corresponds to
 * output.]
 * 
 * Sample Input and Output 1 :
 * 
 * Enter number of ports : 6 Enter port details : 1|Boston|1|0|0 3|Chicago|1|0|1
 * 4|Denver|0|1|1 6|Pittsburg|1|0|1 2|Philadelphia|0|0|1 5|Charleston|0|1|0 One
 * mode of transportation : Id Name 1 Boston 2 Philadelphia 5 Charleston More
 * than one mode of transportation : Id Name 3 Chicago 4 Denver 6 Pittsburg
 * 
 * Sample Input and Output 2: Enter number of ports : 6 Enter port details :
 * 1|Saint Paul|0|1|1 3|Charlotte|1|0|1 4|Las Vegas|0|0|0 6|Toledo|0|0|0
 * 2|Cincinnati|0|0|0 8|Los Angels|1|0|1 One mode of transportation : No such
 * transportation available More than one mode of transportation : Id Name 1
 * Saint Paul 3 Charlotte 8 Los Angels Sample Input and Output 3 :
 * 
 * Enter number of ports : 6 Enter port details : 1|New York|0|1|0
 * 3|Dallas|0|0|1 4|Philadelphia|0|0|0 6|Houston|0|0|1 2|Atlanta|0|0|0
 * 8|Riverside|1|0|0 One mode of transportation : Id Name 1 New York 3 Dallas 6
 * Houston 8 Riverside More than one mode of transportation : No such
 * transportation available
 * 
 * Sample Input and Output 4 :
 * 
 * Enter number of ports : 5 Enter port details : 1|Kansas City|0|0|0
 * 3|Louisville|0|0|0 4|Albuquerque|0|0|0 6|Dayton|0|0|0 2|Akron|0|0|0 One mode
 * of transportation : No such transportation available More than one mode of
 * transportation : No such transportation available
 */

public class Port {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of ports :");
        int input = sc.nextInt();
        String arr[] = new String[input + 1];

        System.out.println("Enter port details :");
        for (int j = 0; j <= input; j++) {
            arr[j] = sc.nextLine();
        }

        String oneTrans[][] = new String[arr.length][2];
        String twoTrans[][] = new String[arr.length][2];
        int count = 0;
        int countTwo = 0;

        for (int i = 0; i < arr.length; i++) {
            String str = arr[i];
            String split[] = str.split("\\|");
            String id = null;
            String name = null;
            int total = 0;

            for (int x = 0; x < split.length; x++) {

                if (x == 0) {
                    id = split[x];
                } else if (x == 1) {
                    name = split[x];
                } else {
                    total += Integer.parseInt(split[x]);
                }

            }
            if (total == 1) {
                oneTrans[count][0] = id;
                oneTrans[count][1] = name;
                count++;
            } else if (total > 1) {
                twoTrans[countTwo][0] = id;
                twoTrans[countTwo][1] = name;
                countTwo++;
            }

        }

        oneTrans = removeNull(oneTrans);
        twoTrans = removeNull(twoTrans);

        System.out.println("One mode of transportation :");
        if (oneTrans.length > 1) {
            System.out.format("%-5s%s\n", "Id", "Name");
            for (int i = 0; i < oneTrans.length; i++) {
                System.out.format("%-5s%s\n", oneTrans[i][0], oneTrans[i][1]);
            }
        } else {
            System.out.println("No such transportation available");
        }

        System.out.println("More than one mode of transportation :");
        if (twoTrans.length > 1) {
            System.out.format("%-5s%s\n", "Id", "Name");
            for (int i = 0; i < twoTrans.length; i++) {
                System.out.format("%-5s%s\n", twoTrans[i][0], twoTrans[i][1]);
            }
        } else {
            System.out.println("No such transportation available");
        }

        sc.close();
    }

    public static String[][] removeNull(String[][] arr2d) {
        ArrayList<ArrayList<String>> list2d = new ArrayList<ArrayList<String>>();
        for (String[] arr1d : arr2d) {
            ArrayList<String> list1d = new ArrayList<String>();
            for (String s : arr1d) {
                if (s != null && s.length() > 0) {
                    list1d.add(s);
                }
            }
            if (list1d.size() > 0) {
                list2d.add(list1d);
            }
        }
        String[][] cleanArr = new String[list2d.size()][];
        int next = 0;
        for (ArrayList<String> list1d : list2d) {
            cleanArr[next++] = list1d.toArray(new String[list1d.size()]);
        }
        return cleanArr;
    }
}