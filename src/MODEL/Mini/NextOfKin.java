package MODEL.Mini;

import MODEL.Patient.Person;

/**
 *
 * @author Karlo
 */
public class NextOfKin extends Person{
    private int IDNextOfKin;
    private int PersonID;
    private String RelationShip;

    public NextOfKin(String RelationShip, String FirstName, String MidleName, String Surname) {
        super(FirstName, MidleName, Surname);
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
