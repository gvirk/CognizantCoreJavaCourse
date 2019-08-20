import java.io.*;

/**
 * Sathish is an Oil merchant and he sells his pure, hygienically prepared Oil
 * supplies to retailers and dealers across Cities. His customers pay him
 * through Cash, Cheque and sometimes through Credit/Debit Cards. Sathish faced
 * a lot of problem during the payment transactions, especially while processing
 * with Cheques and Credit Cards. This is because that in most of the Cheques or
 * Credit Cards given by his Customers are not valid. So create a program using
 * Classes to help him validate the Cheques and Credit cards.
 * 
 * Credit card is valid if it has starting numbers corresponding to card
 * names(given below) and the card number should have 16 characters. 34 -->
 * American Express 36 --> Diner's Club / International 37 --> American Express
 * 4 --> Visa
 * 
 * Cheque is valid if it starts with 9 digits of anyone below sequence according
 * to bank names. 031176110 --> CapitalOne 021001088 --> HSBC 021000089 --> Citi
 * bank 122101706 --> Bank of America
 * 
 * Create a class named Payment with the following private member variables /
 * attributes String userName Double amount PaymentMode paymentMode 1) Include a
 * 3-argument argument constructor in this class. The arguments passed to the
 * constructor are in this order --- userName,amount,paymentMode. 2) Include
 * appropriate getters and setters.
 * 
 * Create a class named PaymentMode with the following private member variables
 * / attributes Integer id String paymentType 1) Include a 2-argument argument
 * constructor in this class. The arguments passed to the constructor are in
 * this order --- id,paymentType. 2) Include appropriate getters and setters.
 * 
 * Create a class named CreditCard with the following private member variables /
 * attributes String cardNumber String cardName 1) Include a 2-argument argument
 * constructor in this class. The arguments passed to the constructor are in
 * this order --- cardNumber,cardName. 2) Include appropriate getters and
 * setters.
 * 
 * Create a class named Cheque with the following private member variables /
 * attributes String bankName String chequeNumber 1) Include a 2-argument
 * argument constructor in this class. The arguments passed to the constructor
 * are in this order --- bankName,chequeNumber. 2) Include appropriate getters
 * and setters.
 * 
 * Create a class named PaymentBO with the following private member variables /
 * attributes Include two methods. S.No Method Name Method description 1 boolean
 * validateCreditCard(CreditCard creditCard) to check whether the credit card is
 * valid or invalid. 2 boolean validateCheque(Cheque cheque) to check whethe the
 * cheque is valid or invalid. Input and Output Format: Refer sample input and
 * output for formatting specifications. All text in bold corresponds to input
 * and the rest corresponds to output.
 * 
 * [Note :Strictly adhere to the object oriented specifications given as a part
 * of the problem statement.Use the same class names, method names and attribute
 * names.]
 * 
 * Sample Input and Output 1: Enter the payment details : Tom,1000,Credit Enter
 * the credit card details Enter the card number : 3410001234567890 Enter the
 * card name : American Express Valid credit card
 * 
 * Sample Input and Output 2: Enter the payment details : Daniel,1000,Credit
 * Enter the credit card details Enter the card number : 2100877587382 Enter the
 * card name : Diner's Club / International Invalid credit card
 */

public class CreditChequeValidation {

    public static void main(String args[]) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the payment details :");
        String paymentDetails[] = buf.readLine().split(",");
        PaymentBO paymentBo = new PaymentBO();
        Payment payment = new Payment(paymentDetails[0], Double.parseDouble(paymentDetails[1]),
                new PaymentMode(1, paymentDetails[2]));
        if (payment.getPaymentMode().getPaymentType().equals("Credit")) {
            System.out.println("Enter the credit card details");
            System.out.println("Enter the card number :");
            String cardNumber = buf.readLine();
            System.out.println("Enter the card name :");
            String cardName = buf.readLine();
            if (paymentBo.validateCreditCard(new CreditCard(cardNumber, cardName)))
                System.out.println("Valid credit card");
            else
                System.out.println("Invalid credit card");
        } else {
            System.out.println("Enter the cheque details");
            System.out.println("Enter the bank name :");
            String bankName = buf.readLine();
            System.out.println("Enter the cheque number :");
            String chequeNumber = buf.readLine();
            if (paymentBo.validateCheque(new Cheque(bankName, chequeNumber)))
                System.out.println("Valid cheque");
            else
                System.out.println("Invalid cheque");
        }
    }
}

class Payment {

    private String userName;
    private Double amount;
    private PaymentMode paymentMode;

    public Payment(String userName, Double amount, PaymentMode paymentMode) {
        super();
        this.userName = userName;
        this.amount = amount;
        this.paymentMode = paymentMode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }
}

class Cheque {

    private String bankName;
    private String chequeNumber;

    public Cheque(String bankName, String chequeNumber) {
        super();
        this.bankName = bankName;
        this.chequeNumber = chequeNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getChequeNumber() {
        return chequeNumber;
    }

    public void setChequeNumber(String chequeNumber) {
        this.chequeNumber = chequeNumber;
    }
}

class PaymentMode {

    private Integer id;
    private String paymentType;

    public PaymentMode(Integer id, String paymentType) {
        super();
        this.id = id;
        this.paymentType = paymentType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

}

class CreditCard {

    private String cardNumber;
    private String cardName;

    public CreditCard(String cardNumber, String cardName) {
        super();
        this.cardNumber = cardNumber;
        this.cardName = cardName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }
}

class PaymentBO {

    public boolean validateCreditCard(CreditCard creditCard) {
        String length = creditCard.getCardNumber();
        boolean cardResult = false;
        if (length.length() == 16) {
            String cardName = creditCard.getCardName();
            String initialFirst = Character.toString(length.charAt(0));
            String initialSecond = Character.toString(length.charAt(1));
            String result = null;

            if (initialFirst.equals("4")) {
                result = "Visa";
            } else if (initialFirst.equals("3") && initialSecond.equals("6")) {
                result = "Diner's Club / International";
            } else if (initialFirst.equals("3") && initialSecond.equals("4")) {
                result = "American Express";
            } else if (initialFirst.equals("3") && initialSecond.equals("7")) {
                result = "American Express";
            }

            if (cardName.equals(result)) {
                cardResult = true;
            }
        }
        return cardResult;
    }

    public boolean validateCheque(Cheque cheque) {
        String chequeNumber = cheque.getChequeNumber();
        boolean bankResult = false;
        if (chequeNumber.length() >= 9) {
            String bankName = cheque.getBankName();
            String checkNumber = chequeNumber.substring(0, 9);
            if (checkNumber.equals("031176110") && bankName.equalsIgnoreCase("CapitalOne")) {
                bankResult = true;
            } else if (checkNumber.equals("021001088") && bankName.equalsIgnoreCase("HSBC")) {
                bankResult = true;
            } else if (checkNumber.equals("021000089") && bankName.equalsIgnoreCase("Citi bank")) {
                bankResult = true;
            } else if (checkNumber.equals("122101706") && bankName.equalsIgnoreCase("Bank of America")) {
                bankResult = true;
            }
        }
        return bankResult;
    }
}
