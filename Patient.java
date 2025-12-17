class Patient {
    private String name;
    private int age;
    private String diagnosis;
    private Hospital hospital;   // ← связь с больницей

    public Patient(String name, int age, String diagnosis, Hospital hospital) {
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
        this.hospital = hospital;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getDiagnosis() {
        return diagnosis;
    }
    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public void displayInfo() {
        System.out.println(
            "Patient: " + name +
            ", age: " + age +
            ", diagnosis: " + diagnosis +
            ", hospital: " + hospital.getName()
        );
    }

    public boolean hasSameDiagnosis(Patient other) {
        return this.diagnosis.equalsIgnoreCase(other.diagnosis);
    }
}
