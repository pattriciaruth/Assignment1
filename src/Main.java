public class Main {
    public static void main(String[] args) {
        // Create a General Practitioner using the parameterized constructor
        GeneralPractitioner gp = new GeneralPractitioner(101, "Dr. Alice Brown", "Primary Care", 200);
        gp.printInfo();

        System.out.println();

        // Create a Specialist using the parameterized constructor
        Specialist sp = new Specialist(102, "Dr. Bob White", "Surgery", "Orthopedics");
        sp.printInfo();
    }
}


