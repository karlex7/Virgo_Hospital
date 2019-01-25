package MODEL.PatientWork;

/**
 *
 * @author Karlo
 */
public class LabTestRecommended {
    private int IDLabtestRecommended;
    private int LabTestID;
    private int PatientID;
    private char Paid;

    public LabTestRecommended(int LabTestID, int PatientID, char Paid) {
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
    public char getPaid(){
        return Paid;
    }
    public void setIDLabtestRecommended(int id){
        IDLabtestRecommended=id;
    }
}
