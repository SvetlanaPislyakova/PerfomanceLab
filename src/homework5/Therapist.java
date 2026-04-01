package homework5;

public class Therapist extends Doctor {

    public Therapist(String name) {
        super(name);
    }

    @Override
    public void treat() {
        super.treat();
        System.out.println("Терапевт " + name + " осмотрел, направил на анализы и назначил лечение");
    }

    public void initialAppointment(Patient patient, Therapist therapist, Dentist dentist, Surgeon surgeon) {
        System.out.println("\n=== Пациент " + patient.getName() + " ===");
        System.out.println("Первичный осмотр терапевта");
        switch (patient.getTreatmentPlan()){
            case 1:
                System.out.println("Назначено лечение хирурга");
                patient.setDoctor(surgeon);
                break;
            case 2:
                System.out.println("Назначено лечение стоматолога");
                patient.setDoctor(dentist);
                break;
            default:
                System.out.println("Назначено лечение терапевта");
                patient.setDoctor(therapist);
        }
    }
}
