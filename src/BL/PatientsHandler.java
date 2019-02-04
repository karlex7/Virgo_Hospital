package BL;

import MODEL.Patient.*;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Karlo
 */
public class PatientsHandler extends HandlerBase{
    public  int insertPerson(Person p){
        return repo.insertPerson(p);
    }
    public Person getPerson(int IDPerson){
        return repo.getPerson(IDPerson);
    }
    
    public int insertPatient(Patient p){
        return repo.insertPatient(p);
    }
    public Patient getPatient(int IDPatient){
        return repo.getPatient(IDPatient);
    }
    public List<Patient> getPatientsByDoctor(int DoctorID){
        List<Patient> patients=repo.getPatientsByDoctor(DoctorID);
        patients.sort(new Comparator<Patient>() {
            @Override
            public int compare(Patient p1, Patient p2) {
                return p1.getSurname().compareTo(p2.getSurname());
            }
        });
        return patients;
    }
    public List<Patient> getPatientsWithNoDoctor(){
        return repo.getPatientsWithNoDoctor();
    }
}
