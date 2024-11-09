public class Main {
    public static void main(String[] args) {
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

    // Creating appointment objects
    Appointment appointment1 = new Appointment("John Doe", "123-456-7890", "10:00", gp3);
    Appointment appointment2 = new Appointment("Jane Smith", "987-654-3210", "14:30", sp2);

    // Print appointment details
    appointment1.printAppointmentDetails();
    System.out.println("------------------------------");
    appointment2.printAppointmentDetails();

    
    
    
    }
}


