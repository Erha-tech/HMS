class Doctors {
    protected String name;
    protected int experience;
    protected int age;

    public Doctors(String name, int experience, int age) {
        this.name = name;
        this.experience = experience;
        this.age = age;
    }

    public void examinePatient() {
        if (age > 63) {
            System.out.println("Doctor " + name + " too old, he/she is on pension");
            return;
        }
        doExamine();
    }

    protected void doExamine() {

    }

}