package BL;

import MODEL.Adress.*;

/**
 *
 * @author Karlo
 */
public class AdressHandler extends HandlerBase{
    public void insertAdress(Adress adress){
        repo.insertAdress(adress);
    }
    public Adress getAdress(int IDAdress){
        return repo.getAdress(IDAdress);
    }
    //-------------------------------------------------------------
    public States getStates(int  IDStates){
        return repo.getStates(IDStates);
    }
    //-------------------------------------------------------------
    public City getCity(int IDCity){
        return repo.getCity(IDCity);
    }
    //-------------------------------------------------------------
    public Street getStreet(int IDStreet){
        return repo.getStreet(IDStreet);
    }
}
