import java.util.Scanner;

/**
 * There are many Shipping companies emerging in the market now. 'SaySo' online
 * survey panel has come up with the strategy to choose the best Shipping
 * Company for your shipping needs. The survey panel has taken into
 * consideration two factors of the companies namely the number of countries a
 * shipping Company offers its services (country coverage) and number of
 * shipments done per month. The survey panel has graded the companies based on
 * the two factors as given below:
 * 
 * 
| Grade             | Countries    | Shipment per month |
|-------------------|--------------|--------------------|
| A                 | Above 150    | Above 1500         | 
| B                 | Above 125    | Above 1200         |
| C                 | Above 100    | Above 1000         | 
| D                 | Above 75     | Above 700          | 
| E                 | <=75 and >=0 | <=700 and >=0      | 
| invalid Input     | <0           | <0                 | 
 * 
 * Problem Specfication : The file name should be Main.java.
 * 
 * Input Format : The first input consists of an integer that corresponds to the
 * number of countries the company offer its services. The second input consists
 * of an integer that corresponds to the number of shipments per month.
 * 
 * Output Format : The output should display the Grade of company. Print
 * 'Invalid Input' otherwise. Refer sample input and output for formatting
 * specifications.
 * 
 * [All text in bold corresponds to input and rest corresponds to output.]
 * Sample Input and Output 1: Enter the total number of countries : 150 Enter
 * the total number of shipment per month : 1550 The company grade is : B
 * 
 * Sample Input and Output 2: Enter the total number of countries : -12 Enter
 * the total number of shipment per month : 450 Invalid Input
 */

public class EvaluateGradeforShippingCompany {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of countries :");
        int c = sc.nextInt();

        System.out.println("Enter the total number of shipment per month :");
        int s = sc.nextInt();

        String result = "Invalid Input";
        String grade = "E";
        if (c >= 0 && s >= 0) {
            result = "The company grade is : ";

            if (c > 150 && s > 1500) {
                grade = "A";
            } else if ((c > 125) && (s > 1200)) {
                grade = "B";
            } else if ((c > 100) && (s > 1000)) {
                grade = "C";
            } else if ((c > 75) && (s > 700)) {
                grade = "D";
            }

            result += grade;

        }
        System.out.println(result);

        sc.close();
    }
}