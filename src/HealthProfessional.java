public class HealthProfessional {
    // Instance variables
    private int ID;
    private String name;
    private String department; // Additional variable to describe the health professional

    // Default constructor
    public HealthProfessional() {
        
    }

    // Parameterized constructor
    public HealthProfessional(int ID, String name, String department) {
        this.ID = ID;
        this.name = name;
        this.department = department;
    }

    public HealthProfessional(int ID) {
        this.ID = ID;
    }

    // Method to print all instance variables
    public void printInfo() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

