class MedicalProfessional {
    private String name;
    private String specialization;

    // Конструктор
    public MedicalProfessional(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    // Метод
    public void displayInfo() {
        System.out.println("Medical Professional: " + name + ", specialization: " + specialization);
    }
}