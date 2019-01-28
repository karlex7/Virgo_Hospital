package BL;

import MODEL.Mini.NextOfKin;

/**
 *
 * @author Karlo
 */
public class NextOfKinHandler extends HandlerBase{
    
    public void insertNextOfKin(NextOfKin nextOfKin){
        repo.insertNextOfKin(nextOfKin);
    }
    public NextOfKin getNextOfKin(int idNextOfKin){
        return repo.getNextOfKin(idNextOfKin);
    }
}
