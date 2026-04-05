package homework5.clinic;

public class Dentist extends Doctor {

    public Dentist(String name) {
        super(name);
    }

    @Override
    public void treat() {
        super.treat();
        System.out.println("Стоматолог " + name + " высверлил кариес и поставил пломбу");
    }
}
