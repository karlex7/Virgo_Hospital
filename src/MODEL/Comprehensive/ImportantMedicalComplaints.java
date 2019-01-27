package MODEL.Comprehensive;

/**
 *
 * @author Karlo
 */
public class ImportantMedicalComplaints {
    private int IDImportantMedicalComplaints;
    private boolean Diabetic;
    private boolean Hypertensive;
    private boolean CardiacCondition;
    private boolean RespiratoryCondition;
    private boolean DigestiveCondition;
    private boolean OrthopedicCondition;
    private boolean MuscularCondition;
    private boolean NeurologicalCondition;
    private String KnownAlergies;
    private String KnownReactionToDrugs;
    private String MajorSurgeries;

    public ImportantMedicalComplaints(boolean Diabetic, boolean Hypertensive, boolean CardiacCondition, boolean RespiratoryCondition, boolean DigestiveCondition, boolean OrthopedicCondition, boolean MuscularCondition, boolean NeurologicalCondition, String KnownAlergies, String KnownReactionToDrugs, String MajorSurgeries) {
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
    public boolean getDiabetic(){
        return Diabetic;
    }
    public boolean getHypertensive(){
        return Hypertensive;
    }
    public boolean getCardiacCondition(){
        return CardiacCondition;
    }
    public boolean getRespiratoryCondition(){
        return RespiratoryCondition;
    }
    public boolean getDigestiveCondition(){
        return DigestiveCondition;
    }
    public boolean getOrthopedicCondition(){
        return OrthopedicCondition;
    }
    public boolean getMuscularCondition(){
        return MuscularCondition;
    }
    public boolean getNeurologicalCondition(){
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
