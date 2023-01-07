//import java.util.ArrayList;
//import java.util.List;
//
//public class WestminsterSkinConsultationManager implements SkinConsultationManager {
//    private List<Doctor> doctors;
//
//    public WestminsterSkinConsultationManager() {
//        doctors = new ArrayList<>();
//    }
//
//    @Override
//    public void addDoctor(Doctor doctor) {
//        doctors.add(doctor);
//    }
//
//    @Override
//    public void removeDoctor(Doctor doctor) {
//        doctors.remove(doctor);
//    }
//
//    @Override
//    public List<Doctor> getDoctors() {
//        return doctors;
//    }
//
//    @Override
//    public void bookConsultation(Patient patient, Doctor doctor, Date date, String timeSlot, double cost, String notes) {
//        Consultation consultation = new Consultation(date, timeSlot, cost, notes, doctor, patient);
//        patient.addConsultation(consultation);
//        doctor.addConsultation(consultation);
//    }
//
//    @Override
//    public void cancelConsultation(Patient patient, Consultation consultation) {
//        patient.removeConsultation(consultation);
//        consultation.getDoctor().removeConsultation(consultation);
//    }
//
//    @Override
//    public List<Consultation> getConsultationsForPatient(Patient patient) {
//        return patient.getConsultations();
//    }
//}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WestminsterSkinConsultationManager implements SkinConsultationManager {
    private static final int MAX_DOCTORS = 10;
    private List<Doctor> doctors;
    private Scanner scanner;

    public WestminsterSkinConsultationManager() {
        doctors = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add a new doctor");
            System.out.println("2. Delete a doctor");
            System.out.println("3. Print list of doctors");
            System.out.println("4. Save and exit");
            System.out.print("Enter a number (1-4): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                addDoctor();
            } else if (choice == 2) {
                deleteDoctor();
            } else if (choice == 3) {
                printDoctors();
            } else if (choice == 4) {
                saveAndExit();
                break;
            }
        }
    }

    private void addDoctor() {
        if (doctors.size() >= MAX_DOCTORS) {
            System.out.println("Error: maximum number of doctors reached.");
            return;
        }

        System.out.print("Enter doctor name: ");
        String name = scanner.nextLine();

        System.out.print("Enter doctor surname: ");
        String surname = scanner.nextLine();

        System.out.print("Enter doctor date of birth (dd/mm/yyyy): ");
        String dobString = scanner.nextLine();
        Date dob = parseDate(dobString);

        System.out.print("Enter doctor mobile number: ");
        String mobileNumber = scanner.nextLine();

        System.out.print("Enter doctor medical license number: ");
        String medicalLicenseNumber = scanner.nextLine();

        System.out.print("Enter doctor specialty: ");
        String specialty = scanner.nextLine();

        System.out.print("Enter doctor hospital: ");
        String hospital = scanner.nextLine();

        Doctor doctor = new Doctor(name, surname, dob, mobileNumber, medicalLicenseNumber, specialty, hospital);
        doctors.add(doctor);

        System.out.println("Doctor added successfully.");
    }

    private void deleteDoctor() {
        System.out.print("Enter doctor medical license number: ");
        String medicalLicenseNumber = scanner.nextLine();

        Doctor doctor = findDoctorByMedicalLicenseNumber(medicalLicenseNumber);
        if (doctor == null) {
            System.out.println("Error: doctor not found.");
            return;
        }

        doctors.remove(doctor);
        System.out.println("Doctor deleted successfully.");
        System.out.println("Deleted doctor: " + doctor);
        System.

//                To implement the GUI described above in Java, you can use a GUI builder tool such as the JavaFX Scene Builder or the Swing GUI Builder.
//
//                For the table to display the list of doctors, you can use a JTable component in the Swing library. The table should have columns for each piece of information about the doctors, such as their name, specialty, and availability. You can allow the user to sort the table alphabetically by implementing a sorting function that rearranges the rows based on the values in a particular column.
//
//                To allow the user to book a consultation with a specific doctor, you can create a form where the user can select a date and time, as well as a doctor. You can then check the availability of the selected doctor at that time, and if the doctor is not available, you can randomly select another available doctor. To store the patient information, consultation cost, and notes, you can use a database such as MySQL or SQLite. You can use an encryption library or API to encrypt the notes before storing them in the database.
//
//        To allow the user to view the stored information for a particular consultation, you can create a form that displays the information from the database for the selected consultation. You can also include a feature to allow the user to upload images of the skin and save them in the database.
//
//        It is important to consider the security of the data when implementing the encryption and storage of sensitive information. You should also consider usability and make sure the GUI is easy for the user to navigate and use.
//import java.awt.BorderLayout;
//import java.awt.Dimension;
//import java.awt.FlowLayout;
//import java.awt.GridLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.security.NoSuchAlgorithmException;
//import java.util.List;
//import javax.crypto.Cipher;
//import javax.crypto.NoSuchPaddingException;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.JPanel;
//import javax.swing.JScrollPane;
//import javax.swing.JTable;
//import javax.swing.JTextField;
//import javax.swing.table.DefaultTableModel;
//
//        public class WestminsterSkinConsultationManagerGUI extends JFrame {
//            private WestminsterSkinConsultationManager manager;
//            private JTable doctorTable;
//            private DefaultTableModel doctorTableModel;
//            private JButton addConsultationButton;
//            private JTextField patientNameField;
//            private JTextField patientSurnameField;
//            private JTextField patientDOBField;
//            private JTextField patientMobileNumberField;
//            private JTextField consultationNotesField;
//            private Cipher cipher;
//
//            public WestminsterSkinConsultationManagerGUI(WestminsterSkinConsultationManager manager) throws NoSuchAlgorithmException, NoSuchPaddingException {
//                super("Westminster Skin Consultation Manager");
//                this.manager = manager;
//                cipher = Cipher.getInstance("AES");
//
//                // Set up doctor table
//                doctorTableModel = new DefaultTableModel();
//                doctorTableModel.addColumn("Name");
//                doctorTableModel.addColumn("Surname");
//                doctorTableModel.addColumn("Specialty");
//                doctorTableModel.addColumn("Hospital");
//                doctorTable = new JTable(doctorTableModel);
//                updateDoctorTable();
//
//                // Set up add consultation panel
//                JPanel addConsultationPanel = new JPanel(new GridLayout(0, 2));
//                addConsultationPanel.add(new JLabel("Patient Name:"));
//                patientNameField = new JTextField();
//                addConsultationPanel.add(patientNameField);
//                addConsultationPanel.add(new JLabel("Patient Surname:"));
//                patientSurnameField = new JTextField();
