import java.io.*;

/**
 * Any System will have many privileges and many roles. A Role is defined as the
 * specific position of the person in the System and a privilege is the various
 * functionalities he has been allocated to in the System. Write a program to
 * implement the concept of Many to Many relationship using the privilege and
 * role mapping in a System where 'many roles can have many privileges'.
 * 
 * 
 * 
 * Pre-load the roles and privileges of a System and assign a role to a
 * particular privilege (same role can be assigned to a different privilege and
 * same privilege can be assigned to different roles) getting it as input from
 * the User. Use two types of search types: Search based on Role and Search
 * based on Privilege. Your block of code should finally display the Privileges
 * for a specific Role.
 * 
 * 
 * 
 * Problem Specifications: [Note :Strictly adhere to the object oriented
 * specifications given as a part of the problem statement.Use the same class
 * names, attribute names and method names.]
 * 
 * Create a class named Role with the following private member variables /
 * attributes Integer id String name String description 1) Include appropriate
 * getters and setters. 2) Include 3 argument constructor with argument order
 * id,name,description.
 * 
 * Create a class named Privilege with the following private member variables /
 * attributes Integer id String name 1) Include appropriate getters and setters.
 * 2) Include default constructor and 2 argument constructor with argument order
 * id,name.
 * 
 * Create a class named PrivilegeRole with the following private member
 * variables / attributes Role role Privilege privilege 1) Include appropriate
 * getters and setters. 2) Include default constructor and 2 argument
 * constructor with argument order role,privilege.
 * 
 * Create a PrivilegeRoleBO class , which includes following method. No Method
 * Name Method Description 1 void displayRoleDetailsByPrivilege(PrivilegeRole[]
 * privilegeRole,String privilege) In this method, search and display the the
 * role name depends upon privilege name. 2 void displayRole(Role[] roles) In
 * this method, display the pre-loaded roles. 3 void
 * displayPrivilege(Privilege[] privilege) In this method, display the
 * pre-loaded privileges. 4 void displayPrivilegeDetailsByRole(PrivilegeRole[]
 * privilegeRole,String role) In this method, search and display the the
 * privilege name depends upon role name.
 * 
 * Use System.out.format("%-15s %s\n", "Id","Name") to format the string.
 * 
 * Create a Main class to test the above 4 classes. In the main method, create
 * an array of PrivilegeRole instances. Invoke the various methods in
 * PrivilegeRoleBO class and test them.
 * 
 * Note : Role and privilege details are preloaded and given in the template
 * code.
 * 
 * Input and Output Foramt: Refer sample input and output
 * 
 * [ All text in bold corresponds to input and the rest corresponds to output.]
 * Sample Input and Output 1:
 * 
 * Role Details : Id Name 1 Software Developer 2 Manager 3 Tester 4 General
 * Manager Privilege Details : Id Name 1 Admin 2 Decision Making 3 Ordering 4
 * Managing 5 Development Enter the number of privileges to assign the role : 6
 * Enter the role id and privilege id 1 : 1,2 Enter the role id and privilege id
 * 2 : 1,1 Enter the role id and privilege id 3 : 1,4 Enter the role id and
 * privilege id 4 : 2,5 Enter the role id and privilege id 5 : 3,4 Enter the
 * role id and privilege id 6 : 3,1 1. Search by Role 2. Search by Privilege 3.
 * Exit Enter the choice : 1 Enter the role to search : Software Developer
 * Privilege name : Decision Making Admin Managing 1. Search by Role 2. Search
 * by Privilege 3. Exit Enter the choice : 1 Enter the role to search : General
 * Manager There is no Privilege for that role 1. Search by Role 2. Search by
 * Privilege 3. Exit Enter the choice : 2 Enter the privilege to search : Admin
 * Role name : Software Developer Tester 1. Search by Role 2. Search by
 * Privilege 3. Exit Enter the choice : 2 Enter the privilege to search :
 * Ordering There is no role for that privilege 1. Search by Role 2. Search by
 * Privilege 3. Exit Enter the choice : 3
 */

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, i;
        String rolePrivilegeDetails;
        PrivilegeRoleBO privilegeRoleBO = new PrivilegeRoleBO();

        Role[] role = new Role[4];
        role[0] = new Role(1, "Software Developer", "Developing a Software in Java");
        role[1] = new Role(2, "Manager", "Manage or lead the team");
        role[2] = new Role(3, "Tester", "Testing a Software");
        role[3] = new Role(4, "General Manager", "Manage the whole organisations");
        Privilege[] privilege = new Privilege[5];
        privilege[0] = new Privilege(1, "Admin");
        privilege[1] = new Privilege(2, "Decision Making");
        privilege[2] = new Privilege(3, "Ordering");
        privilege[3] = new Privilege(4, "Managing");
        privilege[4] = new Privilege(5, "Development");
        Role selectedRole = null;
        Privilege pri = null;

        new PrivilegeRoleBO().displayRole(role);
        new PrivilegeRoleBO().displayPrivilege(privilege);
        System.out.println("Enter the number of privileges to assign the role :");
        n = Integer.parseInt(br.readLine());
        PrivilegeRole[] privilegeRole = new PrivilegeRole[n];
        for (i = 0; i < n; i++) {
            System.out.println("Enter the role id and privilege id " + (i + 1) + " :");
            rolePrivilegeDetails = br.readLine();
            String splited[] = rolePrivilegeDetails.split("\\,");
            int r = Integer.parseInt(splited[0]) - 1;
            int p = Integer.parseInt(splited[1]) - 1;
            privilegeRole[i] = new PrivilegeRole(role[r], privilege[p]);
        }

        boolean option = true;
        while (option) {
            System.out.println("1. Search by Role\n2. Search by Privilege\n3. Exit\nEnter the choice :");
            int choice = Integer.parseInt(br.readLine());
            if (choice == 2) {
                System.out.println("Enter the privilege to search :");
                privilegeRoleBO.displayRoleDetailsByPrivilege(privilegeRole, br.readLine());
            } else if (choice == 1) {
                System.out.println("Enter the role to search :");
                privilegeRoleBO.displayPrivilegeDetailsByRole(privilegeRole, br.readLine());
            } else if (choice == 3) {
                System.exit(0);
                option = false;
            }
        }

    }
}

