package BL;

import DAL.IRepo;
import DAL.RepoFactory;

/**
 *
 * @author Karlo
 */
public class HandlerBase {
    final IRepo repo;
    public HandlerBase() {
        this.repo = RepoFactory.GetRepo();
    }
    
    
}
