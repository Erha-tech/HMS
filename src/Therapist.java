public class Therapist extends Doctors {

    public Therapist(String name, int experience, int age) {
        super(name, experience, age);
    }

    @Override
    public void doExamine() {
        System.out.println("Therapist " + name + " with " + experience + " years of experience checks general health");
    }
}