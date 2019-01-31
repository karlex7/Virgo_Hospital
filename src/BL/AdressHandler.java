package BL;

import MODEL.Adress.*;
import java.util.List;

/**
 *
 * @author Karlo
 */
public class AdressHandler extends HandlerBase{
    public int insertAdress(Adress adress){
        return repo.insertAdress(adress);
    }
    public Adress getAdress(int IDAdress){
        return repo.getAdress(IDAdress);
    }
    //-------------------------------------------------------------
    public States getStates(int  IDStates){
        return repo.getStates(IDStates);
    }
    public List<States> getAllStates(){
        return repo.getAllStateses();
    }
    public int GetStateIdByName(String StateName){
        return repo.getStateIdByName(StateName);
    }
    //-------------------------------------------------------------
    public City getCity(int IDCity){
        return repo.getCity(IDCity);
    }
    public List<City> getAllCitys(){
        return repo.getAllCity();
    }
    public int getCityIdByName(String cityName){
        return repo.getCityIdByName(cityName);
    }
    //-------------------------------------------------------------
    public Street getStreet(int IDStreet){
        return repo.getStreet(IDStreet);
    }
    public List<Street> getAllStreets(){
        return repo.getAllStreets();
    }
    public int getStreetIdByName(String streetName){
        return repo.getStreetIdByName(streetName);
    }
}
