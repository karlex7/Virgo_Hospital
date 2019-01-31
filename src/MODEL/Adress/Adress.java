package MODEL.Adress;

/**
 *
 * @author Karlo
 */
public class Adress {
    private int IDAdress;
    private int StateID;
    private int CityID;
    private int StreetID;
    private String DoorNo;

    public Adress(int StateID, int CityID, int StreetID, String DoorNo) {
        this.StateID = StateID;
        this.CityID = CityID;
        this.StreetID = StreetID;
        this.DoorNo = DoorNo;
    }
    

    public Adress(int IDAdress, int StateID, int CityID, int StreetID, String DoorNo) {
        this.IDAdress = IDAdress;
        this.StateID = StateID;
        this.CityID = CityID;
        this.StreetID = StreetID;
        this.DoorNo = DoorNo;
    }

    
    public int getIDAdress(){
        return IDAdress;
    }
    public int getStateID(){
        return StateID;
    }
    public int getCityID(){
        return CityID;
    }
    public int getStreetID(){
        return StreetID;
    }
    public String getDoorNo(){
        return DoorNo;
    }
    public void setIDAdress(int id){
        IDAdress=id;
    }
}
