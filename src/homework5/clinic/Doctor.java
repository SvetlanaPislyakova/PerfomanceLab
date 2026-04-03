package homework5.clinic;

public class Doctor {

    protected String name;

    public Doctor(String name) {
        this.name = name;
    }

    public void treat() {
        System.out.println("=== Врач начал лечение ===");
    }
}
