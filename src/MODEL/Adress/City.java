package MODEL.Adress;

/**
 *
 * @author Karlo
 */
public class City{
    private int IDCity;
    private String CityName;
    private int StateID;
    private String ZipCode;

    public City(int IDCity, String CityName, int StateID, String ZipCode) {
        this.IDCity = IDCity;
        this.CityName = CityName;
        this.StateID = StateID;
        this.ZipCode = ZipCode;
    }

    public int getIDCity(){
        return IDCity;
    }
    public String getCityName(){
        return CityName;
    }
    public int getStateID(){
        return StateID;
    }
    public String getZipCode(){
        return ZipCode;
    }
    public void setIDCity(int id){
        IDCity=id;
    }

    @Override
    public String toString() {
        return "City{" + "IDCity=" + IDCity + ", CityName=" + CityName + ", StateID=" + StateID + ", ZipCode=" + ZipCode + '}';
    }
    
}
