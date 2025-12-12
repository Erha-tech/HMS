public class Main {
  public static void main(String[] args) {

    // Создаем пациентов
    Patient p1 = new Patient("John Smith", 30, "Flu");
    Patient p2 = new Patient("Alice Brown", 25, "Flu");
    Patient p3 = new Patient("Michael Lee", 40, "Broken Arm");

    // Создаем врача
    MedicalProfessional doctor = new MedicalProfessional("Dr. Wilson", "Therapist");

    // Создаем больницу
    Hospital hospital = new Hospital("City Hospital", "Main Street 12");

    // Вывод объектов
    p1.displayInfo();
    p2.displayInfo();
    p3.displayInfo();

    doctor.displayInfo();
    hospital.displayInfo();

    // Сравнение пациентов
    System.out.println("\nComparing diagnoses:");
    System.out.println("p1 and p2 same diagnosis? " + p1.hasSameDiagnosis(p2));
    System.out.println("p1 and p3 same diagnosis? " + p1.hasSameDiagnosis(p3));
  }
}