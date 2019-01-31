package Console;

import BL.MedicalPersonnelHandler;
import BL.PatientsHandler;
import MODEL.MedicalPersonnel.Doctor;
import MODEL.MedicalPersonnel.MedicalPersonnel;
import MODEL.Patient.Patient;
import MODEL.Patient.Person;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Karlo
 */
public class DoctorConsole {
    PatientsHandler patientsHandler=new PatientsHandler();
    MedicalPersonnelHandler medicalPersonnelHandler=new MedicalPersonnelHandler();
    
    public void start(){
        Scanner in=new Scanner(System.in);
        System.out.println("Welcome Doctor\nInsert you ID: ");
        int idDoctor=in.nextInt();
        Doctor d=medicalPersonnelHandler.getDoctor(idDoctor);
        MedicalPersonnel medicalPersonnel=medicalPersonnelHandler.getMedicalPersonnel(d.getMedicalPersonnelID());
        Person person=patientsHandler.getPerson(medicalPersonnel.getPersonID());
        System.out.println("Welcome "+ person.getFirstName());
        
        
        List<Patient> patients=patientsHandler.getPatientsByDoctor(idDoctor);
        for (Patient p : patients) {
            System.out.println("Name: "+p.getFirstName()+" "+p.getMidleName()+" "+p.getSurname()+"\nSex: "+p.getSex()+"Birth Date: "+p.getBirthDate());
        }
    }
    
}
