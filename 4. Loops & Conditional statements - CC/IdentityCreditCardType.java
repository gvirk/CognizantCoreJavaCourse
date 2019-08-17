import java.util.Scanner;

/**
 * Peter is a Cloth merchant and he supplies his merchandises to retailers
 * across Cities. His customers pay him through Cash, Cheque and sometimes
 * through Credit/Debit Cards. Peter accepts only cards of the type
 * Master/Visa/AMEX, he rejects any other types of cards. Write a program that
 * will help Peter identify the type of the Credit/Debit card used by his
 * Customers for the payment.
 * 
 * Type of a Card is identified using the below constraints: If the card number
 * starts with 53 then it is "Master card". If the card number starts with 34
 * then it is American Express("AMEX"). If the card number starts with 4 then it
 * is Visa. If the card number starts with any other value other than given
 * above, then Peter considers it "Invalid Card".
 * 
 * 
 * 
 * 
 * 
 * 
 * Problem Specification : The file name should be Main.java.
 * 
 * Input Format : The input consists of a Long value which corresponds to the
 * card number.
 * 
 * Output Format : Display the card name if the card number starts with
 * corresponding number or "Invalid Card" if it doesn't starts with those
 * numbers given. Refer sample input and output for display specifications.
 * 
 * Note : [All text in bold corresponds to input and rest corresponds to output]
 * Sample Input and Output 1: 347884820068392 AMEX
 * 
 * Sample Input and Output 2: 5393208611740252 Master card
 * 
 * Sample Input and Output 3: 24788482006839 Invalid Card
 */

public class IdentityCreditCardType {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        long card = sc.nextLong();
        String input = String.valueOf(card);
        String result = "Invalid Card";

        String initialFirst = Character.toString(input.charAt(0));
        String initialSecond = Character.toString(input.charAt(1));

        if (initialFirst.equals("4")) {
            result = "Visa";
        } else if (initialFirst.equals("5") && initialSecond.equals("3")) {
            result = "Master card";
        } else if (initialFirst.equals("3") && initialSecond.equals("4")) {
            result = "AMEX";
        }

        System.out.println(result);
        sc.close();
    }
}