class PrivilegeRole {
    private Role role;
    private Privilege privilege;

    public PrivilegeRole() {
    }

    public PrivilegeRole(Role role, Privilege privilege) {
        this.role = role;
        this.privilege = privilege;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Privilege getPrivilege() {
        return privilege;
    }

    public void setPrivilege(Privilege privilege) {
        this.privilege = privilege;
    }
}

class Privilege {
    private Integer id;
    private String name;

    public Privilege() {
    }

    public Privilege(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Role {
    private Integer id;
    private String name;
    private String description;

    public Role(Integer id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

class PrivilegeRoleBO {

    void displayRoleDetailsByPrivilege(PrivilegeRole[] privilegeRole, String privilege) {
        int count = 0;
        for (int i = 0; i < privilegeRole.length; i++) {
            if (privilegeRole[i].getPrivilege().getName().equalsIgnoreCase(privilege)) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("There is no role for that privilege");
        } else {
            System.out.println("Role name :");
            for (int i = 0; i < privilegeRole.length; i++) {
                if (privilegeRole[i].getPrivilege().getName().equalsIgnoreCase(privilege)) {
                    System.out.println(privilegeRole[i].getRole().getName());
                }
            }
        }
    }

    void displayPrivilegeDetailsByRole(PrivilegeRole[] privilegeRole, String role) {
        int count = 0;
        for (int i = 0; i < privilegeRole.length; i++) {
            if (privilegeRole[i].getRole().getName().equalsIgnoreCase(role)) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("There is no Privilege for that role");
        } else {
            for (int i = 0; i < privilegeRole.length; i++) {
                System.out.println("Privilege name :");
                if (privilegeRole[i].getRole().getName().equalsIgnoreCase(role)) {
                    System.out.println(privilegeRole[i].getPrivilege().getName());
                }
            }
        }
    }

    void displayRole(Role[] roles) {
        System.out.println("Role Details :");
        System.out.format("%-15s %s\n", "Id", "Name");
        for (Role r : roles)
            System.out.format("%-15d %s\n", r.getId(), r.getName());
    }

    void displayPrivilege(Privilege[] privilege) {
        System.out.println("Privilege Details :");
        System.out.format("%-15s %s\n", "Id", "Name");
        for (Privilege p : privilege)
            System.out.format("%-15d %s\n", p.getId(), p.getName());
    }
}
