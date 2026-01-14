import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HealthcareManagementSystem {
    public static void main(String[] args) {

        // Больницы
        Hospital cityHospital = new Hospital("City Hospital", "Main Street 12");
        Hospital centralClinic = new Hospital("Central Clinic", "Green Avenue 5");

        // Вывод
        cityHospital.displayInfo();
        centralClinic.displayInfo();

        System.out.println();
        Doctors doc1 = new Therapist("Wilson", 15, 43);
        doc1.examinePatient();
        Doctors doc2 = new Therapist("Smith", 10, 34);
        doc2.examinePatient();
        Doctors doc3 = new Surgeon("Alex", 32, 65);
        doc3.examinePatient();

        // пациенты и поиск
        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Alice Brown", 25, 1, "Flu", cityHospital));
        patients.add(new Patient("John Smith", 30, 2, "Flu", cityHospital));
        patients.add(new Patient("Michael Lee", 40, 3, "Broken Arm", centralClinic));
        patients.add(new Patient("Kate Moore", 69, 4, "Alzheimer’s Disease", cityHospital));
        patients.add(new Patient("Ryan Hill", 18, 5, "Broken Arm", centralClinic));

        for (Patient p : patients) {
            System.out.println(p);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ID пациента: ");
        int searchId = scanner.nextInt();

        boolean found = false;

        for (Patient p : patients) {
            if (p.getid() == searchId) {
                System.out.println("Найден пациент: " + p);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Пациент с таким ID не найден.");
        }

    }
}