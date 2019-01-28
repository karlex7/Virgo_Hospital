package MODEL.MedicalPersonnel;

import MODEL.Patient.Person;

/**
 *
 * @author Karlo
 */
public class MedicalPersonnel extends Person{
    private int IDMedicalPersonnel;
    private int PersonID;

    public MedicalPersonnel(int IDMedicalPersonnel, int PersonID, int IDPerson, String FirstName, String MidleName, String Surname) {
        super(IDPerson, FirstName, MidleName, Surname);
        this.IDMedicalPersonnel = IDMedicalPersonnel;
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
