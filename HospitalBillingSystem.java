
public class HospitalBillingSystem {
    public static void main(String[] args) {

        MedicalService[] services = {
                new Consultation("S001", 15, 10),
                new LaboratoryTest("S002", 10, 8),
                new Ultrasound("S003", 30, 10)
        };

        double totalBill = 0;

        System.out.println("===== HOSPITAL BILLING SYSTEM =====");
        System.out.println();

        for (MedicalService service : services) {
            service.displayServiceInfo();
            totalBill += service.calculateTotalCost();
        }

        System.out.println("------------------------------");
        System.out.printf("Total Hospital Bill: $%.2f%n", totalBill);
    }
}
