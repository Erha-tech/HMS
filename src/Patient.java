class Patient {
    private String name;
    private int age;
    private int id;
    private String diagnosis;
    private Hospital hospital;   // ← связь с больницей

    public Patient(String name, int age, int id, String diagnosis, Hospital hospital) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.diagnosis = diagnosis;
        this.hospital = hospital;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getid() {
        return id;
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

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " +  name + ", Age: " + age + ", Diagnosis: " + diagnosis + ", Hospital: " + hospital.getName();
    }

}