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
}
