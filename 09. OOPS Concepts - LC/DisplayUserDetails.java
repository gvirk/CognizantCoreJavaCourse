import java.util.Scanner;

/**
 * Benjamin started a Mobile Accessories and Gadgets Shop in his City.
 * Youngsters today are more attracted towards gadgets, the reason why Benjamin
 * chose to invest in this industry. Undoubtedly he had a decent customer base
 * visiting his shop everyday. To ease his job in maintaining the details of his
 * Users, he wanted an automated system that will search a specific User detail
 * based on two search types - one search using Username and the other search
 * using Firstname and Lastname and display the details of that User.
 * 
 * One of the key benefits of using Object-Oriented Programming is Method
 * Overloading. Method Overloading is the ability to create multiple methods of
 * the same name in the same class with different implementations.
 * 
 * Write a program using Method Overloading concept using two methods that will
 * help Benjamin to search User details, one search using Username and the other
 * using Firstname and Lastname.
 * 
 * Create a class named User with the following private member variables /
 * attributes.
 * 
 * String userName String firstName String lastName String contact Include a
 * 4-argument argument constructor with following order
 * userName,firstName,lastName,contact. Include appropriate getters,setters and
 * default constructor
 * 
 * 
 * User findUser(User userArray[],String userName)
 * 
 * In this method, find the appropriate user by username and return the user
 * object, otherwise return null.
 * 
 * 2 User findUser(User userArray[],String firstName,String lastName)
 * 
 * In this method, find the appropriate user by firstname and lastname and
 * return the user object, otherwise return null.Create a Main class to access
 * the above class methods and display the user details.
 * 
 * [Note :Strictly adhere to the object oriented specifications given as a part
 * of the problem statement.Use the same class names, attribute names and method
 * names.]
 * 
 * Input and Output Format: If the user is not present display 'User not found'
 * Refer sample input and output for formatting specification.
 * 
 * [All text in bold corresponds to input and the rest corresponds to output.]
 * Sample Input and Output 1: Enter the total number of users 2 Enter user
 * details peeter,peeter,mark,9965000001 john,john,sam,9500484444 1)Search user
 * by user name 2)Search user by first name and last name Enter your option 1
 * Enter the user name to search peeter User details : Username :peeter
 * FirstName :peeter LastName :mark Contact :9965000001
 * 
 * Sample Input and Output 2:
 * 
 * Enter the total number of users 1 Enter user details
 * suriya,suriya,sivakumar,9966554433 1)Search user by user name 2)Search user
 * by first name and last name Enter your option 1 Enter the user name to search
 * sivakumar User not found
 */

public class DisplayUserDetails {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User usr = new User();
        System.out.println("Enter the total number of users");
        int input = Integer.valueOf(sc.nextLine());
        User user[] = new User[input];

        System.out.println("Enter user details");
        for (int i = 0; i < input; i++) {
            String str = sc.nextLine();
            String arr[] = str.split("\\,");
            user[i] = new User(arr[0], arr[1], arr[2], arr[3]);
        }

        System.out.println("1)Search user by user name\n2)Search user by first name and last name");
        System.out.println("Enter your option");
        int option = Integer.valueOf(sc.nextLine());
        if (option == 1) {
            System.out.println("Enter the user name to search");
            String name = sc.nextLine();
            System.out.println("u: " + user.length);
            usr = usr.findUser(user, name);
        } else {
            System.out.println("Enter the first name to search");
            String firstName = sc.nextLine();
            System.out.println("Enter the last name to search");
            String lastname = sc.nextLine();
            System.out.println("u: " + user.length);
            usr = usr.findUser(user, firstName, lastname);
        }

        String result = "User not found";
        if (usr != null) {
            System.out.println("User details :");
            result = "Username :" + usr.getUserName() + "\nFirstName :" + usr.getFirstName() + "\nLastName :"
                    + usr.getLastName() + "\nContact :" + usr.getContact();
        }

        System.out.println(result);
        sc.close();
    }
}

class User {
    private String userName;
    private String firstName;
    private String lastName;
    private String contact;

    public User() {
    }

    public User(String userName, String firstName, String lastName, String contact) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contact = contact;
    }

    public String getUserName() {
        return userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getContact() {
        return contact;
    }

    User findUser(User userArray[], String userName) {
        User usr = null;
        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i].getUserName().equals(userName)) {
                usr = new User(userArray[i].getUserName(), userArray[i].getFirstName(), userArray[i].getLastName(),
                        userArray[i].getContact());
            }
        }
        return usr;
    }

    User findUser(User userArray[], String firstName, String lastName) {
        User usr = null;
        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i].getFirstName().equals(firstName) && userArray[i].getLastName().equals(lastName)) {
                usr = new User(userArray[i].getUserName(), userArray[i].getFirstName(), userArray[i].getLastName(),
                        userArray[i].getContact());
            }
        }
        return usr;
    }
}