import java.util.ArrayList;

public class Main {
    // Part 5 – Collection of appointments
    private static final ArrayList<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        System.out.println("// Part 3 – Using classes and objects");
        // Create a General Practitioner using the parameterized constructor
        GeneralPractitioner gp1 = new GeneralPractitioner(101, "Dr. Chris Denz", "Colposcopy", 12);
        gp1.printInfo();
        System.out.println("--------------------");

        GeneralPractitioner gp2 = new GeneralPractitioner(102, "Dr. Jasper Mahon", "Chronic Diseases", 20);
        gp2.printInfo();
        System.out.println("--------------------");

        GeneralPractitioner gp3 = new GeneralPractitioner(103, "Dr. Mathew John", "Paediatrics", 15);
        gp3.printInfo();
        System.out.println("--------------------");

        GeneralPractitioner gp4 = new GeneralPractitioner(104, "Dr. Romi Gordon", "Women's Health", 18);
        gp4.printInfo();
        System.out.println("--------------------");

        // Create a Specialist using the parameterized constructor
        Specialist sp1 = new Specialist(201, "Dr. Zachary Denz", "Mental Health", "mental diseases");
        sp1.printInfo();
        System.out.println("--------------------");

        Specialist sp2 = new Specialist(202, "Dr. christine Kwok", "Women's Health", "Gynaecology");
        sp2.printInfo();
        System.out.println("--------------------");

    // Create appointments with different doctors
    Appointment appt1 = new Appointment("John Doe", "123-456-7890", "10:00", gp3);
    Appointment appt2 = new Appointment("Jane Smith", "987-654-3210", "14:30", gp1);
    Appointment appt3 = new Appointment("Alice Johnson", "555-123-4567", "11:00", sp1);
    Appointment appt4 = new Appointment("Bob Williams", "444-987-6543", "16:00", sp2);
    
    // Print appointments
    appt1.printAppointmentDetails();
    System.out.println("------------------------------");
    appt2.printAppointmentDetails();
    System.out.println("------------------------------");
    appt3.printAppointmentDetails();
    System.out.println("------------------------------");
    appt4.printAppointmentDetails();
    System.out.println("------------------------------");

    // Part 5 – Collection of appointments
    System.out.println("// Part 5 Collection of appointments");

    // Add appointments to the list
    createAppointment(appt1);
    createAppointment(appt2);
    createAppointment(appt3);
    createAppointment(appt4);

    // Print all existing appointments
    printExistingAppointments();

    // Cancel an appointment
    cancelBooking("987-654-3210"); // This will cancel Jane Smith's appointment

    // Print appointments after cancellation
    printExistingAppointments();
}

// Method to create and add a new appointment
public static void createAppointment(Appointment appt) {
    if (appt != null && appt.getPatientName() != null && !appt.getPatientName().isEmpty()
            && appt.getMobilePhone() != null && !appt.getMobilePhone().isEmpty()
            && appt.getPreferredTimeSlot() != null && !appt.getPreferredTimeSlot().isEmpty()
            && appt.getDoctor() != null) {
        appointments.add(appt);
        System.out.println("Appointment created successfully for " + appt.getPatientName());
    } else {
        System.out.println("Failed to create appointment: Missing required information.");
    }
}

// Method to print all existing appointments
public static void printExistingAppointments() {
    if (appointments.isEmpty()) {
        System.out.println("No existing appointments.");
    } else {
        System.out.println("Existing Appointments:");
        for (Appointment appt : appointments) {
            appt.printAppointmentDetails();
            System.out.println("------------------------------");
        }
    }
}

// Method to cancel an appointment by mobile phone number
public static void cancelBooking(String mobilePhone) {
    boolean found = false;
    for (int i = 0; i < appointments.size(); i++) {
        if (appointments.get(i).getMobilePhone().equals(mobilePhone)) {
            System.out.println("Cancelling appointment for " + appointments.get(i).getPatientName());
            appointments.remove(i);
            found = true;
            break;
        }
    }
    if (!found) {
        System.out.println("No appointment found with mobile phone: " + mobilePhone);
    }
}
}