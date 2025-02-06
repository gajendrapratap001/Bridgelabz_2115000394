import java.util.ArrayList;
import java.util.List;


class Patient {
    private String name;
    private List<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }


    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
            doctor.addPatient(this);
        }
    }


    public void showDoctors() {
        System.out.println(name + " is consulting with:");
        for (Doctor doctor : doctors) {
            System.out.println("  - Dr. " + doctor.getName());
        }
    }
}


class Doctor {
    private String name;
    private List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }


    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this);
        }
    }


    public void consult(Patient patient) {
        System.out.println("Dr. " + name + " is consulting " + patient.getName() + ".");
    }


    public void showPatients() {
        System.out.println("Dr. " + name + " is treating:");
        for (Patient patient : patients) {
            System.out.println("  - " + patient.getName());
        }
    }
}


class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }


    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }


    public void addPatient(Patient patient) {
        patients.add(patient);
    }


    public void showDoctors() {
        System.out.println("Doctors at " + name + ":");
        for (Doctor doctor : doctors) {
            System.out.println("  - Dr. " + doctor.getName());
        }
    }


    public void showPatients() {
        System.out.println("Patients at " + name + ":");
        for (Patient patient : patients) {
            System.out.println("  - " + patient.getName());
        }
    }
}


public class HospitalWithDoctorsPatient {
    public static void main(String[] args) {

        Hospital hospital = new Hospital("City Hospital");


        Doctor doctor1 = new Doctor("Smith");
        Doctor doctor2 = new Doctor("Johnson");


        Patient patient1 = new Patient("Alice");
        Patient patient2 = new Patient("Bob");


        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);


        doctor1.addPatient(patient1);
        doctor1.addPatient(patient2);
        doctor2.addPatient(patient1);


        System.out.println();
        doctor1.showPatients();
        System.out.println();
        doctor2.showPatients();
        System.out.println();


        patient1.showDoctors();
        System.out.println();
        patient2.showDoctors();
        System.out.println();


        System.out.println();
        doctor1.consult(patient1);
        doctor2.consult(patient1);
        doctor1.consult(patient2);
    }
}