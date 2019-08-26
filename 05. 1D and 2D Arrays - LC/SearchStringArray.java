import java.util.Scanner;

/**
 * Carol lives in New York and owns a book store at her home. She ships books to
 * individuals and all small book shops across the world based on a purchase
 * request.
 * 
 * 
 * 
 * She maintains the records of all her Customers manually but she found it
 * difficult to manage and so designed a small automated Invoice system which
 * would ease her job of maintaining the Customer and Order details. One day
 * there was a necessity for her to search a particular Customer name from the
 * list of many Customers, the facility which the System lacked. She started
 * programming the system for this requirement but she got stuck and needed your
 * intervention.
 * 
 * 
 * Help her write a program which will search a specific string from a list of
 * strings.
 * 
 * Input format : First input consists of an Integer 'n' which corresponds to
 * the number of Customers. Next 'n' inputs consists of the names of the
 * Customers. Third input consists of String which corresponds to the specific
 * Customer name which has to be searched.
 * 
 * Output format : Output consists of a message saying "<name> found!" if the
 * given name is found in the list. Otherwise print "<name> not found". The name
 * to be searched is case insensitive. Refer sample input and output for
 * formatting specifications.
 * 
 * [All text in bold corresponds to input and rest corresponds to output] Sample
 * Input and Output 1 : 5 Jim Sam John Andreson Rocky Enter the name you want to
 * search Rocky Rocky found!
 * 
 * Sample input and output 2 : 6 teena caroline derik yathav Antony Rajesh Enter
 * the name you want to search Rocky Rocky not found
 */

public class SearchStringArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        input += 1;
        String nameList[] = new String[input];
        for (int i = 0; i < input; i++) {
            nameList[i] = sc.nextLine();
        }

        System.out.println("Enter the name you want to search");
        String findName = sc.nextLine();
        String result = findName + " not found";

        for (int i = 0; i < nameList.length; i++) {
            if (nameList[i].equalsIgnoreCase(findName)) {
                result = findName + " found!";
            }
        }

        System.out.println(result);
        sc.close();
    }

}