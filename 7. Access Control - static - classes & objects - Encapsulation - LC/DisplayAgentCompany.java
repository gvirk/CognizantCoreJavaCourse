import java.io.*;

/**
 * Gowtham is working as a Shipping Agent at TeCo Shipping Corporation. The
 * Company wanted to recruit more Shipping Agents and aligned Gowtham for the
 * task. He pulled out a list of Agents who showed interest in joining TeCo. Few
 * of the Agents in the list were already working as Agents to other Companys
 * and some were new to the profile. If the Agent was already working for other
 * Companies, Gowtham would collect his personal details and his expected Fee he
 * collects from the Companies. For new Agents, he would collect only their
 * personal details. Gowtham found this process a bit difficult and thought to
 * automate it. He needs your help on the same.
 * 
 * 
 * This problem will guide you through how to implement a Many to Many
 * Relationship. Three Classes 'Agent', 'Company' and 'AgentCompanyFee' is taken
 * for consideration and the relationship between them is explained as 'One
 * Company can have multiple Agents and one Agent can work in multiple
 * companies'.
 * 
 * 1. Create a class named Agent with the following private member variables /
 * attributes String fmcCode String iataCode String address String name Include
 * appropriate getters, setters and constructors.
 * 
 * 2. Create another class named Company with the following private members
 * variables / attributes int id String fmcCode String address String
 * companyName Include appropriate getters, setters and constructors.
 * 
 * 3. Create another class named AgentCompanyFee with the following private
 * member variables / attributes Agent agent Company company Integer fees
 * Include appropriate getters, setters and constructors.
 * 
 * 4. Create a class named AgentBO with the following public methods.
 * 
 * S.No Method Name Method Description 1 void
 * displayAgentDetailsByCompany(String name,AgentCompanyFee[] agentCompanyFee)
 * displays the agent names for a given company. 2 void
 * displayCompanyDetailsByAgent(String name,AgentCompanyFee[] agentCompanyFee)
 * displays the companies for which the given agent works. 5. Create a class
 * Main and write a main method to test the above class.
 * 
 * [Note : Strictly adhere to the object oriented specifications given as a part
 * of the problem statement.Use the same class names, method names and attribute
 * names]
 * 
 * Input and Output Format: Refer sample input and output for formatting
 * specifications.
 * 
 * [All text in bold corresponds to input and the rest corresponds to output]
 * Sample Input and Output 1: Enter the number of agents : 4 Select the company
 * where the agent 1 is going to work : 1. Titanic 2. Arcadia 3. Umbrella
 * corporation 4. Omnicorp Enter your choice : 1 1. New Agent 2. Existing Agent
 * Enter the choice : 1 Enter the agent details : I001,Suriya,Coimbatore Enter
 * the fee of the agent : 100 Select the company where the agent 2 is going to
 * work : 1. Titanic 2. Arcadia 3. Umbrella corporation 4. Omnicorp Enter your
 * choice : 2 1. New Agent 2. Existing Agent Enter the choice : 1 Enter the
 * agent details : I002,KarthickManian,Coimbatore Enter the fee of the agent :
 * 100 Select the company where the agent 3 is going to work : 1. Titanic 2.
 * Arcadia 3. Umbrella corporation 4. Omnicorp Enter your choice : 3 1. New
 * Agent 2. Existing Agent Enter the choice : 2 Enter the name : Suriya Enter
 * the fee of the agent : 100 Select the company where the agent 4 is going to
 * work : 1. Titanic 2. Arcadia 3. Umbrella corporation 4. Omnicorp Enter your
 * choice : 4 1. New Agent 2. Existing Agent Enter the choice : 2 Enter the name
 * : KarthickManian Enter the fee of the agent : 100 Search: 1. Find agents 2.
 * Find companies 2 Enter the agent name : Suriya Agent works for Titanic
 * Umbrella corporation
 * 
 * Sample Input and Output 2: Enter the number of agents : 3 Select the company
 * where the agent 1 is going to work : 1. Titanic 2. Arcadia 3. Umbrella
 * corporation 4. Omnicorp Enter your choice : 1 1. New Agent 2. Existing Agent
 * Enter the choice : 1 Enter the agent details : I001,Suriya,Coimbatore Enter
 * the fee of the agent : 100 Select the company where the agent 2 is going to
 * work : 1. Titanic 2. Arcadia 3. Umbrella corporation 4. Omnicorp Enter your
 * choice : 2 1. New Agent 2. Existing Agent Enter the choice : 1 Enter the
 * agent details : I002,Manikandan,Coimbatore Enter the fee of the agent : 200
 * Select the company where the agent 3 is going to work : 1. Titanic 2. Arcadia
 * 3. Umbrella corporation 4. Omnicorp Enter your choice : 1 1. New Agent 2.
 * Existing Agent Enter the choice : 2 Enter the name : Manikandan Enter the fee
 * of the agent : 200 Search: 1. Find agents 2. Find companies 1 Enter the
 * company name : Titanic Company has Suriya 100 Manikandan 200
 */

