public class Surgeon extends Doctors {

    public Surgeon(String name, int experience, int age) {
        super(name, experience, age);
    }

    @Override
    public void doExamine() {
        System.out.println("Surgeon " + name + " with " + experience + " years of experience performs the operation");
    }
}