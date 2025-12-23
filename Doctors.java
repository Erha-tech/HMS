class Doctors {
    protected String name;
    protected int experience;

    public Doctors(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    public void examinePatient() {
        System.out.println("Doctor " + name + " with " + experience + " years of experience examines the patient");
    }

}
