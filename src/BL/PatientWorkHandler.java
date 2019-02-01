package BL;

import MODEL.PatientWork.*;
import java.util.List;

/**
 *
 * @author Karlo
 */
public class PatientWorkHandler extends HandlerBase{
    public void insertDiagnose(Diagnose diagnose){
        repo.insertDiagnose(diagnose);
    }
    public List<Diagnose> getDianDiagnoseForPatient(int IDPatient){
        return repo.getDiagnosesForPatient(IDPatient);
    }
    //-------------------------------------------------------------
    public void insertLabTestRecommended(LabTestRecommended labTestRecommended){
        repo.insertLabTestRecommended(labTestRecommended);
    }
    public List<LabTestRecommended> getLabTestRecommended(int IDPatient){
        return repo.getLabTestRecommendedsForPatient(IDPatient);
    }
    public LabTest getLabTest(int IDLabTest){
        return repo.getLabTest(IDLabTest);
    }
    //-------------------------------------------------------------
    public void insertPrescribeMedication(MedicationsPrescribed medicationsPrescribed){
        repo.insertMedicationPrescribed(medicationsPrescribed);
    }
    public List<MedicationsPrescribed> getMedicationsPrescribedForPatient(int IDPatient){
        return repo.getMedicationsPrescribedsForPatient(IDPatient);
    }
    public Medication getMedication(int IDMedication){
        return repo.getMedication(IDMedication);
    }
    //-------------------------------------------------------------
    public void insertAppointment(Appointment appointment){
        repo.insertAppointment(appointment);
    }
    public List<Appointment> getAppointmentsForPatient(int IDPatient){
        return repo.getAppointmentsForPatient(IDPatient);
    }
    public Appointment getAppointment(int IDAppointment){
        return repo.getAppointment(IDAppointment);
    }
    //-------------------------------------------------------------
    public void insertConsultingRecommended(ConsultingRecommended consultingRecommended){
        repo.insertConsultingRecommended(consultingRecommended);
    }
    public List<ConsultingRecommended> getConsultingRecommendedForPatient(int IDPatient){
        return repo.getConsultingRecommendedsForPatient(IDPatient);
    }
    public Consulting getConsulting(int IDConsultingRecommended){
        return repo.getConsulting(IDConsultingRecommended);
    }
    public List<Medication> getAllMedications(){
        return repo.getMedications();
    }
    public List<LabTest> getAllLabTests(){
        return repo.getLabTests();
    }
    public List<Consulting> getAllConsultings(){
        return repo.getConsultings();
    }
}
