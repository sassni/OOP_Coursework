//public class Person {
//}
public class Person_1 {
    private String name;
    private String surname;
    private Date dob;
    private String mobileNumber;

    public Person(String name, String surname, Date dob, String mobileNumber) {
        this.name = name;
        this.surname = surname;
        this.dob = dob;
        this.mobileNumber = mobileNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getDob() {
        return dob;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}

//public class Doctor extends Person {
//    private String specialty;
//    private String hospital;
//
//    public Doctor(String name, String surname, Date dob, String mobileNumber, String specialty, String hospital) {
//        super(name, surname, dob, mobileNumber);
//        this.specialty = specialty;
//        this.hospital = hospital;
//    }
//
//    public String getSpecialty() {
//        return specialty;
//    }
//
//    public String getHospital() {
//        return hospital;
//    }
//}
public class Doctor extends Person {
    private String medicalLicenseNumber;
    private String specialty;
    private String hospital;

    public Doctor(String name, String surname, Date dob, String mobileNumber, String medicalLicenseNumber, String specialty, String hospital) {
        super(name, surname, dob, mobileNumber);
        this.medicalLicenseNumber = medicalLicenseNumber;
        this.specialty = specialty;
        this.hospital = hospital;
    }

    public String getMedicalLicenseNumber() {
        return medicalLicenseNumber;
    }

    public void setMedicalLicenseNumber(String medicalLicenseNumber) {
        this.medicalLicenseNumber = medicalLicenseNumber;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
}


//public class Patient extends Person {
//    private String medicalRecordNumber;
//
//    public Patient(String name, String surname, Date dob, String mobileNumber, String medicalRecordNumber) {
//        super(name, surname, dob, mobileNumber);
//        this.medicalRecordNumber = medicalRecordNumber;
//    }
//
//    public String getMedicalRecordNumber() {
//        return medicalRecordNumber;
//    }
//}
public class Patient extends Person {
    private String medicalRecordNumber;
    private String patientId;

    public Patient(String name, String surname, Date dob, String mobileNumber, String medicalRecordNumber, String patientId) {
        super(name, surname, dob, mobileNumber);
        this.medicalRecordNumber = medicalRecordNumber;
        this.patientId = patientId;
    }

    public String getMedicalRecordNumber() {
        return medicalRecordNumber;
    }

    public void setMedicalRecordNumber(String medicalRecordNumber) {
        this.medicalRecordNumber = medicalRecordNumber;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }
}

