package MODEL.Adress;

/**
 *
 * @author Karlo
 */
public class States {
    private int IDState;
    private String StateName;

    public States(int IDState, String StateName) {
        this.IDState = IDState;
        this.StateName = StateName;
    }

    public int getID(){
        return IDState;
    }
    public String getStateName(){
        return StateName;
    }
    public void setIDState(int id){
        IDState=id;
    }

    @Override
    public String toString() {
        return StateName;
    }
    
}
