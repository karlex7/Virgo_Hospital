package DAL;

/**
 *
 * @author Karlo
 */
public class RepoFactory {
    public static IRepo GetRepo(){
        return new SqlRepo();
    }
    
}
