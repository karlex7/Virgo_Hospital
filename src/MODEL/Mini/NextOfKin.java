package MODEL.Mini;

/**
 *
 * @author Karlo
 */
public class NextOfKin {
    private int IDNextOfKin;
    private int PersonID;
    private String RelationShip;

    public NextOfKin(int PersonID, String RelationShip) {
        this.PersonID = PersonID;
        this.RelationShip = RelationShip;
    }
    public int getIDNextOfKin(){
        return IDNextOfKin;
    }
    
    public int getPersonID(){
        return PersonID;
    }
    public String getRelationShip(){
        return RelationShip;
    }
    public void setIDNextOfKin(int id){
        IDNextOfKin=id;
    }
}
