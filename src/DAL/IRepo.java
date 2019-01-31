package DAL;

import MODEL.Adress.*;
import MODEL.Comprehensive.*;
import MODEL.MedicalPersonnel.*;
import MODEL.Mini.*;
import MODEL.Patient.*;
import MODEL.PatientWork.*;
import java.util.List;


/**
 *
 * @author Karlo
 */
public interface IRepo {
    //INSERT
    int insertPerson(Person p);
    int insertPatient(Patient p);
    int insertNextOfKin(NextOfKin nextOfKin);
    int insertMiniRegForm(MiniRegForm miniRegForm);
    int insertAdress(Adress adress);
    int insertElectronicContact(ElectronicContact electronicContact);
    int insertContactDetails(ContactDetails contactDetails);
    int insertContactNextOfKin(ContactNextOfKin contactNextOfKin);
    int insertPersonalDetails(PersonalDetails personalDetails);
    int insertProfessionDetails(ProfessionDetails professionDetails);
    int insertLifeStyleDetails(LifeStyle lifeStyle);
    int insertBasicDetails(BasicComplaints basicComplaints);
    int insertImportantMedicalComplaints(ImportantMedicalComplaints importantMedicalComplaints);
    int insertComprehensiveRegForm(ComprehensiveRegistrationForm comprehensiveRegistrationForm);
    int insertDiagnose(Diagnose diagnose);
    int insertLabTestRecommended(LabTestRecommended labTestRecommended);
    int insertMedicationPrescribed(MedicationsPrescribed medicationsPrescribed);
    int insertConsultingRecommended(ConsultingRecommended consultingRecommended);
    int insertAppointment(Appointment appointment);
    
    //GET
    Person getPerson(int IDPerson);
    Patient getPatient(int IDPatient);
    NextOfKin getNextOfKin(int IDNextOfKin);
    MiniRegForm getMiniRegForm(int IDPatient);
    Adress getAdress(int IDAdress);
    States getStates(int IDStates);
    City getCity(int IDCity);
    Street getStreet(int IDStreet);
    ElectronicContact getElectronicContact(int IDElectronicContact);
    ContactDetails getContactDetails(int IDContactDetails);
    ContactNextOfKin getContactNextOfKin(int IDContactNextOfKin);
    PersonalDetails getPersonalDetails(int IDPersonalDetails);
    ProfessionDetails getProfessionDetails(int IDProfessionDetails);
    LifeStyle getLifeStyle(int IDLifeStyle);
    BasicComplaints getBasicComplaints(int IDBasicComplaints);
    ImportantMedicalComplaints getImportantMedicalComplaints(int IDImportantMedicalComplaints);
    ComprehensiveRegistrationForm getComprehensiveRegistrationForm(int IDComprehensiveRegistrationForm);
    MedicalPersonnel getMedicalPersonnel(int IDMedicalPersonnel);
    Doctor getDoctor(int IDDoctor);
    SpecialistConsultant getSpecialistConsultant(int IDScepicalistConsultant);
    LabTest getLabTest(int IDLabtest);
    Medication getMedication(int IDMedication);
    Consulting getConsulting(int IDConsulting);
    Appointment getAppointment(int IDAppointment);
    Diagnose getDiagnose(int IDDiagnose);
    
    
    List<Patient> getPatientsByDoctor(int DoctorID);
    List<Diagnose> getDiagnosesForPatient(int PatientID);
    List<LabTestRecommended> getLabTestRecommendedsForPatient(int PatientID);
    List<MedicationsPrescribed> getMedicationsPrescribedsForPatient(int PatientID);
    List<ConsultingRecommended> getConsultingRecommendedsForPatient(int PatientID);
    List<Appointment> getAppointmentsForPatient(int PatientID);
    List<Medication> getMedications();
    List<LabTest> getLabTests();
    List<Consulting> getConsultings();
    List<States> getAllStateses();
    List<City> getAllCity();
    List<Street> getAllStreets();
    
    int getCityIdByName(String CityName);
    int getStreetIdByName(String StreetName);
    int getStateIdByName(String StateName);
    
    //UPDATE
    void asignDoctorToPatient(int PatientID, int DoctorID);
    void payLabTest(int LabTestRecommended);
    void payMedication(int MedicationPrescribed);
    void payConsulting(int ConsultingRecommended);
}
