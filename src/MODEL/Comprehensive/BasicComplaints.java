package MODEL.Comprehensive;

/**
 *
 * @author Karlo
 */
public class BasicComplaints {
    private int IDBasicComplaints;
    private String StateOfComplaints;
    private String HistoryOfPreviouseTreatment;
    private String HospitalLastTreated;

    public BasicComplaints(String StateOfComplaints, String HistoryOfPreviouseTreatment, String HospitalLastTreated) {
        this.StateOfComplaints = StateOfComplaints;
        this.HistoryOfPreviouseTreatment = HistoryOfPreviouseTreatment;
        this.HospitalLastTreated = HospitalLastTreated;
    }
    

    public BasicComplaints(int IDBasicComplaints, String StateOfComplaints, String HistoryOfPreviouseTreatment, String HospitalLastTreated) {
        this.IDBasicComplaints = IDBasicComplaints;
        this.StateOfComplaints = StateOfComplaints;
        this.HistoryOfPreviouseTreatment = HistoryOfPreviouseTreatment;
        this.HospitalLastTreated = HospitalLastTreated;
    }

    public int getIDBasicComplaints(){
        return IDBasicComplaints;
    }
    public String getStateOfComplaints(){
        return StateOfComplaints;
    }
    public String getHistoryOfPreviouseTreatment(){
        return HistoryOfPreviouseTreatment;
    }
    public String getHospitalLastTreated(){
        return HospitalLastTreated;
    }
    public void setIDBasicComplaints(int id){
        IDBasicComplaints=id;
    }
}
