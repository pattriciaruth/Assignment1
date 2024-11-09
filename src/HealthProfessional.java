// Base class 
// Part 1 of the assignment
public class HealthProfessional {
    // Instance variables
    protected int ID;
    protected String name;
    protected String department;

    // Default constructor
    public HealthProfessional() {
        
    }

    // Parameterized constructor
    public HealthProfessional(int ID, String name, String department) {
        this.ID = ID;
        this.name = name;
        this.department = department;
    }

    // Method to print all instance variables
    public void printInfo() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

// Child class for General Practitioner
//Part 2 of the Assignment
class GeneralPractitioner extends HealthProfessional {
    private int numberOfPatients;

    // Default constructor
    public GeneralPractitioner() {
        super();
        
    }

    // Parameterized constructor
    public GeneralPractitioner(int ID, String name, String department, int numberOfPatients) {
        super(ID, name, department); // Initialize base class variables
        this.numberOfPatients = numberOfPatients;
    }

    // Method to print information
    @Override
    public void printInfo() {
        System.out.println("The health professional details are (General Practitioner):");
        super.printInfo(); // Print base class details
        System.out.println("Number of Patients: " + numberOfPatients);
    }
}

// Child class for Specialist
class Specialist extends HealthProfessional {
    private String specialization;

    // Default constructor
    public Specialist() {
        super();
        
    }

    // Parameterized constructor
    public Specialist(int ID, String name, String department, String specialization) {
        super(ID, name, department); // Initialize base class variables
        this.specialization = specialization;
    }

    // Method to print information
    @Override
    public void printInfo() {
        System.out.println("The health professional details are (Specialist):");
        super.printInfo(); // Print base class details
        System.out.println("Specialization: " + specialization);
    }
}


