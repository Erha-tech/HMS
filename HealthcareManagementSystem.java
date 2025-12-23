public class HealthcareManagementSystem {
  public static void main(String[] args) {

    // Больницы
    Hospital cityHospital = new Hospital("City Hospital", "Main Street 12");
    Hospital centralClinic = new Hospital("Central Clinic", "Green Avenue 5");

    // Пациенты с привязкой к больнице
    Patient p1 = new Patient("John Smith", 30, "Flu", cityHospital);
    Patient p2 = new Patient("Alice Brown", 25, "Flu", cityHospital);
    Patient p3 = new Patient("Michael Lee", 40, "Broken Arm", centralClinic);

    // Вывод
    cityHospital.displayInfo();
    centralClinic.displayInfo();

    System.out.println();
    p1.displayInfo();
    p2.displayInfo();
    p3.displayInfo();

    Doctors doc1 = new Therapist("Dr.Wilson", 15);
    doc1.examinePatient();
    Doctors doc2 = new Therapist("Dr.Smith", 10);
    doc2.examinePatient();
    Doctors doc3 = new Surgeon("Dr.Alex", 22);
    doc3.examinePatient();
  }
}
