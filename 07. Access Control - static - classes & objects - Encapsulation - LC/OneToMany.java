import java.util.*;

/**
 * The Management of GreenDart Shipping Company wanted to design a module in the
 * shipment application, that finds the role names that have the maximum number
 * of privileges. Help them write a program that will get the role details such
 * as role name, description and the privileges under that role, from the user
 * and display the role names that have the maximum privileges.
 * 
 * Problem Specifications:
 * 
 * Create a class named Role with the following private member variables /
 * attributes String name String description Privilege[] privilege Include
 * appropriate getters and setters. Include 3 argument constructor with argument
 * order Role(String name, String description, Privilege[] privilege)
 * 
 * Create a RoleBO class, and include the following methods No Method Name
 * Method Description 1 void display(Role[] role) In this method, displays the
 * role name which are having maximum number of privilege.
 * 
 * Create another class named Privilege with the following private member
 * variables String name Include appropriate getters, setters and constructor.
 * name is the privilege name, get the privilege access separated by comma like
 * Admin,Create,Update.
 * 
 * Create a Main class to test the above 3 classes. In the main method, create
 * an array of Role instances / objects. Invoke the display method in RoleBO
 * class and print the resultant role name.
 * 
 * Input Format: The first input consists of an integer that corresponds to
 * number of role user want. The next three input consists of strings that
 * corresponds to Role name,Role description and Privilege access which is
 * separated by comma and so on. Refer sample input and output for formatting
 * specifications.
 * 
 * Output Format : Display the Role name which holds maximum number of privilege
 * access. If two or more Role has maximum number of privilege access then
 * display the Role names in ascending order. Refer sample input and output for
 * formatting specifications.
 * 
 * [ All text in bold corresponds to input and the rest corresponds to output.]
 * [Note :Strictly adhere to the object oriented specifications given as a part
 * of the problem statement.Use the same class names, attribute names and method
 * names.]
 * 
 * Sample Input and Output :
 * 
 * Enter number of role : 5 Enter the role 1 details : Enter role name :
 * Technical support Enter description : These are the professional
 * troubleshooters of the IT world. Enter the privileges : Admin,Guide the
 * team,Supporting the team Enter the role 2 details : Enter role name :
 * Administrator Enter description : This Office Administrator job description
 * template is optimized for posting on online job. Enter the privileges :
 * Admin,Edit Database Enter the role 3 details : Enter role name : Systems
 * analyst Enter description : Systems analysts investigate and analyse business
 * problems. Enter the privileges : Admin,Data Analyse,Data Pulling Enter the
 * role 4 details : Enter role name : Network engineer Enter description :
 * Network engineering is one of the more technically demanding IT jobs. Enter
 * the privileges : System Admin,Admin Enter the role 5 details : Enter role
 * name : Business analyst Enter description : Business analysts are true
 * midfielders. Enter the privileges : Marketing Role names which has more
 * number of privileges : Systems analyst Technical support
 */

public class OneToMany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of role :");
        String str = sc.nextLine();
        int input = Integer.parseInt(str);

        Role role[] = new Role[input];
        RoleBO roleBO = new RoleBO();

        for (int i = 0; i < input; i++) {
            System.out.println("Enter the role " + (i + 1) + " details :");

            System.out.println("Enter role name :");
            String name = sc.nextLine();

            System.out.println("Enter description :");
            String description = sc.nextLine();

            System.out.println("Enter the privileges :");
            String priviligies = sc.nextLine();

            String arr[] = priviligies.split("\\,");
            Privilege privilege[] = new Privilege[arr.length];

            for (int j = 0; j < arr.length; j++) {
                privilege[j] = new Privilege(arr[j]);
            }
            role[i] = new Role(name, description, privilege);
        }
        roleBO.display(role);
        sc.close();
    }

}

class Role {
    private String name;
    private String description;
    private Privilege[] privilege;

    public Role(String name, String description, Privilege[] privilege) {
        this.name = name;
        this.description = description;
        this.privilege = privilege;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Privilege[] getPrivilege() {
        return privilege;
    }
}

class RoleBO {
    public void display(Role[] role) {
        System.out.println("Role names which has more number of privileges :");

        int maxValue = role[0].getPrivilege().length;
        int count = 1;
        for (int i = 1; i < role.length; i++) {
            if (role[i].getPrivilege().length >= maxValue) {
                maxValue = role[i].getPrivilege().length;
                count++;
            }
        }

        String arr[] = new String[count];
        count = 0;
        for (int i = 0; i < role.length; i++) {
            if (role[i].getPrivilege().length == maxValue) {
                arr[count] = role[i].getName();
                count++;
            }
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

class Privilege {
    private String name;

    public Privilege(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}