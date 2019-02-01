package MODEL.PatientWork;

/**
 *
 * @author Karlo
 */
public class LabTestRecommended {
    private int IDLabtestRecommended;
    private int LabTestID;
    private int PatientID;
    private boolean Paid;

    public LabTestRecommended(int LabTestID, int PatientID) {
        this.LabTestID = LabTestID;
        this.PatientID = PatientID;
    }
    

    public LabTestRecommended(int IDLabtestRecommended, int LabTestID, int PatientID, boolean Paid) {
        this.IDLabtestRecommended = IDLabtestRecommended;
        this.LabTestID = LabTestID;
        this.PatientID = PatientID;
        this.Paid = Paid;
    }

    
    public int getIDLabtestRecommended(){
        return IDLabtestRecommended;
    }
    public int getLabTestID(){
        return LabTestID;
    }
    public int getPatientID(){
        return PatientID;
    }
    public boolean getPaid(){
        return Paid;
    }
    public void setIDLabtestRecommended(int id){
        IDLabtestRecommended=id;
    }
}
