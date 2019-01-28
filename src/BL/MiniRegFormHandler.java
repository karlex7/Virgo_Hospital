package BL;

import MODEL.Mini.*;

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
}
