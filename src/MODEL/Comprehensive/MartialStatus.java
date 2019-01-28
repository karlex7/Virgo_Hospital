package MODEL.Comprehensive;

/**
 *
 * @author Karlo
 */
public class MartialStatus {
    private int IDMartialStatus;
    private String MartialStatusName;

    public MartialStatus(int IDMartialStatus, String MartialStatusName) {
        this.IDMartialStatus = IDMartialStatus;
        this.MartialStatusName = MartialStatusName;
    }
    
   
    public int getIDMartialStatus(){
        return IDMartialStatus;
    }
}
