package MODEL.Comprehensive;

/**
 *
 * @author Karlo
 */
public class ElectronicContact {
    private int IDElectronicContact;
    private String Telephone;
    private String Mobile;
    private String Pager;
    private String Fax;
    private String Email;

    public ElectronicContact(String Telephone, String Mobile, String Pager, String Fax, String Email) {
        this.Telephone = Telephone;
        this.Mobile = Mobile;
        this.Pager = Pager;
        this.Fax = Fax;
        this.Email = Email;
    }

    
    public ElectronicContact(int IDElectronicContact, String Telephone, String Mobile, String Pager, String Fax, String Email) {
        this.IDElectronicContact = IDElectronicContact;
        this.Telephone = Telephone;
        this.Mobile = Mobile;
        this.Pager = Pager;
        this.Fax = Fax;
        this.Email = Email;
    }

    public int getIDElectronicContact(){
        return IDElectronicContact;
    }
    public String getTelephone(){
        return Telephone;
    }
    public String getMobile(){
        return Mobile;
    }
    public String getPager(){
        return Pager;
    }
    public String getFax(){
        return Fax;
    }
    public String getEmail(){
        return Email;
    }
    public void setIDElectronicContact(int id){
        IDElectronicContact=id;
    }
}
