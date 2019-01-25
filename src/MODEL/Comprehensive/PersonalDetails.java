package MODEL.Comprehensive;

/**
 *
 * @author Karlo
 */
public class PersonalDetails {
    private int IDPersonalDetails;
    private int MartialStatusID;
    private int NoOfDependets;
    private int HeightPerson;
    private int WeightPerson;
    private int BloodTypeID;

    public PersonalDetails(int MartialStatusID, int NoOfDependets, int HeightPerson, int WeightPerson, int BloodTypeID) {
        this.MartialStatusID = MartialStatusID;
        this.NoOfDependets = NoOfDependets;
        this.HeightPerson = HeightPerson;
        this.WeightPerson = WeightPerson;
        this.BloodTypeID = BloodTypeID;
    }
    public int getIDPersonalDetails(){
        return IDPersonalDetails;
    }
    public int getMartialStatusID(){
        return MartialStatusID;
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
    public int getBloodTypeID(){
        return BloodTypeID;
    }
    public void setIDPersonalDetails(int id){
        IDPersonalDetails=id;
    }
}
