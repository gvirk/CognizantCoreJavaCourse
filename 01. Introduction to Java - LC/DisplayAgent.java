import java.io.*;
import java.text.DecimalFormat;

/**
 * AGCI Corporation has numerous logistics Agents operating around who handle
 * the customer services related to deliveries and scheduling. The Management
 * therefore intended to have all their Agents get connected to the automated
 * System which would ease their tasks of transportation.
 * 
 * 
 * Based on the above requirement, the development team had to write a program
 * that would read all the details related to the Agents and print the same in
 * the desired format. Help the team to code the requirement.
 * 
 * Problem Specification: The Main Class file name should be Main.java. Use
 * BufferedReader class for reading the details from the user.
 * 
 * Hints : java.io.BufferedReader BufferedReader Class is used to read the text
 * from a character-input stream, buffering characters so as to provide for the
 * efficient reading of characters, arrays, and lines. Eg : BufferedReader br =
 * new BufferedReader(new InputStreamReader(System.in)); String name =
 * br.readLine(); Input Format : First input consists of a String that
 * corresponds to the agent name. Second input consists of a String that
 * corresponds to the agent identificationNumber. Third input consists of a
 * String that corresponds to the agent accountNumber. Fourth input consists of
 * a Double that corresponds to the agent's creditLimit.
 * 
 * Output Format : Round the credit limit into two decimal places using
 * DecimalFormat class as shown in the sample input and output. Hints :
 * java.text.DecimalFormat DecimalFormat is a concrete subclass of NumberFormat
 * that formats decimal numbers. A DecimalFormat pattern contains a positive and
 * negative subpattern, for example, "#,##0.00;(#,##0.00)". Each subpattern has
 * a prefix, numeric part, and suffix. The negative subpattern is optional.
 * 
 * The format descriptor string “#,###.00” means that two decimal places will
 * always be shown, even if they are zeros. However, the number 0.79 will
 * display as .79 (no zero in front of the decimal point). A “#” means that the
 * place will not be shown if it is a leading or trailing zero, whereas a “0”
 * means the place will be shown, with a zero if it has no other value.
 * 
 * Eg : DecimalFormat df = new DecimalFormat("#.00"); System.out.println("Credit
 * Limit : "+ df.format(creditLimit));
 * 
 * or
 * 
 * Use System.out.printf("Credit Limit : %.2f\n", creditLimit); Refer Sample
 * Input and Output for displaying User Details
 * 
 * [All text in bold corresponds to input and rest corresponds to output] Sample
 * Input and Output: Enter the agent details Enter the agent name : Jackson
 * Enter the identification number : 1624 Enter the accountNumber :
 * 4501234561012309 Enter the creditLimit : 350000.5678 Agent details are Name :
 * Jackson Identification Number : 1624 Account Number : 4501234561012309 Credit
 * Limit : 350000.57
 */

public class DisplayAgent {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Enter the agent details");

        System.out.println("Enter the agent name :");
        String name = br.readLine();

        System.out.println("Enter the identification number :");
        long idn = Long.parseLong(br.readLine());

        System.out.println("Enter the accountNumber :");
        long accountNumber = Long.parseLong(br.readLine());

        System.out.println("Enter the creditLimit :");
        double cl = Double.parseDouble(br.readLine());

        String creditLimit = df.format(cl);

        System.out.println("Agent details are" + "\nName : " + name + "\nIdentification Number : " + idn
                + "\nAccount Number : " + accountNumber + "\nCredit Limit : " + creditLimit);

    }
}