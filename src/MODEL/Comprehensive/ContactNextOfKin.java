package MODEL.Comprehensive;

/**
 *
 * @author Karlo
 */
public class ContactNextOfKin {
    private int IDContactNextOfKin;
    private int NextOfKinID;
    private int AdressID;
    private int ElectronicContactID;

    public ContactNextOfKin(int NextOfKinID, int AdressID, int ElectronicContactID) {
        this.NextOfKinID = NextOfKinID;
        this.AdressID = AdressID;
        this.ElectronicContactID = ElectronicContactID;
    }
    

    public ContactNextOfKin(int IDContactNextOfKin, int NextOfKinID, int AdressID, int ElectronicContactID) {
        this.IDContactNextOfKin = IDContactNextOfKin;
        this.NextOfKinID = NextOfKinID;
        this.AdressID = AdressID;
        this.ElectronicContactID = ElectronicContactID;
    }

    public int getIDContactNextOfKin(){
        return IDContactNextOfKin;
    }
    public int getNextOfKinID(){
        return NextOfKinID;
    }
    public int getAdressID(){
        return AdressID;
    }
    public int getElectronicContactID(){
        return ElectronicContactID;
    }
    public void setIDContactNextOfKin(int id){
        IDContactNextOfKin=id;
    }
}
