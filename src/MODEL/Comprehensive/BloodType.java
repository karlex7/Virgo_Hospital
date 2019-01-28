package MODEL.Comprehensive;

/**
 *
 * @author Karlo
 */
public class BloodType {
    private int IDBloodType;
    private String BloodTypeName;

    public BloodType(int IDBloodType, String BloodTypeName) {
        this.IDBloodType = IDBloodType;
        this.BloodTypeName = BloodTypeName;
    }
    
    public int getIDBloodType(){
        return IDBloodType;
    }
}
