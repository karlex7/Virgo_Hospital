package BL;

import MODEL.Mini.NextOfKin;

/**
 *
 * @author Karlo
 */
public class NextOfKinHandler extends HandlerBase{
    
    public int insertNextOfKin(NextOfKin nextOfKin){
        return repo.insertNextOfKin(nextOfKin);
    }
    public NextOfKin getNextOfKin(int idNextOfKin){
        return repo.getNextOfKin(idNextOfKin);
    }
}
