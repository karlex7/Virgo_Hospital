package MODEL.Adress;

/**
 *
 * @author Karlo
 */
public class Street{
    private int IDStreet;
    private String StreetName;
    private int CityID;

    public Street(int IDStreet, String StreetName, int CityID) {
        this.IDStreet = IDStreet;
        this.StreetName = StreetName;
        this.CityID = CityID;
    }

    public int getID(){
        return IDStreet;
    }
    public String getStreetName(){
        return StreetName;
    }
    public int getCityID(){
        return CityID;
    }
    public void setIDStreet(int id){
        IDStreet=id;
    }

    @Override
    public String toString() {
        return "Street{" + "IDStreet=" + IDStreet + ", StreetName=" + StreetName + ", CityID=" + CityID + '}';
    }
    
}
