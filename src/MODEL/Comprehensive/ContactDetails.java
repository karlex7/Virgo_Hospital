package MODEL.Comprehensive;

/**
 *
 * @author Karlo
 */
public class ContactDetails {
    private int IDContactDetails;
    private int AdressPresentID;
    private int AdressPermanentID;
    private int ElectronicContactID;

    public ContactDetails(int IDContactDetails, int AdressPresentID, int AdressPermanentID, int ElectronicContactID) {
        this.IDContactDetails = IDContactDetails;
        this.AdressPresentID = AdressPresentID;
        this.AdressPermanentID = AdressPermanentID;
        this.ElectronicContactID = ElectronicContactID;
    }

    
    public int getIDContactDetails(){
        return IDContactDetails;
    }
    public int getAdressPresentID(){
        return AdressPresentID;
    }
    public int getAdressPermenantID(){
        return AdressPermanentID;
    }
    public int getElectronicContactID(){
        return ElectronicContactID;
    }
    public void setID(int id){
        IDContactDetails=id;
    }
}
