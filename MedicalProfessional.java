class MedicalProfessional {
    private String name;
    private String specialization;

    public MedicalProfessional(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public void displayInfo() {
        System.out.println("Doctor: " + name + ", specialization: " + specialization);
    }
}
