package BL;

import MODEL.Mini.*;
import java.util.List;

/**
 *
 * @author Karlo
 */
public class MiniRegFormHandler extends HandlerBase {
    
    public void insertMiniRegForm(MiniRegForm miniRegForm){
        repo.insertMiniRegForm(miniRegForm);
    }
    
    public MiniRegForm getMiniRegForm(int patientID){
        return repo.getMiniRegForm(patientID);
    }
    public List<MiniRegForm> getAllMiniRegForms(){
        return repo.getAllMiniRegForms();
    }
    public int chechIfMiniExist(int IDPatient){
        return repo.checkIfMiniExist(IDPatient);
    }
}
