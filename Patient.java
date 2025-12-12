class Patient {
    private String name;
    private int age;
    private String diagnosis;

    // Конструкторы
    public Patient() {}

    public Patient(String name, int age, String diagnosis) {
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    // Метод
    public void displayInfo() {
        System.out.println("Patient: " + name + ", age: " + age + ", diagnosis: " + diagnosis);
    }

    // Сравнение пациентов по диагнозу
    public boolean hasSameDiagnosis(Patient other) {
        return this.diagnosis.equalsIgnoreCase(other.diagnosis);
    }
}