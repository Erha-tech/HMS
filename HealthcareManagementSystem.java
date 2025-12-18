public class HealthcareManagementSystem {
    public static void main(String[] args) {

        // Больницы
        Hospital cityHospital = new Hospital("City Hospital", "Main Street 12");
        Hospital centralClinic = new Hospital("Central Clinic", "Green Avenue 5");

        // Пациенты с привязкой к больнице
        Patient p1 = new Patient("John Smith", 30, "Flu", cityHospital);
        Patient p2 = new Patient("Alice Brown", 25, "Flu", cityHospital);
        Patient p3 = new Patient("Michael Lee", 40, "Broken Arm", centralClinic);

        // Врач
        MedicalProfessional doctor = new MedicalProfessional("Dr. Wilson", "Therapist");

        // Вывод
        cityHospital.displayInfo();
        centralClinic.displayInfo();

        System.out.println();
        p1.displayInfo();
        p2.displayInfo();
        p3.displayInfo();

        System.out.println();
        doctor.displayInfo();

        System.out.println("\nComparing diagnoses:");
        System.out.println("p1 and p2 same diagnosis? " + p1.hasSameDiagnosis(p2));
        System.out.println("p1 and p3 same diagnosis? " + p1.hasSameDiagnosis(p3));
    }
}
