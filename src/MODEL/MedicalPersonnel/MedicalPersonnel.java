package MODEL.MedicalPersonnel;

import MODEL.Patient.Person;

/**
 *
 * @author Karlo
 */
public class MedicalPersonnel extends Person{
    private int IDMedicalPersonnel;
    private int PersonID;

    public MedicalPersonnel(int PersonID, String FirstName, String MidleName, String Surname) {
        super(FirstName, MidleName, Surname);
        this.PersonID = PersonID;
    }

    public int getIDMedicalPersonnel(){
        return IDMedicalPersonnel;
    }
    public int getPersonID(){
        return PersonID;
    }
    public void setIDMedicalPersonnel(int id){
        IDMedicalPersonnel=id;
    }
}
