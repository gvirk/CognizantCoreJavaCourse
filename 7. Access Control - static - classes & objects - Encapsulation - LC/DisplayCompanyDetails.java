import java.util.Scanner;

/**
 * JuzDial is a best known Search services offering Company. It provides
 * reliable and comprehensive information to users and is a leading local search
 * engine. The Company wished to rope in shipping companies across the world to
 * use Juzdial's search services to market their offerings. As a result of which
 * the Company wanted to collect and maintain the details of all the shipping
 * companies. Assume you are given this requirement to be programmed, write a
 * program strictly following all the specifications below:
 * 
 * 
 * This problem will guide you through how to implement a One to One
 * Relationship. Two Classes 'Company' and 'Address' is taken for consideration
 * and the relationship between them is explained as 'One Shipping Company has
 * an Address and One Address belongs to a Company'.
 * 
 * 1. Create a class named Address with the following private member variables.
 * 
 * String state String country Include appropriate getters, setters and
 * constructors. Override the toString() method to display the address details.
 * Use String.format("%-15s %s\n", state,country) to format the String.
 * 
 * 2. Create a class named Company with the following private member variables.
 * 
 * String identifier String iata String fmc Address address Include appropriate
 * getters, setters and constructors. Override the toString() method to display
 * the company details. Use String.format("%-15s %-15s %-15s %s"
 * ,identifier,iata,fmc,address) to format the String.
 * 
 * 3. Create a class named CompanyBO with the following public methods.
 * 
 * S.No Method Name Method Descripton 1 public void
 * displayCompanyDetails(Company[] companies) This method is used to print all
 * the details of the companies outside india. Use System.out.format("%-15s
 * %-15s %-15s %s","Company ID","IATA Code","FMC Code","State","Country") to
 * format the String. If all companies are inside india print "All companies are
 * inside India".
 * 
 * 4. Create a Main Class and write a main method in it and test the above
 * class.
 * 
 * Input and Output Format: Print the "Companies outside India :" String and the
 * table header details in the displayCompanyDetails method itself. If no
 * company is out side india print "All companies are inside India" in the same
 * method. Refer sample input and output for formatting specifications.
 * 
 * [Note :Strictly adhere to the object oriented specifications given as a part
 * of the problem statement.Use the same class names, attribute names and method
 * names.]
 * 
 * [All text in bold corresponds to input and the rest corresponds to output]
 * Sample Input and Output 1: Enter the number of companies : 4 Enter the
 * company 1 details : Enter company id : 001 Enter the company's IATA code :
 * MHTR024 Enter the company's FMC code : DYH/OHX/23 Enter the company's state :
 * Tamilnadu Enter the company's country : India Enter the company 2 details :
 * Enter company id : 002 Enter the company's IATA code : TDKX238 Enter the
 * company's FMC code : DFX/LYS/85 Enter the company's state : Hariyana Enter
 * the company's country : india Enter the company 3 details : Enter company id
 * : 003 Enter the company's IATA code : TESH584 Enter the company's FMC code :
 * GDJ/LSH/86 Enter the company's state : Texas Enter the company's country :
 * USA Enter the company 4 details : Enter company id : 004 Enter the company's
 * IATA code : IRSH432 Enter the company's FMC code : TDF/LSH/91 Enter the
 * company's state : Dubai Enter the company's country : UAE Companies outside
 * India : Company ID IATA Code FMC Code State Country 003 TESH584 GDJ/LSH/86
 * Texas USA 004 IRSH432 TDF/LSH/91 Dubai UAE
 * 
 * Sample Input and Output 2:
 * 
 * Enter the number of companies : 2 Enter the company 1 details : Enter company
 * id : 101 Enter the company's IATA code : KMR012 Enter the company's FMC code
 * : HTC/LJD/45 Enter the company's state : Kerela Enter the company's country :
 * India Enter the company 2 details : Enter company id : 102 Enter the
 * company's IATA code : PUN569 Enter the company's FMC code : JDF/LTG/59 Enter
 * the company's state : Punjab Enter the company's country : India All
 * companies are inside India
 */

public class DisplayCompanyDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of companies :");
        String str = sc.nextLine();
        int input = Integer.parseInt(str);

        Company company[] = new Company[input];
        CompanyBO companyBPO = new CompanyBO();

        for (int i = 0; i < input; i++) {
            System.out.println("Enter the company " + (i + 1) + " details :");
            System.out.println("Enter company id :");
            String id = sc.nextLine();

            System.out.println("Enter the company's IATA code :");
            String iata = sc.nextLine();

            System.out.println("Enter the company's FMC code :");
            String fmc = sc.nextLine();

            System.out.println("Enter the company's state :");
            String state = sc.nextLine();

            System.out.println("Enter the company's country :");
            String country = sc.nextLine();

            company[i] = new Company(id, iata, fmc, state, country);
        }

        companyBPO.displayCompanyDetails(company);
        sc.close();
    }
}

class Address {
    private String state;
    private String country;

    public Address(String state, String country) {
        this.state = state;
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return String.format("%-15s %s\n", state, country);
    }
}

class Company {
    private String identifier;
    private String iata;
    private String fmc;
    private Address address;

    public Company(String identifier, String iata, String fmc, String state, String country) {
        this.identifier = identifier;
        this.iata = iata;
        this.fmc = fmc;
        this.address = new Address(state, country);
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getIata() {
        return iata;
    }

    public String getFmc() {
        return fmc;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return String.format("%-15s %-15s %-15s %s", getIdentifier(), getIata(), getFmc(), getAddress().toString());
    }
}

class CompanyBO {
    public void displayCompanyDetails(Company[] companies) {
        int count = 0;

        for (int i = 0; i < companies.length; i++) {
            if (!companies[i].getAddress().getCountry().equals("India")) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("Companies outside India :");
            System.out.format("%-15s %-15s %-15s %-15s %s", "Company ID", "IATA Code", "FMC Code", "State", "Country");
            System.out.println("");
            for (int i = 0; i < companies.length; i++) {
                if (!companies[i].getAddress().getCountry().equalsIgnoreCase("india")) {
                    System.out.print(companies[i].toString());
                }
            }
        } else {
            System.out.println("All companies are inside India");
        }
    }
}