package MODEL.Comprehensive;

/**
 *
 * @author Karlo
 */
public class PersonalDetails {
    private int IDPersonalDetails;
    private boolean MartialStatus;
    private int NoOfDependets;
    private int HeightPerson;
    private int WeightPerson;
    private String BloodTypeID;

    public PersonalDetails(boolean MartialStatusID, int NoOfDependets, int HeightPerson, int WeightPerson, String BloodTypeID) {
        this.MartialStatus = MartialStatusID;
        this.NoOfDependets = NoOfDependets;
        this.HeightPerson = HeightPerson;
        this.WeightPerson = WeightPerson;
        this.BloodTypeID = BloodTypeID;
    }
    

    public PersonalDetails(int IDPersonalDetails, boolean MartialStatusID, int NoOfDependets, int HeightPerson, int WeightPerson, String BloodTypeID) {
        this.IDPersonalDetails = IDPersonalDetails;
        this.MartialStatus = MartialStatusID;
        this.NoOfDependets = NoOfDependets;
        this.HeightPerson = HeightPerson;
        this.WeightPerson = WeightPerson;
        this.BloodTypeID = BloodTypeID;
    }

    
    public int getIDPersonalDetails(){
        return IDPersonalDetails;
    }
    public boolean getMartialStatus(){
        return MartialStatus;
    }
    public int getNoOfDependets(){
        return NoOfDependets;
    }
    public int getHeightPerson(){
        return HeightPerson;
    }
    public int getWeightPerson(){
        return WeightPerson;
    }
    public String getBloodType(){
        return BloodTypeID;
    }
    public void setIDPersonalDetails(int id){
        IDPersonalDetails=id;
    }
}
