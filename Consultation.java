import java.util.Date;

public class Consultation {
    private Date date;
    private String timeSlot;
    private double cost;
    private String notes;
    private Doctor doctor;
    private Patient patient;

    public Consultation(Date date, String timeSlot, double cost, String notes, Doctor doctor, Patient patient) {
        this.date = date;
        this.timeSlot = timeSlot;
        this.cost = cost;
        this.notes = notes;
        this.doctor = doctor;
        this.patient = patient;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