public class DisplayAgentCompany {
    Company[] companies = DisplayAgentCompany.initCompany();

    public static Company[] initCompany() {
        Company[] companies = new Company[4];
        companies[0] = new Company(1, "FM01", "India", "Titanic");
        companies[1] = new Company(2, "FM02", "America", "Arcadia");
        companies[2] = new Company(3, "FM03", "England", "Umbrella corporation");
        companies[3] = new Company(4, "FM04", "France", "Omnicorp");
        return companies;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of agents :");
        Integer n = Integer.parseInt(buf.readLine());

        AgentCompanyFee[] agentCompanyFee = new AgentCompanyFee[n];
        AgentBO agentBO = new AgentBO();

        int companyChoice;
        int agentChoice;
        Company company;
        Agent agent;

        for (Integer i = 0; i < n; i++) {
            System.out.println("Select the company where the agent " + (i + 1) + " is going to work :");
            System.out.println("1. Titanic\n2. Arcadia\n3. Umbrella corporation\n4. Omnicorp\nEnter your choice :");
            companyChoice = Integer.parseInt(buf.readLine());
            System.out.println("1. New Agent\n2. Existing Agent\nEnter the choice :");
            agentChoice = Integer.parseInt(buf.readLine());

            Company[] companies = initCompany();
            company = companies[companyChoice - 1];
            String fmcCode = company.getFmcCode();
            if (agentChoice == 1) {
                System.out.println("Enter the agent details :");
                String agentDetails = buf.readLine();
                String agentDts[] = agentDetails.split("\\,");
                agent = new Agent(fmcCode, agentDts[0], agentDts[2], agentDts[1]);
            } else {
                System.out.println("Enter the name :");
                String agentName = buf.readLine();
                agent = new Agent(fmcCode, "", "", agentName);
            }
            System.out.println("Enter the fee of the agent :");

            int fees = Integer.parseInt(buf.readLine());
            agentCompanyFee[i] = new AgentCompanyFee(agent, company, fees);

        }
        System.out.println("Search:\n1. Find agents\n2. Find companies");
        int choice = Integer.parseInt(buf.readLine());
        if (choice == 2) {
            System.out.println("Enter the agent name :");
            String agentName = buf.readLine();
            agentBO.displayCompanyDetailsByAgent(agentName, agentCompanyFee);
        } else {
            System.out.println("Enter the company name :");
            String companytName = buf.readLine();
            agentBO.displayAgentDetailsByCompany(companytName, agentCompanyFee);
        }
    }

}

class Agent {
    private String fmcCode;
    private String iataCode;
    private String address;
    private String name;

    public Agent(String fmcCode, String iataCode, String address, String name) {
        this.fmcCode = fmcCode;
        this.iataCode = iataCode;
        this.address = address;
        this.name = name;
    }

    public String getFmcCode() {
        return fmcCode;
    }

    public String getIataCode() {
        return iataCode;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }
}

class Company {
    private int id;
    private String fmcCode;
    private String address;
    private String companyName;

    public Company(int id, String fmcCode, String address, String companyName) {
        this.fmcCode = fmcCode;
        this.id = id;
        this.address = address;
        this.companyName = companyName;
    }

    public String getFmcCode() {
        return fmcCode;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getCompanyName() {
        return companyName;
    }
}

class AgentCompanyFee {
    Agent agent;
    Company company;
    Integer fees;

    public AgentCompanyFee(Agent agent, Company company, int fees) {
        this.agent = agent;
        this.company = company;
        this.fees = fees;
    }

    public Agent getAgent() {
        return agent;
    }

    public Company company() {
        return company;
    }

    public int getFees() {
        return fees;
    }

}

class AgentBO {
    public void displayAgentDetailsByCompany(String name, AgentCompanyFee[] agentCompanyFee) {
        System.out.println("Company has");
        for (int i = 0; i < agentCompanyFee.length; i++) {
            if (agentCompanyFee[i].company.getCompanyName().equals(name)) {
                System.out.println(agentCompanyFee[i].agent.getName() + " " + agentCompanyFee[i].getFees());
            }
        }

    }

    public void displayCompanyDetailsByAgent(String name, AgentCompanyFee[] agentCompanyFee) {
        System.out.println("Agent works for");
        for (int i = 0; i < agentCompanyFee.length; i++) {
            if (agentCompanyFee[i].agent.getName().equals(name)) {
                System.out.println(agentCompanyFee[i].company.getCompanyName());
            }
        }

    }
}