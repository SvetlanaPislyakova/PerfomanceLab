package homework5.clinic;

public class Surgeon extends Doctor {

    public Surgeon(String name) {
        super(name);
    }

    @Override
    public void treat() {
        super.treat();
        System.out.println("Хирург " + name + " удалил аппендицит");
    }
}
