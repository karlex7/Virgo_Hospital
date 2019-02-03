package BL;

import MODEL.Comprehensive.*;

/**
 *
 * @author Karlo
 */
public class ComprehensiveRegFormHandler extends HandlerBase{

    public void insertComprehensiveRegForm(ComprehensiveRegistrationForm comprehensiveRegistrationForm){
        repo.insertComprehensiveRegForm(comprehensiveRegistrationForm);
    }
    public ComprehensiveRegistrationForm getComprehensiveRegistrationForm(int IDComprehensiveRegForm){
        return repo.getComprehensiveRegistrationForm(IDComprehensiveRegForm);
    }
    public ComprehensiveRegistrationForm getComprehensiveRegistrationFormForPatient(int IDPatient){
        return repo.getComprehensiveForPatient(IDPatient);
    }
    public int checkIfExistComprehensive(int IDPatient){
        return repo.checkIfComprehensiveExist(IDPatient);
    }
    
    //-------------------------------------------------------------
    public int insertContactDetails(ContactDetails contactDetails){
        return repo.insertContactDetails(contactDetails);
    }
    public ContactDetails getContactDetails(int IDContactDetails){
        return repo.getContactDetails(IDContactDetails);
    }
    //-------------------------------------------------------------
    public int insertContactNextOfKin(ContactNextOfKin contactNextOfKin){
        return repo.insertContactNextOfKin(contactNextOfKin);
    }
    public ContactNextOfKin getContactNextOfKin(int IDContactNextOfKin){
        return repo.getContactNextOfKin(IDContactNextOfKin);
    }
    //-------------------------------------------------------------
    public int insertPersonalDetails(PersonalDetails personalDetails){
        return repo.insertPersonalDetails(personalDetails);
    }
    public PersonalDetails getPersonalDetails(int IDPersonalDetails){
        return repo.getPersonalDetails(IDPersonalDetails);
    }
    //-------------------------------------------------------------
    public int insertProfessionDetails(ProfessionDetails professionDetails){
        return repo.insertProfessionDetails(professionDetails);
    }
    public ProfessionDetails getProfessionDetails(int IDProfessionDetails){
        return repo.getProfessionDetails(IDProfessionDetails);
    }
    //-------------------------------------------------------------
    public int insertLifeSytle(LifeStyle lifeStyle){
        return repo.insertLifeStyleDetails(lifeStyle);
    }
    public LifeStyle getLifeStyle(int IDLifeStyle){
        return repo.getLifeStyle(IDLifeStyle);
    }
    //-------------------------------------------------------------
    public int insertBasicComplaints(BasicComplaints basicComplaints){
        return repo.insertBasicDetails(basicComplaints);
    }
    public BasicComplaints getBasicComplaints(int IDBasicComplaints){
        return repo.getBasicComplaints(IDBasicComplaints);
    }
    //-------------------------------------------------------------
    public int insertImportantMedicalComplaints(ImportantMedicalComplaints importantMedicalComplaints){
        return repo.insertImportantMedicalComplaints(importantMedicalComplaints);
    }
    public ImportantMedicalComplaints getImportantMedicalComplaints(int IDImportantMedicalComplaints){
        return repo.getImportantMedicalComplaints(IDImportantMedicalComplaints);
    }
    //-------------------------------------------------------------
    public int insertElectronicContact(ElectronicContact electronicContact){
        return repo.insertElectronicContact(electronicContact);
    }
    public ElectronicContact getElectronicContact(int IDElectronicContact){
        return repo.getElectronicContact(IDElectronicContact);
    }
}
