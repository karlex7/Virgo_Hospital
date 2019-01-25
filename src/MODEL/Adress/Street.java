package MODEL.Adress;

/**
 *
 * @author Karlo
 */
public class Street{
    private int IDStreet;
    private String StreetName;
    private int CityID;

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
}
