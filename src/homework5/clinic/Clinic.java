package homework5.clinic;

/*
Создать программу для имитации работы клиники. Пусть в клинике будет три
врача: хирург, терапевт и дантист. Каждый врач имеет метод «лечить», но
каждый врач лечит по-своему. Так же предусмотреть класс «Пациент» с полем
«План лечения» и полем «Доктор». Создать объект класса «Пациент» и
добавить пациенту план лечения. У терапевта создать метод, который будет
назначать врача пациенту согласно плану лечения:
Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
Если план лечения имеет код 2 – назначить дантиста и выполнить метод
лечить.
Если план лечения имеет любой другой код – назначить терапевта и
выполнить метод
лечить.
 */
public class Clinic {

    public static void main(String[] args) {
        Therapist therapist = new Therapist("Иванов Иван Иванович");
        Dentist dentist = new Dentist("Петров Петр Петрович");
        Surgeon surgeon = new Surgeon("Сидоров Сидор Сидорович");
        Patient patient1 = new Patient("Орлова Алена Александровна", 1);
        therapist.initialAppointment(patient1, therapist, dentist, surgeon);
        patient1.getDoctor().treat();
        patient1.setTreatmentPlan(2);
        therapist.initialAppointment(patient1, therapist, dentist, surgeon);
        patient1.getDoctor().treat();
        Patient patient2 = new Patient("Веселова Ольга Николаевна", 2);
        therapist.initialAppointment(patient2, therapist, dentist, surgeon);
        patient2.getDoctor().treat();
        Patient patient3 = new Patient("Киселева Ирина Викторовна", 3);
        therapist.initialAppointment(patient3, therapist, dentist, surgeon);
        patient3.getDoctor().treat();
    }
}
