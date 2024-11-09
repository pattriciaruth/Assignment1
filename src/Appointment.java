public class Appointment {
    // Instance variables
    private String patientName;
    private String mobilePhone;
    private String preferredTimeSlot;
    private HealthProfessional doctor; // Can be either GeneralPractitioner or Specialist

    // Default constructor
    public Appointment() {
        
    }

    // Constructor that initializes all instance variables
    public Appointment(String patientName, String mobilePhone, String preferredTimeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.mobilePhone = mobilePhone;
        this.preferredTimeSlot = preferredTimeSlot;
        this.doctor = doctor;
    }

    // Method to print all instance variables
    public void printAppointmentDetails() {
        System.out.println("Appointment Details:");
        System.out.println("Patient Name: " + patientName);
        System.out.println("Mobile Phone: " + mobilePhone);
        System.out.println("Preferred Time Slot: " + preferredTimeSlot);
        
        if (doctor != null) {
            System.out.println("Doctor Details:");
            doctor.printInfo(); // Calls the printInfo method from either GeneralPractitioner or Specialist
        } else {
            System.out.println("No doctor assigned for this appointment.");
        }
    }

    // Getter and Setter methods can be added if needed
}


