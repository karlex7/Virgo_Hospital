package MODEL.Comprehensive;

import java.sql.Date;


/**
 *
 * @author Karlo
 */
public class ComprehensiveRegistrationForm {
    private int IDComprehensiveRegistrationForm;
    private int PatientID;
    private Date RegDate;
    private int ContactDetailsID;
    private int ContactNextOfKinID;
    private int PersonalDetailsID;
    private int ProfessionDetailsID;
    private int LifeStyleID;
    private int BasicComplaintsID;
    private int ImportantMedicalComplaintsID;

    public ComprehensiveRegistrationForm(int PatientID, Date RegDate, int ContactDetailsID, int ContactNextOfKinID, int PersonalDetailsID, int ProfessionDetailsID, int LifeStyleID, int BasicComplaintsID, int ImportantMedicalComplaintsID) {
        this.PatientID = PatientID;
        this.RegDate = RegDate;
        this.ContactDetailsID = ContactDetailsID;
        this.ContactNextOfKinID = ContactNextOfKinID;
        this.PersonalDetailsID = PersonalDetailsID;
        this.ProfessionDetailsID = ProfessionDetailsID;
        this.LifeStyleID = LifeStyleID;
        this.BasicComplaintsID = BasicComplaintsID;
        this.ImportantMedicalComplaintsID = ImportantMedicalComplaintsID;
    }
    

    public ComprehensiveRegistrationForm(int IDComprehensiveRegistrationForm, int PatientID, Date RegDate, int ContactDetailsID, int ContactNextOfKinID, int PersonalDetailsID, int ProfessionDetailsID, int LifeStyleID, int BasicComplaintsID, int ImportantMedicalComplaintsID) {
        this.IDComprehensiveRegistrationForm = IDComprehensiveRegistrationForm;
        this.PatientID = PatientID;
        this.RegDate = RegDate;
        this.ContactDetailsID = ContactDetailsID;
        this.ContactNextOfKinID = ContactNextOfKinID;
        this.PersonalDetailsID = PersonalDetailsID;
        this.ProfessionDetailsID = ProfessionDetailsID;
        this.LifeStyleID = LifeStyleID;
        this.BasicComplaintsID = BasicComplaintsID;
        this.ImportantMedicalComplaintsID = ImportantMedicalComplaintsID;
    }

    
    public int getIDComprehensiveRegistrationForm(){
        return IDComprehensiveRegistrationForm;
    }
    public int getPatientID(){
        return PatientID;
    }
    public Date getRegDate(){
        return RegDate;
    }
    public int getContactDetailsID(){
        return ContactDetailsID;
    }
    public int getContactNextOfKinID(){
        return ContactNextOfKinID;
    }
    public int getPersonalDetailsID(){
        return PersonalDetailsID;
    }
    public int getProfessionDetailsID(){
        return ProfessionDetailsID;
    }
    public int getLifeStyleID(){
        return LifeStyleID;
    }
    public int getBasicComplaintsID(){
        return BasicComplaintsID;
    }
    public int getImportantMedicalComplaintsID(){
        return ImportantMedicalComplaintsID;
    }
    public void setIDComprehensiveRegistrationForm(int id){
        IDComprehensiveRegistrationForm=id;
    }
}
