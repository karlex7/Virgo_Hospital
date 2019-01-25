package MODEL.Adress;

/**
 *
 * @author Karlo
 */
public class State {
    private int IDState;
    private String StateName;

    public State(String StateName) {
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
    
}
