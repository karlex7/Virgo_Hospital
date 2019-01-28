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
    //-------------------------------------------------------------
    public void insertContactDetails(ContactDetails contactDetails){
        repo.insertContactDetails(contactDetails);
    }
    public ContactDetails getContactDetails(int IDContactDetails){
        return repo.getContactDetails(IDContactDetails);
    }
    //-------------------------------------------------------------
    public void insertContactNextOfKin(ContactNextOfKin contactNextOfKin){
        repo.insertContactNextOfKin(contactNextOfKin);
    }
    public ContactNextOfKin getContactNextOfKin(int IDContactNextOfKin){
        return repo.getContactNextOfKin(IDContactNextOfKin);
    }
    //-------------------------------------------------------------
    public void insertPersonalDetails(PersonalDetails personalDetails){
        repo.insertPersonalDetails(personalDetails);
    }
    public PersonalDetails getPersonalDetails(int IDPersonalDetails){
        return repo.getPersonalDetails(IDPersonalDetails);
    }
    //-------------------------------------------------------------
    public void insertProfessionDetails(ProfessionDetails professionDetails){
        repo.insertProfessionDetails(professionDetails);
    }
    public ProfessionDetails getProfessionDetails(int IDProfessionDetails){
        return repo.getProfessionDetails(IDProfessionDetails);
    }
    //-------------------------------------------------------------
    public void insertLifeSytle(LifeStyle lifeStyle){
        repo.insertLifeStyleDetails(lifeStyle);
    }
    public LifeStyle getLifeStyle(int IDLifeStyle){
        return repo.getLifeStyle(IDLifeStyle);
    }
    //-------------------------------------------------------------
    public void insertBasicComplaints(BasicComplaints basicComplaints){
        repo.insertBasicDetails(basicComplaints);
    }
    public BasicComplaints getBasicComplaints(int IDBasicComplaints){
        return repo.getBasicComplaints(IDBasicComplaints);
    }
    //-------------------------------------------------------------
    public void insertImportantMedicalComplaints(ImportantMedicalComplaints importantMedicalComplaints){
        repo.insertImportantMedicalComplaints(importantMedicalComplaints);
    }
    public ImportantMedicalComplaints getImportantMedicalComplaints(int IDImportantMedicalComplaints){
        return repo.getImportantMedicalComplaints(IDImportantMedicalComplaints);
    }
}
