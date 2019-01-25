package MODEL.Comprehensive;

/**
 *
 * @author Karlo
 */
public class ImportantMedicalComplaints {
    private int IDImportantMedicalComplaints;
    private char Diabetic;
    private char  Hypertensive;
    private char CardiacCondition;
    private char RespiratoryCondition;
    private char DigestiveCondition;
    private char OrthopedicCondition;
    private char MuscularCondition;
    private char NeurologicalCondition;
    private String KnownAlergies;
    private String KnownReactionToDrugs;
    private String MajorSurgeries;

    public ImportantMedicalComplaints(char Diabetic, char Hypertensive, char CardiacCondition, char RespiratoryCondition, char DigestiveCondition, char OrthopedicCondition, char MuscularCondition, char NeurologicalCondition, String KnownAlergies, String KnownReactionToDrugs, String MajorSurgeries) {
        this.Diabetic = Diabetic;
        this.Hypertensive = Hypertensive;
        this.CardiacCondition = CardiacCondition;
        this.RespiratoryCondition = RespiratoryCondition;
        this.DigestiveCondition = DigestiveCondition;
        this.OrthopedicCondition = OrthopedicCondition;
        this.MuscularCondition = MuscularCondition;
        this.NeurologicalCondition = NeurologicalCondition;
        this.KnownAlergies = KnownAlergies;
        this.KnownReactionToDrugs = KnownReactionToDrugs;
        this.MajorSurgeries = MajorSurgeries;
    }
    public int getIDImportantMedicalComplaints(){
        return IDImportantMedicalComplaints;
    }
    public char getDiabetic(){
        return Diabetic;
    }
    public char getHypertensive(){
        return Hypertensive;
    }
    public char getCardiacCondition(){
        return CardiacCondition;
    }
    public char getRespiratoryCondition(){
        return RespiratoryCondition;
    }
    public char getDigestiveCondition(){
        return DigestiveCondition;
    }
    public char getOrthopedicCondition(){
        return OrthopedicCondition;
    }
    public char getMuscularCondition(){
        return MuscularCondition;
    }
    public char getNeurologicalCondition(){
        return NeurologicalCondition;
    }
    public String getKnownAlergies(){
        return KnownAlergies;
    }
    public String getKnownReactionToDrugs(){
        return KnownReactionToDrugs;
    }
    public String getMajorSurgeries(){
        return MajorSurgeries;
    }
    public void setIDImportantMedicalComplaints(int id){
        IDImportantMedicalComplaints=id;
    }
}
